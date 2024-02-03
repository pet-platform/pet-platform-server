package com.member.domain.email.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

@Entity
@Getter
@Table(name = "EMAIL_CODE")
public class JoinEmailCode {

    @Id
    private String name;

    private String email;
    private String code;

    @Builder
    public JoinEmailCode(String name, String code, String email) {
        this.name = name;
        this.code = code;
        this.email = email;
    }
}
