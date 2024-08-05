package com.ssafy.back_end.sns.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class RoomDto {
    private int id;
    private int user1Id;
    private int user2Id;
    private Timestamp createAt;
}
