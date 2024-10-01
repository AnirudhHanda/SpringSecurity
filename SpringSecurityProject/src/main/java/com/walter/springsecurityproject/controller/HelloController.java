package com.walter.springsecurityproject.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(HttpServletRequest req) {
        return "Hello Homis " + req.getSession().getId();
    }

    @GetMapping("about")
    public String about(HttpServletRequest req) {
        return "Homi Jhangir Babha " + req.getSession().getId();
    }
}
