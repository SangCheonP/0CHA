package com.ssafy.back_end.record.model;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RecordDto {
    private LocalDate date;
    private double maxWeight; // 1RM
    private double totalVolume; // 총 운동량
    private int totalTime; // 총 운동 시간 (단위: 초)
}
