package com.ssafy.back_end.user.mapper;

import com.ssafy.back_end.user.model.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserDto> selectAll();
}
