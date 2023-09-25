package com.ma.SpringMvcTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * projectName: ssm-springmvc-part
 * {@code @author: ma }
 * 2023 09 25 11:37 AM
 * description:
 */


@Controller
@RequestMapping("path")
@ResponseBody
public class PathRequest {


    @RequestMapping("{username}/{password}")
    public String GetPath(@PathVariable(name = "username") String username1,@PathVariable(name = "password") String pwd){
        System.out.println("username = " + username1 + ", password = " + pwd);
        return "username = " + username1 + ", password = " + pwd;
    }
}
