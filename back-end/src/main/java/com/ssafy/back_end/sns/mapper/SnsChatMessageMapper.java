package com.ssafy.back_end.sns.mapper;

import com.ssafy.back_end.sns.model.MessageDto;
import com.ssafy.back_end.sns.model.UserJoinRoomDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SnsChatMessageMapper {
    
    // 메시지 저장
    void saveMessage(MessageDto message);

    // 특정 채팅방 메시지 모두 가져오기
    List<MessageDto> findByRoomId(int roomId);

    List<UserJoinRoomDto> getLastMessageList(int myId);
}
