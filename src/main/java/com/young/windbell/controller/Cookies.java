package com.young.windbell.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: Cookies
 * @author: young
 * @create: 2024-03-27 15:46
 **/
@RestController
public class Cookies {

    @GetMapping("sc")
    public void setCookies(HttpServletResponse httpServletResponse) {
        httpServletResponse.addCookie(new Cookie("young", "001"));
    }

    @GetMapping("gc")
    public void getCookies(HttpServletRequest httpServletRequest) {
        Cookie[] cookies = httpServletRequest.getCookies();
        for(Cookie cookie:cookies) {
            System.out.printf(cookie.getName());
            System.out.printf(cookie.getValue());
        }
    }

    @GetMapping("gs")
    public void getSession(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session = req.getSession();
        session.setMaxInactiveInterval(1*15);
    }

    @GetMapping("dd")
    public String ddSession(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session = req.getSession(false);
        if(session == null) {
            return "请登录";
        }
        else {
            return "session有";
        }
    }


}
