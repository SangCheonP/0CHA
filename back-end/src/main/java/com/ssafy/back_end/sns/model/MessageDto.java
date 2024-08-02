package com.ssafy.back_end.sns.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageDto {
    private int id;
    private int senderId;
    private int roomId;
    private String message;
    private Timestamp sendAt;
}
