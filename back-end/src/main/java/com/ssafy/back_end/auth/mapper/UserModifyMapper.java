package com.ssafy.back_end.auth.mapper;

import com.ssafy.back_end.auth.model.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserModifyMapper {
    String findEmail(UserDto userDto);   //이메일 찾기

    int findPassword(UserDto userDto);   //비밀번호 찾기 및 인증번호 발송

    int resetPassword(UserDto userDto);   //비밀번호 초기화
}
