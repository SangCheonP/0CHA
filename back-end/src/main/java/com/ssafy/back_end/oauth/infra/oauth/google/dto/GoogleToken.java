package com.ssafy.back_end.oauth.infra.oauth.google.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(SnakeCaseStrategy.class)
public record GoogleToken(
        String accessToken,
        Integer expiresIn,
        String refreshToken,
        String scope,
        String tokenType
) {
}
