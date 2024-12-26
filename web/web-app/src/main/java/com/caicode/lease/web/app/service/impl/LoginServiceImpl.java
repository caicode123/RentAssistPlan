package com.caicode.lease.web.app.service.impl;

import com.caicode.lease.common.constant.RedisConstant;
import com.caicode.lease.common.exception.LeaseException;
import com.caicode.lease.common.result.ResultCodeEnum;
import com.caicode.lease.common.utils.CodeUtil;
import com.caicode.lease.web.app.service.LoginService;
import com.caicode.lease.web.app.service.SmsService;
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
}
