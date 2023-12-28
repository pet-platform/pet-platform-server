package com.petkin.communityservice.controller;

import com.petkin.communityservice.dto.Post;
import com.petkin.communityservice.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
public class PostController {

    private final PostService postService;

    @RequestMapping("/post/list")
    public List<Post> postList(Post post) throws Exception {

        return postService.getPostList(post);
    }
}
