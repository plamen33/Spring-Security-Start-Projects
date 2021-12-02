package com.plm33.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.io.File;
import java.io.IOException;

/**
 * Java is the best, who's the next
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.plm33.springsecurity")
public class AppConfig {

    //define a bean for ViewResolver:
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

        // by this setting we look now here: /WEB-INF/view/some-jsp-file.jsp - so we display the jsp page
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }
}
