package com.member.service;

import com.member.domain.email.service.EmailService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;

import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
class EmailServiceTest {
    @Autowired
    private EmailService emailService;
    @Autowired
    private JavaMailSender javaMailSender;

    @Test
    @DisplayName("코드 전송 성공")
    void sendVerificationCode_Success() {
        // 테스트에서 메일 전송
        emailService.sendVerificationCode("gusdn0413@naver.com");
        // 여기서 추가적인 검증이 필요하다면 Mockito 등을 활용하여 검증 가능
    }
}