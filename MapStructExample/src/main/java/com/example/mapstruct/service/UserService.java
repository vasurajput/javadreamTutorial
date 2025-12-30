package com.example.mapstruct.service;

import com.example.mapstruct.DTO.UserDTO;
import com.example.mapstruct.entity.User;
import com.example.mapstruct.mapper.UserMapper;
import com.example.mapstruct.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public ResponseEntity<?> createUser(UserDTO userDTO) {
        User entity = userMapper.toEntity(userDTO);
        entity.setMobileNumber("8077777777");
        User saveUser = userRepository.save(entity);
        return ResponseEntity.ok(saveUser);
    }
}
