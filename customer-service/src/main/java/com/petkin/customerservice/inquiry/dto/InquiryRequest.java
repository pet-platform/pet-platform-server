package com.petkin.customerservice.inquiry.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InquiryRequest {

    private int inquiryIdx;           // 문의내역 idx
    private int memberIdx;            // 회원 idx
    private String inquiryTitle;       // 문의제목
    private String inquiryContent;     // 문의내용
    private String inquiryStatus;      // 상태

}
