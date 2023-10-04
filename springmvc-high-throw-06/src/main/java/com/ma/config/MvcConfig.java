package com.ma.config;

/* *
 * @packing com.ma.config
 * @author mtc
 * @date 10:15 09 29 10:15
 *
 */

import com.ma.interceptor.MyInterceptor;
import com.ma.interceptor.MyInterceptor2;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.ma")
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        // 配置方案1 ： 拦截全部请求

////        registry.addInterceptor(new MyInterceptor());
////
////        // 配置方案2 ： 拦截部分请求
////        // * 任意一层   **任意多层
//        registry.addInterceptor(new MyInterceptor())
//                .addPathPatterns("/user/**")
//                .excludePathPatterns("/user/data1");
//        // 排除拦截的地址  应该在拦截地址内部。
//
//        // 配置方案3 ： 排除拦截
//        // 有多个拦截器
////        registry.addInterceptor(new MyInterceptor());
////        registry.addInterceptor(new MyInterceptor2());
//
//        // 执行顺序 1 4 5  2 6 3
//        // 先声明的优先级高  类似一个圈  优先级高的在外层 优先级地的在内层
//    }


}

