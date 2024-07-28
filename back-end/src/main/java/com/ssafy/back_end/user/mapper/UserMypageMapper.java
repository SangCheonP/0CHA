package com.ssafy.back_end.user.mapper;

import com.ssafy.back_end.user.model.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMypageMapper {
    UserDto mypage(String token);   //마이페이지 조회
}
