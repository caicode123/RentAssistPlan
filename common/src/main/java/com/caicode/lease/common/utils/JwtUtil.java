package com.caicode.lease.common.utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.util.Date;

public class JwtUtil {
    //token过期时间
    private static long tokenExpiration = 60 * 60 * 1000L;

    //token签名
    private static SecretKey tokenSignKey = Keys.hmacShaKeyFor("M0PKKI6pYGVWWfDZw90a0lTpGYX1d4AQ".getBytes());

    /**
     * 生成token
     * @param userId
     * @param username
     * @return
     */
    public static String createToken(Long userId, String username){
        String token = Jwts.builder().
                setSubject("USER_INFO").
                setExpiration(new Date(System.currentTimeMillis() + tokenExpiration)).
                claim("userId", userId).
                claim("username", username).
                signWith(tokenSignKey).
                compact();
        return token;
    }

    public static void main(String[] args) {
        System.out.println(createToken(1L, "zhangsan"));
    }
}
