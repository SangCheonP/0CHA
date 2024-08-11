package com.ssafy.back_end.auth.service;

import com.ssafy.back_end.auth.model.UserDto;

public interface UserRegisterService {
    int register(UserDto userDto);   //회원가입

    int userInfo(UserDto userDto);   //추가정보 입력

    int checkEmail(String email);   //이메일 인증번호 발송

    int checkNickname(String nickname);   //닉네임 중복체크

    void sendEmail(String email, int authCode);   //이메일 인증 전송

}
