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
}
