package com.petkin.customerservice.inquiry.service;

import com.petkin.customerservice.inquiry.dto.InquiryRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InquiryServiceTest {

    @Autowired
    InquiryService inquiryService;
    @Test
    void save(){
       /* InquiryRequest params = new InquiryRequest();
        params.setInquiryIdx(3);
        params.setInquiryContent("3번 문의글");
        params.setInquiryTitle("3번 제목");
        params.setInquiryStatus("N");
        params.setMemberIdx(3);
        int idx = inquiryService.save(params);
        System.out.println("idx : "+idx);
*/
    }
}

