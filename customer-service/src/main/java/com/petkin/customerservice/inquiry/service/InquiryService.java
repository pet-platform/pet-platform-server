package com.petkin.customerservice.inquiry.service;

import com.petkin.customerservice.inquiry.dto.InquiryRequest;
import com.petkin.customerservice.inquiry.dto.InquiryResponse;
import com.petkin.customerservice.inquiry.mapper.InquiryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InquiryService {

    private final InquiryMapper inquiryMapper;

    public int save(final InquiryRequest params){
        inquiryMapper.save(params);
        return params.getInquiryIdx();
    }

    public List<InquiryResponse> findAll(){
        return inquiryMapper.findAll();
    }
}
