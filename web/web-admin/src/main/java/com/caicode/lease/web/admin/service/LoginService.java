package com.caicode.lease.web.admin.service;

import com.caicode.lease.web.admin.vo.login.CaptchaVo;
import com.caicode.lease.web.admin.vo.login.LoginVo;
import com.caicode.lease.web.admin.vo.system.user.SystemUserInfoVo;

public interface LoginService {

    CaptchaVo getCaptcha();

    String login(LoginVo loginVo);

    SystemUserInfoVo getLoginUserInfoById(Long userId);
}
