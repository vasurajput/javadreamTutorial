package com.example.mapstruct.mapper;

import com.example.mapstruct.DTO.UserDTO;
import com.example.mapstruct.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toDto(User user);
    @Mapping(source = "email", target = "userEmail")
    User toEntity(UserDTO dto);
}
