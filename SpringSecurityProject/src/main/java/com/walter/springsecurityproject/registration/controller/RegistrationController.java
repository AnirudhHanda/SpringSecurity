package com.walter.springsecurityproject.registration.controller;

import com.walter.springsecurityproject.appuser.model.AppUser;
import com.walter.springsecurityproject.appuser.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private MyUserDetailsService userDetailsService;

    @PostMapping("register")
    public ResponseEntity<?> register(@RequestBody AppUser user) {
        return userDetailsService.saveUser(user);
    }
}
