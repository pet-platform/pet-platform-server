package com.member.domain.member.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "MEMBER")
@Entity
@Getter
public class Member extends BaseTimeEntity {
    @Id
    @Column(name = "MEMBER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "LOGIN_ID", nullable = false, length = 30, unique = true)
    private String loginId;

    @Column(name = "NAME", nullable = false, length = 30)
    private String name;

    @Column(name = "NICKNAME", nullable = false, length = 30)
    private String nickName;

    @Column(name = "PASSWORD", nullable = false, length = 30)
    private String password;

    @Column(name = "ADDRESS")
    private String address; // 주소

    @Enumerated(EnumType.STRING)
    @Column(name = "GENDER")
    private Gender gender; // 성별

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "E_MAIL")
    private String eMail;

    @Column(name = "WITHDRAWN")
    private boolean withdrawn; // 탈퇴 여부

    @Column(name = "DORMANT")
    private boolean dormant; // 휴면 여부

    @Column(name = "DORMANCY_START_DATE")
    private LocalDateTime dormancyStartDate; // 휴면 시작일

    @Column(name = "DORMANCY_END_DATE")
    private LocalDateTime dormancyEndDate; // 휴면 종료일

    @Enumerated(EnumType.STRING)
    @Column(name = "MOBILE_CARRIER")
    private MobileCarrier mobileCarrier;

    @Enumerated(EnumType.STRING)
    @Column(name = "MEMBER_ROLE")
    private MemberRole memberRole;

    @Builder
    public Member(String name, String nickName, String password, String eMail, Gender gender) {

        this.name = name;
        this.nickName = nickName;
        this.password = password;
        this.eMail = eMail;
        this.gender = gender;

        this.memberRole = MemberRole.ROLE_USER;
    }

    public void setEncodedPassword(String encodedPassword) {
        this.password = encodedPassword;
    }

    public void updateNickName(String nickName) {
        this.nickName = nickName;
    }
}

