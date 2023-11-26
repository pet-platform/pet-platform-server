package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.EmailService;
import service.random.RandomCodeGenerator;
import web.request.EmailRequest;
import web.request.VerificationRequest;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity<String> sendVerificationCode(@RequestBody EmailRequest emailRequest) {
        try {
            emailService.sendVerificationCode(emailRequest.getTo());
            return ResponseEntity.ok("인증 코드가 이메일로 전송되었습니다.");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("인증 코드 전송 중 오류가 발생했습니다.");
        }
    }

    @PostMapping
    public ResponseEntity<String> verifyCode(@RequestBody VerificationRequest verificationRequest) {

        String userEnteredCode = verificationRequest.getCode();

        String generatedCode = RandomCodeGenerator.generateRandomCode();

        if (userEnteredCode.equals(generatedCode)) {
            return ResponseEntity.ok("인증 성공");
        } else {
            return ResponseEntity.status(400).body("인증 코드가 올바르지 않습니다.");
        }
    }
}

