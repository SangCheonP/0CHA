package com.ssafy.back_end.sns.service;

import com.ssafy.back_end.sns.model.UserPageDto;
import com.ssafy.back_end.sns.model.UserPageListDto;

import java.util.List;

public interface SnsSocialService {
    UserPageDto getUserPageInfo(int userId);

    List<UserPageListDto> getUserPageFeeds(int userId);

    List<UserPageListDto> getUserPageItems(int userId);

    int getUserPageFollowers();

    int getUserPageFollowings();

    int follow();

    int unfollow();
}