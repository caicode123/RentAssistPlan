package com.caicode.lease.common.utils;

import java.util.Random;

public class CodeUtil {

    /**
     * 获取随机验证码
     * @param length
     * @return
     */
    public static String getRandomCode(Integer length) {
        // 使用StringBuilder来拼接字符串
        StringBuilder builder = new StringBuilder();
        // 创建随机数对象
        Random random = new Random();
        for (Integer i = 0; i < length; i++) {
            int num = random.nextInt(10);
            builder.append(num);
        }
        return builder.toString();
    }
}
