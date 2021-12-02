package com.plm33.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Java is the best, who's the next
 */
@Controller
public class StartController {

    @GetMapping("/")
    public String showHome(){

        // when we return to home, based on AppConfig it will return to /WEB-INF/view/home.jsp
        return "home";
    }
}
