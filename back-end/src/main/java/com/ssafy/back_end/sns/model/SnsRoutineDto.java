package com.ssafy.back_end.sns.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SnsRoutineDto {
    private int id;
    private List<SnsRoutineDetailDto> details;
}
