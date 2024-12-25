package com.caicode.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.caicode.lease.common.constant.RedisConstant;
import com.caicode.lease.common.exception.LeaseException;
import com.caicode.lease.common.result.ResultCodeEnum;
import com.caicode.lease.common.utils.JwtUtil;
import com.caicode.lease.model.entity.SystemUser;
import com.caicode.lease.model.enums.BaseStatus;
import com.caicode.lease.web.admin.mapper.SystemUserMapper;
import com.caicode.lease.web.admin.service.LoginService;
import com.caicode.lease.web.admin.vo.login.CaptchaVo;
import com.caicode.lease.web.admin.vo.login.LoginVo;
import com.wf.captcha.SpecCaptcha;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private SystemUserMapper systemUserMapper;

    /**
     * 获取验证码
     * @return
     */
    @Override
    public CaptchaVo getCaptcha() {
        //创建验证码
        SpecCaptcha specCaptcha = new SpecCaptcha(130, 48, 4);

        //不区分大小写
        String code = specCaptcha.text().toLowerCase();
        //生成UUID
        String key = RedisConstant.ADMIN_LOGIN_PREFIX + UUID.randomUUID();
        //将验证码存入redis
        stringRedisTemplate.opsForValue().set(key, code,RedisConstant.ADMIN_LOGIN_CAPTCHA_TTL_SEC, TimeUnit.SECONDS);

        return new CaptchaVo(specCaptcha.toBase64(),key);
    }

    /**
     * 登录
     * @param loginVo
     * @return
     */
    @Override
    public String login(LoginVo loginVo) {
        //1.先判断是否输入了验证码
        if (loginVo == null) {
            throw new LeaseException(ResultCodeEnum.ADMIN_CAPTCHA_CODE_NOT_FOUND);
        }

        //2.判断验证码是否正确
        String code = stringRedisTemplate.opsForValue().get(loginVo.getCaptchaKey());
        if(code == null){
            throw new LeaseException(ResultCodeEnum.ADMIN_CAPTCHA_CODE_EXPIRED);
        }
        if(!code.equals(loginVo.getCaptchaCode().toLowerCase())){
            throw new LeaseException(ResultCodeEnum.ADMIN_CAPTCHA_CODE_ERROR);
        }

        //3.判断用户状态
        SystemUser systemUser = systemUserMapper.selectOneByUsername(loginVo.getUsername());
        if(systemUser == null){
            throw new LeaseException(ResultCodeEnum.ADMIN_ACCOUNT_NOT_EXIST_ERROR);
        }
        if (systemUser.getStatus() == BaseStatus.DISABLE) {
            throw new LeaseException(ResultCodeEnum.ADMIN_ACCOUNT_DISABLED_ERROR);
        }

        //密码校验
        if (!systemUser.getPassword().equals(DigestUtils.md5Hex(loginVo.getPassword()))) {
            throw new LeaseException(ResultCodeEnum.ADMIN_ACCOUNT_ERROR);
        }
        return JwtUtil.createToken(systemUser.getId(),systemUser.getUsername());
    }
}
