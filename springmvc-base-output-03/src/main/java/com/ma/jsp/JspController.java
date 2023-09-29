package com.ma.jsp;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * projectName: ssm-springmvc-part
 * {@code @author: ma }
 * 2023 09 25 2:55 PM
 * description:
 */

@Controller
@RequestMapping("jsp")
public class JspController {
    // TODO: 快速查找试图
    //  1.方法的返回值是字符串类型
    //  2.不能添加@ResponseBody，直接返回字符串给浏览器
    //  3. 返回值  对应中间的试图名称



    @GetMapping("index")
    public String index(HttpServletRequest request){
        request.setAttribute("data","hello jsp!");
        System.out.println("JspController.index");
        return "index";
    }

    //TODO:转发｜重定向
    // 1.方法的返回值写成字符串
    // 2.不能添加@ResponseBody注解
    // 3.返回的字符串前forward：/转发地址
    @GetMapping("forward")
    public String forward()
    {
        return "forward:/jsp/index";
    }

    //TODO：重定向
    // 1.方法返回值写成字符串类型
    // 2.不能添加@ResponseBody注解
    // 3.返回字符串前面 redirect:/重定向的地址


    //TODO:路径细节：
    //  1.转发是项目下的资源跳转，路径 ： 项目下的路径
    //  2.重定向项目下的资源可以是项目外的地址  重定向属于二次请求  路径： 项目下的地址
    //  使用springmvc路径的语法
    //  "forward: 路径｜ redirect: 路径 " 重定向，资源的地址也不需要写项目的根路径  /jsp/index
    //  转发和重定向的地址都一样了。
    @GetMapping("redirect")
    public String redirect(){
        System.out.println("JspController.redirect");
        return "redirect:https://www.huya.com";
    }


}
