package com.plm33.springsecurity.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Java is the best, who's the next
 */

public class SpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        // TODO Auto-generated method stub
        return null;
    }

    // this setting is the same, as in the xml dispatcher class where we describe the <servlet>
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    // this setting is the same, as in the xml dispatcher class where we describe the <servlet-mapping>
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
