package com.petkin.customerservice.inquiry.controller;

import com.petkin.customerservice.inquiry.dto.InquiryRequest;
import com.petkin.customerservice.inquiry.service.InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("inquiry")
public class InquiryController {

    @Autowired
    InquiryService inquiryService;

    @GetMapping("/write")
    public String write(){

        return "inquiry/write";
    }

    @PostMapping("/proc")
    public String inquiryProc(InquiryRequest params){
        params.setMemberIdx(1); //임시 하드코딩 --추후 로그인 정보 연동 되면 수정 예정
        inquiryService.save(params);

        return "redirect:/inquiry/list";

    }


    @GetMapping("/list")
    public String viewInquiryList(){

        return "inquiry/viewList";
    }

    @GetMapping("/chatbot")
    public String chatbot(){

        return "inquiry/chatbot";
    }
}
