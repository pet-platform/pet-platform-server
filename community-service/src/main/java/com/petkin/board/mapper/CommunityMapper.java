package com.petkin.board.mapper;

import com.petkin.board.dto.Community;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommunityMapper {
    List<Community> findAll();
}
