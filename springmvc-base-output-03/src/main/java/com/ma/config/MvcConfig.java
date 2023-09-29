package com.ma.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * projectName: ssm-springmvc-part
 * {@code @author: ma }
 * 2023 09 25 2:47 PM
 * description:
 */
@Configuration
@ComponentScan("com.ma")
@EnableWebMvc

public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
//        WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
    }

    // 试图解析器 指定前后缀
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        // registry 可以快速添加前后缀
        registry.jsp("/WEB-INF/views/",".jsp");
        // handler -> index

    }

    public RequestMappingHandlerMapping handlerMapping(){
        return new RequestMappingHandlerMapping();

    }
    public RequestMappingHandlerAdapter handlerAdapter(){
        return new RequestMappingHandlerAdapter();
    }

}
