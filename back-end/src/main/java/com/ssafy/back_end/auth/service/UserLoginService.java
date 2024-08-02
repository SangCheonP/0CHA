package com.ssafy.back_end.auth.service;

import com.ssafy.back_end.auth.model.UserDto;

public interface UserLoginService {
    UserDto login(UserDto userDto);   //로그인

    void storeRefreshToken(int userId, String token);   //리프레시 토큰 테이블에 저장

    void invalidateRefreshToken(int userId);   //리프레시 토큰 삭제

//    String social(UserDto userDto);   //소셜 로그인
//
//    String socalToken(UserDto userDto);   //소셜 로그인 회원인증
}
