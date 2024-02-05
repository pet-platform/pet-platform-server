package com.member.domain.terms.entity;

import jakarta.persistence.*;

@Table(name = "TERMS_DETAILS")
@Entity
public class TermsDetails {
    @Id
    @GeneratedValue
    @Column(name = "TERMS_CODE")
    private Long id;
    @Column(name = "TERMS_NAME")
    private String termsName;
    @Column(name = "TERMS_CONDITION")
    private String termsCondition;
    @Column(name = "REQUIRED_FLAG")
    private boolean requiredFlag;
    @OneToOne(mappedBy = "termsDetails",cascade = CascadeType.ALL)
    private TermsAgreement termsAgreement;
}
