package com.example.jalsaniserver.mapper;

import com.example.jalsaniserver.dto.UserMapperDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {
        List<UserMapperDto> findMypage() throws Exception;
}
