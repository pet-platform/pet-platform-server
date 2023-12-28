package com.petkin.communityservice.dto;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;

/*
CREATE TABLE `POST` (
	`POST_IDX`	BIGINT	NOT NULL,
	`COMMUNITY_IDX`	BIGINT	NOT NULL,
	`MEMBER_IDX`	BIGINT	NOT NULL,
	`NOTICE_FLAG`	CHAR	NOT NULL	DEFAULT 'N',
	PRIMARY KEY(POST_IDX),
	FOREIGN KEY (MEMBER_IDX) REFERENCES member(MEMBER_IDX),
	FOREIGN KEY (COMMUNITY_IDX) REFERENCES community(COMMUNITY_IDX)
);
 */
@Getter
@Setter
@Alias("PostDto")
public class Post extends Page{

    private Long postIdx;
    private Long communityIdx;
    private Long memberIdx;

    private String noticeFlag;

    private int hit;

    private String communityTitle;
    private String communityPlace;
    private String communityCategory;
    private String reportFlag;

    private Timestamp registerDate;
    private Timestamp updateDate;

    private int rowNum;
    private int likeCnt;

    /* 검색 */

    private String searchSort;
    private String searchText;

}
