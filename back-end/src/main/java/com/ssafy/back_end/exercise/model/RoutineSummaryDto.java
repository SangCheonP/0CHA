package com.ssafy.back_end.exercise.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoutineSummaryDto {
    private int id;
    private String title;
    private LocalDate dueDate;
    private boolean isLike;
}