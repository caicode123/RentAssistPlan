package com.caicode.lease.web.app.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.caicode.lease.common.constant.RedisConstant;
import com.caicode.lease.common.exception.LeaseException;
import com.caicode.lease.common.result.ResultCodeEnum;
import com.caicode.lease.common.utils.CodeUtil;
import com.caicode.lease.common.utils.JwtUtil;
import com.caicode.lease.model.entity.BaseEntity;
import com.caicode.lease.model.entity.UserInfo;
import com.caicode.lease.model.enums.BaseStatus;
import com.caicode.lease.web.app.mapper.UserInfoMapper;
import com.caicode.lease.web.app.service.LoginService;
import com.caicode.lease.web.app.service.SmsService;
import com.caicode.lease.web.app.vo.user.LoginVo;
import com.caicode.lease.web.app.vo.user.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private SmsService smsService;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public void getCode(String phone) {
        //生成6位随机验证码
        String randomCode = CodeUtil.getRandomCode(6);
        String ksy = RedisConstant.APP_LOGIN_PREFIX + phone;

        //限制用户请求频率
        Boolean hasKey = redisTemplate.hasKey(ksy);
        if (hasKey){
            Long ttl = redisTemplate.getExpire(ksy, TimeUnit.SECONDS);
            if(RedisConstant.APP_LOGIN_CODE_TTL_SEC - ttl < RedisConstant.APP_LOGIN_CODE_RESEND_TIME_SEC){
                throw new LeaseException(ResultCodeEnum.APP_SEND_SMS_TOO_OFTEN);
            }
        }

        //验证码存入redis
        smsService.sendCode(phone, randomCode);
        redisTemplate.opsForValue().set(ksy, randomCode, RedisConstant.APP_LOGIN_CODE_TTL_SEC, TimeUnit.SECONDS);
    }

    @Override
    public String login(LoginVo loginVo) {

        //验证手机号不为空
        if (loginVo.getPhone() == null){
            throw new LeaseException(ResultCodeEnum.APP_LOGIN_PHONE_EMPTY);
        }

        //验证验证码不为空
        if (loginVo.getCode() == null){
            throw new LeaseException(ResultCodeEnum.APP_LOGIN_CODE_EMPTY);
        }

        //拿到key和code
        String key = RedisConstant.APP_LOGIN_PREFIX + loginVo.getPhone();
        String code = redisTemplate.opsForValue().get(key);

        //验证验证码是否正确
        if (code == null){
            throw new LeaseException(ResultCodeEnum.APP_LOGIN_CODE_EXPIRED);
        }
        if (!code.equals(loginVo.getCode())){
            throw new LeaseException(ResultCodeEnum.APP_LOGIN_CODE_ERROR);
        }

        //验证用户是否存在
        LambdaQueryWrapper<UserInfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(UserInfo::getPhone, loginVo.getPhone());
        UserInfo userInfo = userInfoMapper.selectOne(queryWrapper);
        if (userInfo == null){
           //用户不存在则进行注册
            userInfo = new UserInfo();
            userInfo.setPhone(loginVo.getPhone());
            userInfo.setStatus(BaseStatus.ENABLE);
            //默认昵称为用户-手机尾号后四位
            userInfo.setNickname("用户-"+loginVo.getPhone().substring(7));
            userInfoMapper.insert(userInfo);
        }
        else {
            //验证用户是否被禁用
            if (userInfo.getStatus() == BaseStatus.DISABLE){
                throw new LeaseException(ResultCodeEnum.APP_ACCOUNT_DISABLED_ERROR);
            }
        }
        return JwtUtil.createToken(userInfo.getId(), userInfo.getPhone());
    }

    @Override
    public UserInfoVo getLoginUserById(Long userId) {
        UserInfo userInfo = userInfoMapper.selectById(userId);
        UserInfoVo userInfoVo = new UserInfoVo(userInfo.getNickname(), userInfo.getAvatarUrl());
        return userInfoVo;
    }
}
