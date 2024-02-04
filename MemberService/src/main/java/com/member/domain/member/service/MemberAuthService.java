package com.member.domain.member.service;

import com.member.domain.member.dto.MemberSaveRequestDTO;
import com.member.domain.member.entity.Member;
import com.member.domain.member.repository.MemberRepository;
import com.member.global.validator.PasswordValidator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberAuthService {

    private final EmailCodeService emailCodeService;
    private final MemberRepository memberRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Transactional(readOnly = true)
    public boolean checkEmail(String email) {
        return !memberRepository.existByEmail(email);
    }

    public boolean join(MemberSaveRequestDTO requestDTO) {

        if (!emailCodeService.checkJoinCode(requestDTO.getEmail(), requestDTO.getCode())) {
            return false;
        }
        final Member member = SaveRequestToMember(requestDTO);
        String password = requestDTO.getPassword();
        if (!PasswordValidator.validate(password)) {
            log.error("비밀번호는 최소 8자 이상이어야 하며, 최소 1개의 숫자, 1개의 소문자, 1개의 대문자, 1개의 특수 문자를 포함해야 합니다.");
            return false;
        } else {
            String encodePassword = bCryptPasswordEncoder.encode(password);
            member.setEncodedPassword(encodePassword);
            memberRepository.save(member);
        }
        return true;
    }

    public void sendEmailConfirmation(String email) {
        emailCodeService.sendJoinCode(email);
    }


    private Member SaveRequestToMember(MemberSaveRequestDTO requestDTO) {
        return Member.builder()
                .name(requestDTO.getName())
                .eMail(requestDTO.getEmail())
                .password(requestDTO.getPassword())
                .nickName(requestDTO.getNickname())
                .gender(requestDTO.getGender())
                .build();
    }
}
