package com.ssafy.back_end.sns.model;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FeedInteractionDto {
    private int id;
    private int userId;
    private int feedId;
    private String interactionType;
    private String comment;
    private Timestamp createdAt;
    private String nickname;
    private String profileImage;
}