package com.ravi.service;

import org.springframework.stereotype.Service;

import com.ravi.entity.ResponseDto;
import com.ravi.entity.User;

public interface UserService {
	User saveuser(User user);

	ResponseDto getuser(long userId);
}
