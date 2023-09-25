package com.ma.param;

import com.ma.pojo.Person;
import jakarta.ws.rs.POST;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * projectName: ssm-springmvc-part
 * {@code @author: ma }
 * 2023 09 24 9:56 PM
 * description:
 */

@Controller
@RequestMapping("json")
@ResponseBody
public class JsonController {
    // TODO: Json
    //  data -> 请求体 post 方式
    //  415异常 不支持数据类型  java原生只支持路径参数和param参数
    //  解决： 1.导入json处理的依赖。 2.handlerAdpater配置json转化器


    @PostMapping("data")
    public String data(@RequestBody Person person)
    {
        System.out.println("person = " + person);
        return "person = " + person;
    }
}
