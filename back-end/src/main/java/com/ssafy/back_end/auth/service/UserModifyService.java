package com.ssafy.back_end.auth.service;

import com.ssafy.back_end.auth.model.UserDto;

public interface UserModifyService {
    String findEmail(UserDto userDto);   //이메일 찾기

    int findPassword(UserDto userDto);   //비밀번호 찾기 및 인증번호 발송

    int resetPassword(UserDto userDto);   //비밀번호 초기화

    void sendEmail(String email, int authCode);   //이메일 인증 전송
}
