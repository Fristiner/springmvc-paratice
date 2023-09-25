package com.ma.SpringMvcTest.controller;

import com.ma.SpringMvcTest.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * json request
 *
 * @author ma
 * @date 2023/09/25
 */
@Controller
@RequestMapping("json")
@ResponseBody
public class JsonRequest {

    /**
     * json get
     *
     * @param user user
     * @return string
     */
    @RequestMapping("js")
    public String JsonGet(@RequestBody User user)
    {
        System.out.println("user = " + user);
        return "user = "+user;
    }
}
