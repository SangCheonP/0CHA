package com.ssafy.back_end.main.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserPasswordDto {
    private String curPassword;
    private String newPassword;
}
