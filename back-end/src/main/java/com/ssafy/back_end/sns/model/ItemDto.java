package com.ssafy.back_end.sns.model;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {
    private int id;
    private int userId;
    private String title;
    private String content;
    private int price;
    private int isSold;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String district;
    private String siGunGu;
}