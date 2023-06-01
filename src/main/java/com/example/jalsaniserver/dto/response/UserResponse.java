package com.example.jalsaniserver.dto.response;

import com.example.jalsaniserver.entity.User;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class UserResponse {//응답클래스

    private Long id;
    private String name;
    private String phone;
    private String address;
    private LocalDateTime birth;
    private String photoPath;
    private String mbti;

    public UserResponse(User user) { //생성자 오버로딩
        this.id = user.getId();
        this.name = user.getName();
        this.phone = user.getPhone();
        this.address = user.getAddress();
        this.birth = user.getBirth();
        this.photoPath = user.getPhotoPath();
        this.mbti = user.getMbti();
    }

    @Builder
    public UserResponse(Long id, String name,String phone,String address, LocalDateTime birth, String photoPath, String mbti){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.birth = birth;
        this.photoPath = photoPath;
        this.mbti = mbti;
    }
}
