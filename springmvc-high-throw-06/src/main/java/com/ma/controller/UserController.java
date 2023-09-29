package com.ma.controller;

/* *
 * @packing com.ma.controller
 * @author mtc
 * @date 10:12 09 29 10:12
 *
 */


import com.ma.pojo.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("data")
    public String data(){
//        // 空指针异常
//        String name = null;
//        name.toString();
        return "ok";
    }

    @GetMapping("data1")
    public String data1(){
        // 算术异常
//        int i = 1/0;
        return "ok";
    }
    /*TODO：
    *  1.实体类属性添加校验注解
    *  2.handler(@Validated 实体类 对象)
    *  3.param | json 校验注解都有效果
    *  json参数  @RequestBody
    *  如果出现错误信息需要捕捉错误信息
    *  1.handler方法中加入BindingResult  要求 ： 必须紧挨着校验对象。
    *  2.bindingResult获取绑定错误
    * */
    @RequestMapping("register")
    public Object register(@Validated @RequestBody User user, BindingResult result){

        if (result.hasErrors())
        {
            Map<Object,Object> data1 = new HashMap<>();
            data1.put("code",400);
            data1.put("msg","参数校验异常");
            return data1;

        }
        System.out.println("user = " + user);
        return user;
    }

    @RequestMapping("map")
    public Object map(){
        HashMap<Object, Object> obj = new HashMap<>();
        obj.put("aa","asdasd");
        obj.put("asd","你好呀");
        return obj;
    }


}
