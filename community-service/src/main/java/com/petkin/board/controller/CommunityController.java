package com.petkin.board.controller;

import com.petkin.board.dto.Community;
import com.petkin.board.service.CommunityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api/community")
@RequiredArgsConstructor
public class CommunityController {
    private final CommunityService communityService;

    @GetMapping("/list")
    @ResponseStatus(HttpStatus.OK)
    public String getCommunityList(Model model){
        List<Community> communityList = communityService.findAll();
        model.addAttribute("communityList", communityList);
        return "list";
    }

}
