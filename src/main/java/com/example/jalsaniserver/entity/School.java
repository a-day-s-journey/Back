package com.example.jalsaniserver.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@NoArgsConstructor
public class School extends BaseEntity{

    @Id @GeneratedValue(strategy = IDENTITY)
    @NotNull
    private String id;

    @NotNull
    private String level;

    @NotNull
    private String name;

}
