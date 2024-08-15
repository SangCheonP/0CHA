package com.ssafy.back_end.record.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExerciseOneRepMaxDto {
    private LocalDate date;
    private double oneRepMax; // 특정 운동의 1RM
}
