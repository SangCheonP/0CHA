package com.ssafy.back_end.sns.mapper;

import com.ssafy.back_end.sns.model.UserPageDto;
import com.ssafy.back_end.sns.model.UserPageListDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SnsSocialMapper {
    UserPageDto getUserPageInfo(@Param("userId") int userId);

    List<UserPageListDto> getUserPageFeeds(@Param("userId") int userId);

    List<UserPageListDto> getUserPageItems(@Param("userId") int userId);
}
