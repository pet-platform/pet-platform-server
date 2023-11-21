package com.petkin.communityservice.vo;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

/*
CREATE TABLE `COMMUNITY` (
	`COMMUNITY_IDX`	BIGINT	NOT NULL,
	`MEMBER_IDX`	BIGINT	NOT NULL,
	`COMMUNITY_CATEGORY`	CHAR	NOT NULL,
	`COMMUNITY_TITLE`	VARCHAR(1000)	NOT NULL,
	`COMMUNITY_CONTENT`	TEXT	NOT NULL,
	`COMMUNITY_PLACE`	VARCHAR(500)	NOT NULL,
	`HIT`	INT	NOT NULL	DEFAULT 0,
	`REGISTER_DATE`	DATETIME	NOT NULL,
	`UPDATE_DATE`	DATETIME	NULL,
	`REPORT_FLAG`	CHAR	NOT NULL	DEFAULT 'N',
	`DELETE_FLAG`	CHAR	NOT NULL	DEFAULT 'N',
	PRIMARY KEY(COMMUNITY_IDX),
	FOREIGN KEY (MEMBER_IDX) REFERENCES member(MEMBER_IDX)
);
 */
@Getter
@Setter
public class Community {

    private Long community_idx,member_idx;
    private int hit;
    private String community_title,community_place;
    private String community_category,report_flag,delete_flag;
    private Timestamp register_date,update_date;

}
