package com.ssafy.back_end.user.service;

import com.ssafy.back_end.user.mapper.UserMapper;
import com.ssafy.back_end.user.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserDto> selectAll() {
        return userMapper.selectAll();
    }

}
