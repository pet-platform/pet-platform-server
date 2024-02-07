package com.member.domain.member.controller;

import com.member.domain.member.dto.MemberSaveRequestDTO;
import com.member.domain.member.service.MemberAuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberAuthController {

    private final MemberAuthService memberAuthService;

    @PostMapping
    public ResponseEntity<String> join(@RequestBody MemberSaveRequestDTO requestDTO) {
        boolean isSuccess = memberAuthService.join(requestDTO);
        if (isSuccess) {
            return ResponseEntity.status(HttpStatus.CREATED).body("회원 가입이 성공적으로 완료되었습니다.");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("회원 가입에 실패했습니다.");
        }
    }
}
