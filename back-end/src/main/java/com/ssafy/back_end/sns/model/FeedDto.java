package com.ssafy.back_end.sns.model;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
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
    private int likeCount;
    private int commentCount;
    private String nickname;
    private String profileImage;

    private int isLike;
}