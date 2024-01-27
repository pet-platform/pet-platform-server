package com.member.validator;

import com.member.dto.MemberSaveRequestDTO;
import com.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
@RequiredArgsConstructor
public class CheckNickNameValidator extends AbstractValidator<MemberSaveRequestDTO> {

    private final MemberRepository memberRepository;
    @Override
    protected void doValidate(MemberSaveRequestDTO dto, Errors errors) {
        if (memberRepository.existByNickName(dto.getNickname())) {
            errors.rejectValue("nickname", "닉네임 중복 오류", "이미 사용중인 닉네임 입니다.");
        }
    }
}
