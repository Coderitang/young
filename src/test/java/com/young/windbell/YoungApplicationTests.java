package com.young.windbell;


import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.young.windbell.jwt.JwtUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
@SpringBootTest
class YoungApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testJwt() {
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("userName","ss");
        String jwt = JwtUtils.getJwt(userMap);
        System.out.println(jwt);
    }
}
