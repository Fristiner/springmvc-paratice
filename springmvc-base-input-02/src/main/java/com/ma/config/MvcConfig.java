package com.ma.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * projectName: ssm-springmvc-part
 * {@code @author: ma }
 * 2023 09 24 9:00 PM
 * description:
 */


@Configuration
@ComponentScan("com.ma")
@EnableWebMvc    // handlerAdapter配置json转换器
public class MvcConfig {

    @Bean
    public RequestMappingHandlerAdapter handlerAdapter(){
        return  new RequestMappingHandlerAdapter();
    }
    public RequestMappingHandlerMapping handlerMapping(){
        return new RequestMappingHandlerMapping();
    }


}
