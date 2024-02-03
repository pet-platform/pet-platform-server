package com.member.domain.member.service;

import com.member.domain.member.dto.MemberSaveRequestDTO;
import com.member.domain.member.entity.Member;
import com.member.domain.member.repository.MemberRepository;
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
        final String encodePassword = bCryptPasswordEncoder.encode(member.getPassword());
        member.setEncodedPassword(encodePassword);
        memberRepository.save(member);
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
