package com.ssafy.back_end.auth.mapper;

import com.ssafy.back_end.auth.model.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserLoginMapper {
    UserDto login(UserDto userDto);   //로그인

    String loginRefresh(UserDto userDto);   //액세스 토큰 재발급

    String social(UserDto userDto);   //소셜 로그인

    String socalToken(UserDto userDto);   //소셜 로그인 회원인증
}
