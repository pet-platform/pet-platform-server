package com.member.domain.email.controller;

import com.member.domain.email.entity.EmailMessage;
import com.member.domain.email.repository.MessageRepository;
import com.member.domain.email.service.EmailService;
import com.member.domain.email.dto.VerificationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class EmailController {

    private final EmailService emailService;
    private final MessageRepository messageRepository;

    @PostMapping
    public ResponseEntity<String> verifyCode(@RequestBody VerificationRequest verificationRequest) {

        String userEnteredCode = verificationRequest.getCode();

        Optional<EmailMessage> messageOptional = messageRepository.findByKey("verification.code");

        if (messageOptional.isPresent()) {
            String storedCode = messageOptional.get().getValue();

            if (userEnteredCode.equals(storedCode)) {
                return ResponseEntity.ok("인증 성공");
            }
        }

        return ResponseEntity.status(400).body("인증 코드가 올바르지 않습니다.");
    }
}