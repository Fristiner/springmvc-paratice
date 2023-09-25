package com.ma.header;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * projectName: ssm-springmvc-part
 * {@code @author: ma }
 * 2023 09 25 2:13 PM
 * description:
 */


@Controller
@RequestMapping("header")
@ResponseBody
public class HeaderController {

    @RequestMapping("data")
    public String header(@RequestHeader("Host")String ho){
        System.out.println("ho = " + ho);
        return ho;
        
    }
}
