package com.ssafy.back_end.exercise.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExerciseDto {
    private int id;
    private String name;
    private String description;
    private String category;
    private String image;
}