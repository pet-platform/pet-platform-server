package com.member.domain.email.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "EMAIL_CODE")
public class EmailCode {

    @Id
    private String name;

    private String email;
    private String code;

    @Builder
    public EmailCode(String name, String code, String email) {
        this.name = name;
        this.code = code;
        this.email = email;
    }
}
