package com.ssafy.back_end.oauth.infra.oauth.kakao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "spring.security.oauth2.client.registration.kakao")
@Component
@Getter
@Setter
public class KakaoOauthConfig {

    private String clientId;
    private String clientSecret;
    private String redirectUri;
    private String[] scope;
}
