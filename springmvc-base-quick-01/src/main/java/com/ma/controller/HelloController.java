package com.ma.controller;

/* *
 * @author mtc
 * @date 15:27 09 24 15:27
 *
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloController {
    // 定义handler -> springmvc/hello   return "hello springmvc"


    @RequestMapping("springmvc/hello")   // 对外访问的地址  到handlerMapping注册的注解
    public String hello(){
        System.out.println("HelloController,hello");
        return "hello,springmvc!";
    }
}
