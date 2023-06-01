package com.example.jalsaniserver.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserRepositoryImpl {

    private final JPAQueryFactory jpaQueryFactory;


}
