package com.ma.config;

/* *
 * @author mtc
 * @date 15:30 09 24 15:30
 *
 */
/*
* TODO: MVC配置类
*   1. 将controller 配置到ioc容器
*   2. 将handlerMapping handlerAdapter 加入到ioc容器中
*
* */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * MVC 配置
 *
 * @author admin
 * @date 2023/09/25
 */
@Configuration
@ComponentScan("com.ma.controller")

public class MvcConfig {


    /**
     * 处理程序映射
     *
     * @return 请求映射处理程序映射
     */
    @Bean
    public RequestMappingHandlerMapping handlerMapping(){
        return new RequestMappingHandlerMapping();
    }

    /**
     * 处理程序适配器
     *
     * @return {@link RequestMappingHandlerAdapter}
     */
    @Bean
    public RequestMappingHandlerAdapter handlerAdapter(){
        return new RequestMappingHandlerAdapter();
    }


}
