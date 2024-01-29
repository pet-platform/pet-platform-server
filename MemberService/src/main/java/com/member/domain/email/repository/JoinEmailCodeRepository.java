package com.member.domain.email.repository;


import com.member.domain.email.entity.EmailCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JoinEmailCodeRepository extends JpaRepository<EmailCode, String> {
    Optional<EmailCode> findByName(String name);
}
