package com.caicode.lease.web.app.service.impl;

import com.caicode.lease.web.app.service.SmsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SmsServiceImplTest {

    @Autowired
    private SmsService smsService;
    @Test
    void sendCode() {
        smsService.sendCode("18767699932","123456");
    }
}