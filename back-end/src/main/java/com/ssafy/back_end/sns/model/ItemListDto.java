package com.ssafy.back_end.sns.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItemListDto {
    private int size;
    private List<ItemDto> items;
}
