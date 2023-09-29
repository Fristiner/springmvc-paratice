package com.ma.interceptor;

/* *
 * @packing com.ma.interceptor
 * @author mtc
 * @date 10:43 09 29 10:43
 *
 */

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

// TODO： 实现
public class MyInterceptor implements HandlerInterceptor {

    // 在执行handler 之前调用的拦截方法
    // 编码格式设置 ， 登录保护 权限处理


    /**
     * 预手柄
     * dofilter
     * @param request  请求对象
     * @param response 响应对象
     * @param handler  handler就是我们要调用的方法对象
     * @return boolean ture 放行  false 拦截
     * @throws Exception 例外
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(1);
//        return HandlerInterceptor.super.preHandle(request, response, handler);
        System.out.println("request = " + request + ", response = " + response + ", handler = " + handler);
        return true;
    }

    /**
     * 柱控点
     * 对结果处理  铭感词汇检查
     * 当handler执行完毕后，执行的方法 没有拦截的机制
     * 只有preHandler return true 才会执行
     * @param request      请求
     * @param response     响应
     * @param handler      handler 方法
     * @param modelAndView  返回的视图和共享域对象
     * @throws Exception 例外
     */

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("2");
//        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
        System.out.println("request = " + request + ", response = " + response + ", handler = " + handler + ", modelAndView = " + modelAndView);

    }

    /**
     * 完成后 整体处理完毕
     *
     * @param request  请求
     * @param response 响应
     * @param handler  处理器
     * @param ex  handler 报错了 异常对象
     * @throws Exception 例外
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("3");
//        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
        System.out.println("request = " + request + ", response = " + response + ", handler = " + handler + ", ex = " + ex);

    }
}
