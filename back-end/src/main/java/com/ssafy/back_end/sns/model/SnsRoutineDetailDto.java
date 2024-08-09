package com.ssafy.back_end.sns.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SnsRoutineDetailDto {
    private String exerciseName;
    private int setCount;
}
