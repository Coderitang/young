package com.young.windbell.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Calendar;
import java.util.Map;

/**
 * @description: jwt
 * @author: young
 * @create: 2024-04-01 11:47
 **/
public class JwtUtils {

    public static String getJwt(Map<String, Object> userMap) {
        Calendar instance = Calendar.getInstance();
        //默认令牌过期时间7天
        instance.add(Calendar.MINUTE, 2);
        JWTCreator.Builder builder = JWT.create();
        builder.withClaim("userName", String.valueOf(userMap.get("userName")));
        return builder.withExpiresAt(instance.getTime())
                .sign(Algorithm.HMAC256("YOUNG"));
    }

}
