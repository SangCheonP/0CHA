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
public class FeedInteractionDto {
    private int id;
    private int userId;
    private int feedId;
    private String interactionType;
    private String comment;
    private Timestamp createdAt;
}