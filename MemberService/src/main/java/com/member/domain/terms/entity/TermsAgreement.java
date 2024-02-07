package com.member.domain.terms.entity;

import com.member.domain.member.entity.Member;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Table(name = "TERMS_AGREEMENT")
@Entity
public class TermsAgreement {
    @Id
    @OneToOne
    @JoinColumn(name = "TERMS_CODE")
    private TermsDetails termsDetails;
    @Id
    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;
    @Column(name = "TERMS_AGREEMENT_FLAG")
    private boolean agreementFlag;
    @Column(name = "TERMS_AGREEMENT_DATE")
    private LocalDateTime agreementDate;
}
