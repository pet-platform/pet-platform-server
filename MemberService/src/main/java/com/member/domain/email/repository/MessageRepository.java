package com.member.domain.email.repository;


import com.member.domain.email.entity.EmailMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MessageRepository extends JpaRepository<EmailMessage, Long> {
    Optional<EmailMessage> findByKey(String key);
}
