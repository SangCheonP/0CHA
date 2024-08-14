package com.ssafy.back_end.oauth.domain.authcode;

import com.ssafy.back_end.oauth.domain.OauthServerType;

public interface AuthCodeRequestUrlProvider {

    OauthServerType supportServer();

    String provide();
}
