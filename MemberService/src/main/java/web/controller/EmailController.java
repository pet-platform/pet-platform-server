package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.EmailService;
import web.request.EmailRequest;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping
    public String sendEmail(@RequestBody EmailRequest emailRequest) {
        emailService.sendEmail(emailRequest.getTo(), emailRequest.getSubject(), emailRequest.getBody());
        return "이메일이 성공적으로 전송되었습니다";
    }
}
