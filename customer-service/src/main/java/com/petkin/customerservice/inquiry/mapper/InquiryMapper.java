package com.petkin.customerservice.inquiry.mapper;

import com.petkin.customerservice.inquiry.dto.InquiryRequest;
import com.petkin.customerservice.inquiry.dto.InquiryResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InquiryMapper {
    void save(InquiryRequest params);

    InquiryResponse findById(int inquiryIdx);

    List<InquiryResponse> findAll();

}
