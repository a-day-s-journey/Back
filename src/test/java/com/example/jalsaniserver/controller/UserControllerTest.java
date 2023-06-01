package com.example.jalsaniserver.controller;

import com.example.jalsaniserver.entity.User;
import com.example.jalsaniserver.repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
public class UserControllerTest {
    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UserRepository userRepository;


    @Test
    @DisplayName("마이페이지 사용자 조회")
    void getMypageTest() throws Exception{
        //given
        LocalDateTime localDateTime = LocalDateTime.now();
        List<User> userList = IntStream.range(0,20)
                .mapToObj(i->{
                    return User.builder()
                            .id((long)i)
                            .name("테스트 사용자 - "+ i)
                            .address("관악구 - "+ i)
                            .phone("010-1234-"+ i+i+i+i)
                            .birth(localDateTime)
                            .mbti("ESTP")
                            .photoPath("테스트 사진 Path -" + i)
                            .build();
                })
                .collect(Collectors.toList());
        userRepository.saveAll(userList);

        //expected
        mockMvc.perform(get("/users/5")
                    .contentType(APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("테스트 사용자 - 5"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.address").value("관악구 - 5"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.phone").value("010-1234-5555"))
                .andDo(print());

    }
}