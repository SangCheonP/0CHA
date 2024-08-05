package com.ssafy.back_end.exercise.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExerciseLikeDto {
    private int id;
    private int exerciseId;
    private int userId;
}
