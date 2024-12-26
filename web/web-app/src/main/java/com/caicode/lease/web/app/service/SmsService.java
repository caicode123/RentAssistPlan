package com.caicode.lease.web.app.service;

public interface SmsService {
    void sendCode(String phone, String verifyCode);
}
