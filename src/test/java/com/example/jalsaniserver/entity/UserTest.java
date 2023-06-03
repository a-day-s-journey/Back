package com.example.jalsaniserver.entity;

import com.querydsl.core.Tuple;
import com.querydsl.jpa.JPAExpressions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.sql.SQLOutput;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@Transactional
class UserTest {

    @PersistenceContext
    EntityManager em;

    @BeforeEach
    public void before(){
        User userA = new User("userA");
        User userB = new User("userB");
        em.persist(userA);
        em.persist(userB);

        School schoolA = new School("schoolA");
        School schoolB = new School("schoolB");

        UserSchool userSchool1 = new UserSchool(userA, schoolA, 10);
        UserSchool userSchool2 = new UserSchool(userB, schoolB, 20);
        UserSchool userSchool3 = new UserSchool(userA, schoolB, 30);
        UserSchool userSchool4 = new UserSchool(userB, schoolA, 40);

        em.persist(userSchool1);
        em.persist(userSchool2);
        em.persist(userSchool3);
        em.persist(userSchool4);
    }

    @Test
    public void startFindUserASchoolB(){
        //userA와 schoolB, 30 년도 졸업생 찾기

        JPAQueryFactory queryFactory = new JPAQueryFactory(em);
        QUser u = new QUser("u");
        QSchool s = new QSchool("s");
        QUserSchool us = new QUserSchool("us");
/*
        List<Tuple> terget = queryFactory
                .select(u.name, s.name)
                .from(us)
                .join(us.user, u)
                .join(us.school, s)
                .where(us.id.eq((long) 2))
                .fetch();

        for(Tuple tuple : terget){
            System.out.println("uername = " + tuple.get(u.name));
            System.out.println("schoolname = " + tuple.get(s.name));
            System.out.println();
        }
*/
    }


}