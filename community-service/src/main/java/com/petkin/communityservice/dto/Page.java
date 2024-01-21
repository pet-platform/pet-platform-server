package com.petkin.communityservice.dto;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("PageDto")
public class Page {

    private int startPage;
    private int page;
    private int perPage;
}
