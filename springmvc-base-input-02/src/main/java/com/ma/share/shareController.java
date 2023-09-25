package com.ma.share;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * projectName: ssm-springmvc-part
 * {@code @author: ma }
 * 2023 09 25 2:24 PM
 * description: 共享域 对象的获取
 */

@Controller
@RequestMapping("share")
@ResponseBody
public class shareController {
    //全局最大共享域
    @Autowired
    private ServletContext servletContext;

    // 原生api获取
    public void data(HttpServletRequest request, HttpSession session){

    }

    //Springmvc 提供的方法： request提供了几种

}
