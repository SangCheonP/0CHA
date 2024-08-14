package com.ssafy.back_end.oauth.domain.client;
import com.ssafy.back_end.oauth.domain.OauthMember;
import com.ssafy.back_end.oauth.domain.OauthServerType;

public interface OauthMemberClient {

    OauthServerType supportServer();

    OauthMember fetch(String code);
}
