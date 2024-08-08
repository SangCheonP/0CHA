package com.ssafy.back_end.record.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoutineListDto {
    private int routineId;
    private String routineName;
    private LocalDate dueDate;
    private boolean isCompleted;
}
