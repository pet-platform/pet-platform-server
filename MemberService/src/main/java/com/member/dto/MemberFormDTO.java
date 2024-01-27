package com.member.dto;

import com.member.domain.member.gender.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberFormDTO {

    private String email;
    private String name;
    private String password;
    private String nickName;
    private Gender gender;
}
