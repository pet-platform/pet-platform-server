package com.petkin.customerservice.inquiry.service;

import com.petkin.customerservice.inquiry.dto.*;
import com.petkin.customerservice.inquiry.mapper.InquiryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InquiryService {

    private final InquiryMapper inquiryMapper;

    public int save(final InquiryRequest params){
        inquiryMapper.save(params);
        return params.getInquiryIdx();
    }

    public PagingResponse<InquiryResponse> findAll(final SearchDto params){

        int count = inquiryMapper.count(params);
        if(count < 1){
            return new PagingResponse<>(Collections.emptyList(), null);
        }

        Pagination pagination = new Pagination(count, params);
        params.setPagination(pagination);

        List<InquiryResponse> list = inquiryMapper.findAll(params);
        return new PagingResponse<>(list, pagination);
    }
}
