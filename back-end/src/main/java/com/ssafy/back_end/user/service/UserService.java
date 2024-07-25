package com.ssafy.back_end.user.service;

import com.ssafy.back_end.user.model.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> selectAll();
}
