package com.ssafy.back_end.record.service;

import com.ssafy.back_end.record.model.RecordInbodyDto;

import java.util.List;

public interface RecordService {
    List<RecordInbodyDto> getInbody(int userId);   //인바디 결과 조회

    int insertInbody(RecordInbodyDto recordInbodyDto);   //인바디 결과 저장
}
