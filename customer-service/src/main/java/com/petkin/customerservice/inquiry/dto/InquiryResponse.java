package com.petkin.customerservice.inquiry.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class InquiryResponse {

    private int inquiryIdx;           // 문의내역 idx
    private String inquiryTitle;       // 문의제목
    private String inquiryContent;     // 문의내용
    private String inquiryStatus;      // 상태
    private LocalDateTime registerDate; // 등록일자

}
