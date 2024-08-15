package com.ssafy.back_end.oauth.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// JPA의 Jpa repository를 상속받아 자동으로 CRUD를 지원
public interface OauthMemberRepository extends JpaRepository<OauthMember, Long> {

    // OauthMember 객체를 저장하고, 조회하는 기능 제공
    Optional<OauthMember> findByOauthId(OauthId oauthId);
}