package com.member.domain.member.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberUpdateRequestDTO {
    private String nickName;
    private String password;
}
