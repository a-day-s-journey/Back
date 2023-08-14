package com.example.jalsaniserver.service;

import com.example.jalsaniserver.dto.UserMapperDto;
import com.example.jalsaniserver.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class userService {

    private final UserMapper userMapper;

    public List<UserMapperDto> findMypage() throws Exception {
        return userMapper.findMypage();
    }
/*
        User user = userRepository.findById(id)
                .orElseThrow(()->new IllegalStateException("존재하지 않는 사용자 입니다."));

        return UserResponse.builder()
                .id(user.getId())
                .build();
*/



}
