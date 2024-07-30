package com.ssafy.back_end.user.model;

import lombok.Data;

@Data
public class UserDto {
    private int id;
    private String email;
    private String name;
    private String gender;
}
