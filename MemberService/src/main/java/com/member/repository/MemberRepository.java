package com.member.repository;

import com.member.domain.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {

    // 이메일 중복
    boolean existByEmail(String email);

    // 닉네임 중복
    boolean existByNickName(String nickName);

}
