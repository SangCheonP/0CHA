package com.ssafy.back_end.user.mapper;

import com.ssafy.back_end.user.model.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRegisterMapper {
    boolean register(UserDto userDto);   //회원가입
    boolean checkEmail(UserDto userDto);   //이메일 인증번호 발송
    boolean EmailAuth(UserDto userDto);   //이메일 인증번호 확인
    boolean checkNickname(String nickname);   //닉네임 중복체크
}
