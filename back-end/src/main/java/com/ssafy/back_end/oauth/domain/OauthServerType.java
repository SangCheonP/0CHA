package com.ssafy.back_end.oauth.domain;

import static java.util.Locale.ENGLISH;

public enum OauthServerType {

    KAKAO,
    Google,
    NAVER
    ;

    public static OauthServerType fromName(String type) {
        return OauthServerType.valueOf(type.toUpperCase(ENGLISH));
    }
}