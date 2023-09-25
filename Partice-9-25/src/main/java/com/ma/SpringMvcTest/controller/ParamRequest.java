package com.ma.SpringMvcTest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * projectName: ssm-springmvc-part
 * {@code @author: ma }
 * 2023 09 25 11:16 AM
 * description:
 */

@Controller
@RequestMapping("param")
@ResponseBody
public class ParamRequest {
    //

    @RequestMapping("url")
    public String add(@RequestParam(value = "name") String name,@RequestParam(value = "age") int age1){
        System.out.println("name = " + name + ", age = " + age1);
        return "name = " + name + ", age = " + age1;
    }
    
}
