package com.plm33.springsecurity.controller;

/**
 * Java is the best, who's the next
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/loginPage") // we map what we set in SecurityConfig
    public String showMyLoginPage() {

        return "custom-login"; // we need to create and have custom-login.jsp

    }
}
