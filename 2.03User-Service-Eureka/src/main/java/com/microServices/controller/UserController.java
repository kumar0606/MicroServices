package com.microServices.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microServices.dto.ResponseDto;
import com.microServices.entity.User;
import com.microServices.service.UserService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/users")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user){
        User savedUser = userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    @CircuitBreaker(name = "myProjectAllRemoteCallsDEPARTMENT", fallbackMethod = "getAPIFallBack")
    public ResponseEntity<ResponseDto> getUser(@PathVariable("id") Long userId){
        ResponseDto responseDto = userService.getUser(userId);
        return ResponseEntity.ok(responseDto);
    }
    @GetMapping("/second/{id}")
    public ResponseEntity<ResponseDto> getUser1(@PathVariable("id") Long userId){
    	ResponseDto responseDto = userService.getUser1(userId);
    	return ResponseEntity.ok(responseDto);
    }
    public String  getAPIFallBack(String topicPage, Exception e){
        
        return "ERROR: USER DEPARTMENT SERVER IS DOWN!!!!!!!!...";
    }
}