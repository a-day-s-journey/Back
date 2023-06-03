package com.example.jalsaniserver.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@NoArgsConstructor
public class School extends BaseEntity{

    @Id @GeneratedValue(strategy = IDENTITY)
    private String id;


    private String level;


    private String name;

    @OneToMany(mappedBy = "school")
    private List<UserSchool> userSchools = new ArrayList<>();

    public School(String name){
        this.name = name;
    }

}
