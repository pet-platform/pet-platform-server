package com.petkin.customerservice.inquiry.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.petkin.customerservice.inquiry.dto.InquiryRequest;
import com.petkin.customerservice.inquiry.dto.InquiryResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InquiryMapperTest {

    @Autowired
    InquiryMapper inquiryMapper;

    @Test
    void save(){
        /*InquiryRequest params = new InquiryRequest();
        params.setInquiryIdx(2);
        params.setInquiryContent("1번 문의글");
        params.setInquiryTitle("1번 제목");
        params.setInquiryStatus("N");
        params.setMemberIdx(2);
        inquiryMapper.save(params);*/
    }

    @Test
    void findById(){
        /*InquiryResponse inquiry = inquiryMapper.findById(1);
        System.out.println(inquiry.getInquiryContent());
        try {
            String json = new ObjectMapper().registerModule(new JavaTimeModule()).writeValueAsString(inquiry);
            System.out.println(json);
        } catch (JsonProcessingException e){
            throw new RuntimeException(e);
        }*/

    }

}

