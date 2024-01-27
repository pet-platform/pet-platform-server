package com.member.service;

import com.member.domain.member.Member;
import com.member.dto.MemberFormDTO;
import com.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public Long join(MemberFormDTO memberFormDTO) {
        Member member = Member.builder()
                .eMail(memberFormDTO.getEmail())
                .password(passwordEncoder.encode(memberFormDTO.getPassword()))
                .nickName(memberFormDTO.getNickName())
                .gender(memberFormDTO.getGender())
                .build();

        return memberRepository.save(member).getId();
    }
}
