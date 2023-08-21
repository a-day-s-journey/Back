package com.example.jalsaniserver.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Table(name = "USER_TABLE")//h2 database에 user라는 keyword에 테이블명이 User 불가능
public class User extends BaseEntity{

    @Id
    private String id;

    private String name;


    private String phone;

    private String mail;

    private String address;

    private LocalDateTime birth;

    private String photopath;

    private String mbti;

    @OneToMany(mappedBy = "user")
    private List<UserSchool> userSchools = new ArrayList<>();

    @Builder
    public User(String id, String name, String phone,String mail, String address, LocalDateTime birth, String photopath, String mbti) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.address = address;
        this.birth = birth;
        this.photopath = photopath;
        this.mbti = mbti;
    }

    public User(String name){
        this.name = name;
    }

}
