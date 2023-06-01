package com.example.jalsaniserver.controller;

import com.example.jalsaniserver.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.jalsaniserver.service.userService;

@RestController
@Slf4j
@RequiredArgsConstructor
public class UserController {

    private final userService userService;


    //마이페이지 조회
    @GetMapping("/users/{id}")
    public UserResponse getMypage(@PathVariable("id") Long id){
        return userService.getMypage(id);
    }



}
