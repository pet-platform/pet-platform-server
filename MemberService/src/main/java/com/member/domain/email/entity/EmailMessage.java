package com.member.domain.email.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EmailMessage {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "message_key", nullable = false, unique = true)
    private String key;


    @Column(name = "message_value",nullable = false)
    private String value;
}
