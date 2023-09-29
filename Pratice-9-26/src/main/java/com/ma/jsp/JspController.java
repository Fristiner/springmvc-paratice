package com.ma.jsp;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/* *
 * @packing com.ma.jsp
 * @author mtc
 * @date 11:06 09 27 11:06
 *
 */
@Component
public class JspController {
    @RequestMapping("index")
    public String index(HttpServletRequest request){
        request.setAttribute("data","hello jsp!");
        System.out.println("JspController.index");
        return "index";
    }

}
