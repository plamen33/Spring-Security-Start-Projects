package com.plm33.springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

/**
 * Java is the best, who's the next
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
       // add users for in memory authentication for start project

        // this will give us the Default Spring login page:
        UserBuilder users = User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication()
                .withUser(users.username("java").password("best").roles("EMPLOYEE"))
                .withUser(users.username("test").password("best").roles("MANAGER"))
                .withUser(users.username("admin").password("best").roles("ADMIN"));
    }

    //this method: Configure security of web paths in application, login, logout etc:
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests() //Restrict access based on the HttpServletRequest
                .anyRequest().authenticated()  //Any request to the app must be authenticated (ie logged in)
                .and()
                .formLogin() //We are customizing the form login process
                .loginPage("/loginPage") //use whatever value you want, but map it in the Controller - LoginController //Show our custom form at the request mapping “/loginPage”
                .loginProcessingUrl("/authenticateUser")  //use any value here but it must be specified in your JSP - custom-login.jsp //Login form should POST data to this URL for processing (check user id and password)
                .permitAll(); //Allow everyone to see login page. No need to be logged in.

    }

}
