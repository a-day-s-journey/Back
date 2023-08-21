package com.example.jalsaniserver.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserSearch {


    private String id;
    private String name;
    private String phone;
    private String address;
    private LocalDateTime birth;
    private String photopath;
    private String mbti;



}
