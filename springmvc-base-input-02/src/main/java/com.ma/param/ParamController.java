package com.ma.param;

import com.ma.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * projectName: ssm-springmvc-part
 * {@code @author: ma }
 * 2023 09 24 8:56 PM
 * description: 如何接受前端的param参数
 */

@Controller
@RequestMapping("param")

public class ParamController {
    //TODO: 直接接收参数
    // /param/data?name=root&age=18
    // 形参列表，填写对应名称的参数即可！  请求参数名 = 形参参数即可
    // 1.名称相同 2.可以不传递，不报错
    @RequestMapping("data")
    @ResponseBody
    public String data(String name,int age){
        System.out.println("name = " + name + ", age = " + age);
        return "name = "+name+", age = "+age;
    }
    //TODO: 注解指定
    // 指定任意的请求参数名 要求必须传递 要求不必须传递 给一个默认值
    // /param/data1?account=root&page=1
    // account必须传递 page可以不必须传递 如果不传递默认值为1
    // @RequestParam -> 形参列表  指定请求参数名 是否必须传递 或者 非必须传递设置默认值
    //   不传 会报错400异常！
    //
    /*
    *
    * */

    @GetMapping("data1")
    @ResponseBody
    public String data1(@RequestParam(value = "account") String username,@RequestParam(required = false,defaultValue = "1") int page){
        System.out.println("account = " + username + ", page = " + page);
        return "account = "+ username + " , page = "+page;
    }

    // TODO: 特殊值
    //  一名多值 key=1&key=2  直接使用集合接受值
    //  param/data2?hbs=吃&hbs=玩
    //  集合必须要加入@RequestParam注解
    @GetMapping("data2")
    @ResponseBody
    public String data2(@RequestParam(value = "hbs") List<String> param)
    {
        System.out.println("hbs = " + param);
        return "ok";
    }


    // TODO: 使用实体对象接值  用户注册（用户的信息） -》 插入到数据库的表
    //  param/data3?name=二狗子&age=18 准备一个对应属性的实体类有get set方法
    @GetMapping("data3")
    @ResponseBody
    public String data3(User user)
    {
        System.out.println("user = " + user);
        return user.toString();
    }

}
