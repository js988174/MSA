package com.spring.userservice.service;

import com.spring.userservice.dto.UserDto;
import org.springframework.stereotype.Service;


public interface UserService {
    UserDto createUser(UserDto userDto);
}
