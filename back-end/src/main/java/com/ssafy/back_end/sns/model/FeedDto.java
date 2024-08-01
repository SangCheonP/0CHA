package com.ssafy.back_end.sns.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FeedDto {
    private int id;
    private int userId;
    private int routineId;
    private String image;
    private String content;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}