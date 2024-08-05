package com.ssafy.back_end.sns.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
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