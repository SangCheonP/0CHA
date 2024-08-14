package com.ssafy.back_end.sns.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserJoinRoomDto {
    private int userId;
    private int roomId;
    private String nickname;
    private String profileImage;
    private String lastMessage;
    private Timestamp sendAt;
}
