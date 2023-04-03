package com.ravi.config;

import java.util.Map;

import com.ravi.model.User;

public interface JwtGeneratorInterface {
Map<String, String> generateToken(User user);
}