package com.ssafy.back_end.oauth.infra.oauth.github;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "spring.security.oauth2.client.registration.github")
@Getter
@Setter
public class GithubOauthConfig {

    private String clientId;
    private String clientSecret;
    private String redirectUri;
    private String[] scope;
}