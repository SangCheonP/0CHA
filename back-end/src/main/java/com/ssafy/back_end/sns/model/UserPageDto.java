package com.ssafy.back_end.sns.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserPageDto {
    private String nickname;
    private String profileImage;
    private int feedCount;
    private int itemCount;
    private int followedIdCount;
    private int followerIdCount;
}
