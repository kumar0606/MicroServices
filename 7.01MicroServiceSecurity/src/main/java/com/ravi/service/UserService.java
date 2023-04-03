package com.ravi.service;

import org.springframework.stereotype.Service;

import com.ravi.model.User;

@Service
public interface UserService {
    public void saveUser(User user);
    public User getUserByNameAndPassword(String name, String password) throws UserNotFoundException;
}