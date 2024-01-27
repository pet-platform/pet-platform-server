package com.member.validator;

import com.member.dto.MemberSaveRequestDTO;
import com.member.repository.MemberRepository;
import jakarta.validation.constraints.Email;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.internal.constraintvalidators.AbstractEmailValidator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
@RequiredArgsConstructor
public class CheckEmailValidator extends AbstractValidator<MemberSaveRequestDTO> {

    private final MemberRepository memberRepository;
    @Override
    protected void doValidate(MemberSaveRequestDTO dto, Errors errors) {
        if (memberRepository.existByEmail(dto.getEmail())) {
            errors.rejectValue("email", "이메일 중복 오류", "이미 사용중인 이메일 입니다.");
        }
    }
}
