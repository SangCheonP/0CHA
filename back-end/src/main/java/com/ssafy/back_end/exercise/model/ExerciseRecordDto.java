package com.ssafy.back_end.exercise.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExerciseRecordDto {
    private LocalDate date;
    private String exerciseName;
    private double volume;
}
