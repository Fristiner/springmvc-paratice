package com.ma.api;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * projectName: ssm-springmvc-part
 * {@code @author: ma }
 * 2023 09 25 2:17 PM
 * description:
 */


@Controller
@RequestMapping("api")

public class ApiController {


    // ioc ServletContext 会自动装入到ioc容器中。
    @Autowired
    private ServletContext servletContext;


    public void data(HttpServletResponse response,
                     HttpServletRequest request,
                     HttpSession session){

    }
}
