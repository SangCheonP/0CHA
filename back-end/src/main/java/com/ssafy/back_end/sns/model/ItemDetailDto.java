package com.ssafy.back_end.sns.model;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ItemDetailDto {
    private int id;
    private int itemId;
    private String detailType;
    private int userId;
    private String imageUrl;
    private String originName;
    private String saveName;
    private Timestamp uploadedAt;
}

