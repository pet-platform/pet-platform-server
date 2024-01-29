package com.member.domain.member.service;

import com.member.domain.email.entity.EmailCode;
import com.member.domain.email.repository.JoinEmailCodeRepository;
import com.member.domain.email.service.EmailService;
import com.member.domain.email.service.random.RandomCodeGenerator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class EmailCodeService {

    private final EmailService emailService;
    private final JoinEmailCodeRepository emailCodeRepository;

    public void sendJoinCode(String name, String email) {
        final String code = RandomCodeGenerator.generateRandomCode();
        emailService.sendVerificationCode(name, "인증번호를 입력해주세요.", email);
        final EmailCode emailCode = EmailCode.builder()
                .name(name)
                .code(code)
                .email(email)
                .build();
        emailCodeRepository.save(emailCode);
    }
}
