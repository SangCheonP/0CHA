package com.ssafy.back_end.exercise.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExerciseRecordDto {
    private int exerciseId;
    private String name;
    private int weight;
    private int count;
    private LocalDateTime date;
}

