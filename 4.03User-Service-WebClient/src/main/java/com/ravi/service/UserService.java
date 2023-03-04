package com.ravi.service;

import com.ravi.dto.ResponseDto;
import com.ravi.entity.User;

public interface UserService {
    User saveUser(User user);

    ResponseDto getUser(Long userId);

}