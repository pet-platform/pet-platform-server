package com.petkin.common.dto;

import lombok.Getter;
import lombok.Setter;
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
public class Post {

    private Long postIdx;
    private Long communityIdx;
    private Long memberIdx;

    private String noticeFlag;

}
