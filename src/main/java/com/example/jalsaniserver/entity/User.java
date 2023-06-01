package com.example.jalsaniserver.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Table(name = "USER_TABLE")//h2 database에 user라는 keyword에 테이블명이 User 불가능
public class User extends BaseEntity{

    @Id @GeneratedValue(strategy = IDENTITY)
    @NotNull
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String phone;

    @NotNull
    private String address;

    private LocalDateTime birth;

    private String photoPath;

    private String mbti;

    @Builder
    public User(Long id, String name, String phone, String address, LocalDateTime birth, String photoPath, String mbti) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.birth = birth;
        this.photoPath = photoPath;
        this.mbti = mbti;
    }
}
