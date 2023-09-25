package com.ma.cookie;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * projectName: ssm-springmvc-part
 * {@code @author: ma }
 * 2023 09 25 2:07 PM
 * description: 接收cookie对象
 */

@Controller
@RequestMapping("cookie")
public class CookieController {

    @ResponseBody
    @RequestMapping("data")
    public String data(@CookieValue(value = "cookieName")String cookie)
    {
        System.out.println("cookie = " + cookie);
        return cookie;
    }

    @ResponseBody
    @GetMapping("save")
    public String save(HttpServletResponse response)
    {
        Cookie cookie = new Cookie("cookieName","root");
        response.addCookie(cookie);
        return "ok";
    }

}
