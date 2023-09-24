package com.ma.param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * projectName: ssm-springmvc-part
 * {@code @author: ma }
 * 2023 09 24 9:45 PM
 * description: 路径传入参数
 */

@Controller
@RequestMapping("path")
@ResponseBody
public class PathController {

    // TODO:
    //  path/账号/mima
    //  动态路径设计
    //  {key} = * {key} 在形参列表中获取传入的参数
    //  接受路径参数 String account , String password -> 接受param参数
    //  必须使用@PathVariable

    @RequestMapping("{account}/{password}")
    public String Login(@PathVariable(value = "account") String account,@PathVariable String password)
    {
        System.out.println("account = " + account + ", password = " + password);
        return "account = " + account + ", password = " + password;
    }
}
