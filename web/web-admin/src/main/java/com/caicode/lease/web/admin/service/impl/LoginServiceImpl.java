package com.caicode.lease.web.admin.service.impl;

import com.caicode.lease.common.constant.RedisConstant;
import com.caicode.lease.web.admin.service.LoginService;
import com.caicode.lease.web.admin.vo.login.CaptchaVo;
import com.wf.captcha.SpecCaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

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
}
