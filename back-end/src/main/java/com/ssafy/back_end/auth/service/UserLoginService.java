package com.ssafy.back_end.auth.service;

import com.ssafy.back_end.auth.model.UserDto;

public interface UserLoginService {
    UserDto login(UserDto userDto);   //로그인

//    String loginRefresh(UserDto userDto);   //액세스 토큰 재발급
//
//    String social(UserDto userDto);   //소셜 로그인
//
//    String socalToken(UserDto userDto);   //소셜 로그인 회원인증
}
