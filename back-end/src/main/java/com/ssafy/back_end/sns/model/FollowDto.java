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
public class FollowDto {
    private int id;
    private int followerId;
    private int followedId;
    private Timestamp followedAt;
}