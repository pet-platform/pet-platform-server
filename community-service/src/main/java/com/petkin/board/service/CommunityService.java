package com.petkin.board.service;

import com.petkin.board.dto.Community;
import com.petkin.board.mapper.CommunityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommunityService {
    private final CommunityMapper communityMapper;
    public List<Community> findAll() {

        return communityMapper.findAll();
    }
}
