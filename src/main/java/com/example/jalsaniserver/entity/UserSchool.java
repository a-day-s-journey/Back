package com.example.jalsaniserver.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@NoArgsConstructor
public class UserSchool extends BaseEntity{

    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user; //fk

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="schoolId")
    private School school; //fk

    private int graduationYear;

    public UserSchool(User user, School school, int graduationYear){
        this.graduationYear = graduationYear;
        if(user != null){
            changeUser(user);
        }
        if(school != null){
            changeSchool(school);
        }
    }


    //편의 메서드 (user)
    private void changeUser(User user) {
        this.user = user;
        user.getUserSchools().add(this);
    }

    //편의 메서드 (school)
    private void changeSchool(School school) {
        this.school = school;
        school.getUserSchools().add(this);
    }
}