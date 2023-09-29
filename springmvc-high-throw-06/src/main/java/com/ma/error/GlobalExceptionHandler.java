package com.ma.error;

/* *
 * @packing com.ma.error
 * @author mtc
 * @date 10:19 09 29 10:19
 *
 */

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//  全局异常发生会走此类写的handler
@ControllerAdvice   //  可以返回逻辑视图 转发和重定向的
@RestControllerAdvice  // @ResponseBody 直接返回json字符串
public class GlobalExceptionHandler {


    // TODO：算术异常的处理
    //   发生异常-》 ControllerAdvice 注解的类型 -》 @ExceptionHandler(指定的异常) -》 handler
    //   指定的异常可以精准查找，也可以查找父异常！

    @ExceptionHandler(ArithmeticException.class)
    public Object ArithmeticExceptionHandler(ArithmeticException e){
        // TODO： 自定义处理异常即可
        String message = e.getMessage();
        System.out.println("message = " + message);
        return message;
    }
    @ExceptionHandler(Exception.class)
    public Object ExceptionHandler(Exception e){
        String message = e.getMessage();
        System.out.println("message = " + message);
        return message;
    }
}
