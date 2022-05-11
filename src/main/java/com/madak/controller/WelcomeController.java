package com.madak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/greet")
    public String welcomeMessage() {
        return "welcome to this app, created and build through jenkins pipeline !!";
    }
}
