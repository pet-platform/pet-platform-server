package com.member.domain.email.repository;


import com.member.domain.email.entity.JoinEmailCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JoinEmailCodeRepository extends JpaRepository<JoinEmailCode, String> {
    Optional<JoinEmailCode> findByEmail(String email);
}
