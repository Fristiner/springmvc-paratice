package com.ma.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


/* *
 * @author mtc
 * @date 15:35 09 24 15:35
 *
 */
public class SpringMvcInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcConfig.class};
    }
    // 配置springmvc内部自带servlet 的访问地址
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
