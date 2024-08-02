package com.ssafy.back_end.sns.service;

import com.ssafy.back_end.sns.model.MessageDto;

import java.util.List;

public interface SnsChatService {
    public List<MessageDto> getMessageHistory(int roomId);
    public MessageDto saveMessage(int senderId, int roomId, String message);
}
