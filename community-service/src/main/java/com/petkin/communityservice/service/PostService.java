package com.petkin.communityservice.service;


import com.petkin.communityservice.dto.Post;
import com.petkin.communityservice.mapper.PostMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PostService {

    private final PostMapper postMapper;

    public List<Post> getPostList(Post post) throws Exception {

        int curpage = post.getPage();
        int perPage = post.getPerPage();

        int startPage = (curpage - 1) * perPage;
        post.setPage(startPage);
        post.setPerPage(perPage);

        List<Post> communityList = postMapper.selectPostList(post);

        return communityList;
    }
}
