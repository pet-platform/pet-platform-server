package com.petkin.customerservice.inquiry.controller;

import com.petkin.customerservice.inquiry.dto.InquiryRequest;
import com.petkin.customerservice.inquiry.service.InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class InquiryController {

    @Autowired
    InquiryService inquiryService;

    @GetMapping("inquiry/write")
    public String write(){

        return "inquiry/writeInquiry";
    }

    @PostMapping("inquiryProc")
    public String inquiryProc(InquiryRequest params){
        String title = params.getInquiryTitle();
        String content = params.getInquiryContent();
        String status = params.getInquiryStatus();
        params.setInquiryTitle(title);
        params.setInquiryContent(content);
        params.setInquiryStatus(status);
        params.setMemberIdx(1); //임시
        inquiryService.save(params);

        return "redirect:inquiry/list";

    }


    @GetMapping("inquiry/list")
    public String viewInquiryList(){

        return "inquiry/viewInquiryList";
    }

    @GetMapping("inquiry/chatbot")
    public String chatbot(){

        return "inquiry/chatbot";
    }
}
