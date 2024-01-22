package com.petkin.customerservice.inquiry.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InquiryRequest {

    private int inquiryIdx;           // 문의내역 idx
    private int memberIdx;            // 회원 idx
    @NotBlank(message = "제목을 입력해 주세요.")
    private String inquiryTitle;       // 문의제목
    @NotBlank(message = "내용을 입력해 주세요.")
    private String inquiryContent;     // 문의내용
    private String inquiryStatus;      // 상태

}
