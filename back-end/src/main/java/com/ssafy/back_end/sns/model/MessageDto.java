package com.ssafy.back_end.sns.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class MessageDto {
    private int id;
    private int senderId;
    private int roomId;
    private String message;
    private Timestamp sendAt;
}
