package com.javadream.MappedSuperClassJPAExample.service;

import com.javadream.MappedSuperClassJPAExample.entity.User;
import com.javadream.MappedSuperClassJPAExample.repository.UserReposiotry;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserReposiotry userReposiotry;

    public String createUser(User user) {
        userReposiotry.save(user);
        return "User created successfully";
    }
}
