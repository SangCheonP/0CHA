package com.ssafy.back_end.user.model;

import lombok.Data;

import java.util.Date;

@Data
public class UserDto {
    private int id;
    private String email;
    private String password;
    private String name;
    private String nickname;
    private String phone;
    private Date birth;
    private String profileImage;
    private int gender;
    private double height;
    private double weight;
    private String district;
    private String siGunGu;
    private String refreshToken;
}
