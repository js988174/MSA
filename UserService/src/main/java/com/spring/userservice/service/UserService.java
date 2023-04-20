package com.spring.userservice.service;

import com.spring.userservice.dto.UserDto;
import com.spring.userservice.entity.UserEntity;
import org.springframework.stereotype.Service;


public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);

    Iterable<UserEntity> getUserByAll();
}
