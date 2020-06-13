package com.authentication.ldapserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "Welcome to the home page!"; // tutaj ma być przekierowanie na localhost 3000
    }

}