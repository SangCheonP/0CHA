package com.ssafy.back_end.record.mapper;

import com.ssafy.back_end.record.model.RecordInbodyDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RecordMapper {

    List<RecordInbodyDto> getInbody(@Param ("userId") int userId);   //인바디 결과 조회

    int insertInbody(RecordInbodyDto recordInbodyDto);   //인바디 결과 저장
}
