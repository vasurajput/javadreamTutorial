package com.javadream.MappedSuperClassJPAExample.controller;

import com.javadream.MappedSuperClassJPAExample.entity.User;
import com.javadream.MappedSuperClassJPAExample.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/createUser")
    public String createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
