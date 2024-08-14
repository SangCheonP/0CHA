package com.ssafy.back_end.exercise.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoutineDetailDto {
    @JsonIgnore
    private int id;
    @JsonIgnore
    private int routineId;
    private int exerciseId;
    private String exerciseName; // 운동 이름 추가
    private int sequence;
    private List<RoutineSetDto> sets;
}