package com.example.jalsaniserver.service;

import com.example.jalsaniserver.dto.response.UserResponse;
import com.example.jalsaniserver.entity.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.example.jalsaniserver.repository.UserRepository;

@Service
@Slf4j
@RequiredArgsConstructor
public class userService {

    private final UserRepository userRepository;

    // 사용자 마이페이지 조회
    public UserResponse getMypage(Long id){
        User user = userRepository.findById(id)
                .orElseThrow(()->new IllegalStateException("존재하지 않는 사용자 입니다."));

        return UserResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .phone(user.getPhone())
                .address(user.getAddress())
                .birth(user.getBirth())
                .photoPath(user.getPhotoPath())
                .mbti(user.getMbti())
                .build();

    }


}
