package com.member.domain.terms.entity;

import com.member.domain.member.entity.Member;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Table(name = "TERMS_AGREEMENT")
@Entity
public class TermsAgreement {
    @Column(name = "TERMS_AGREEMENT_FLAG")
    private boolean agreementFlag;
    @Column(name = "TERMS_AGREEMENT_DATE")
    private LocalDateTime agreementDate;
    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;
    @OneToOne
    @JoinColumn(name = "TERMS_CODE")
    private TermsDetails termsDetails;
}
