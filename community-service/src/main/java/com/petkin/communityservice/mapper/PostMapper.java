package com.petkin.communityservice.mapper;

import com.petkin.communityservice.dto.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostMapper {

    List<Post> selectPostList(Post post) throws Exception;


}
