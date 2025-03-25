package com.javadream.SpringBootSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {


    @GetMapping("/public/hello")
    public String publicHello() {
        return "This is the Public endpoint It can be access without any authentication and authorization.";
    }

    @GetMapping("/hr/information")
    public String hrInfo() {
        return "Hello, You are authorized to get HR department information";
    }

    @GetMapping("/security/information")
    public String securityInfo() {
        return "Hello, You are authorized to get Security department information";
    }
    
    @GetMapping("/user")
    public String userInfo() {
        return "Hello, Any user with Role HR or Security can access this endpoint";
    }
}
