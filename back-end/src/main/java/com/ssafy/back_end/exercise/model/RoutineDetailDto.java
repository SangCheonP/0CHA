package com.ssafy.back_end.exercise.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoutineDetailDto {
    private int id;
    private int routineId;
    private int exerciseId;
    private int sequence;
    private List<RoutineSetDto> sets;
}

