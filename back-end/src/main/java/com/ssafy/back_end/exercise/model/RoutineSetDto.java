package com.ssafy.back_end.exercise.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoutineSetDto {
    private int id;
    private int routineDetail;
    private int sequence;
    private int weight;
    private int count;
    private int set;
    private boolean isComplete;
}
