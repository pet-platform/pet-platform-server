package com.petkin.common.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

/*
CREATE TABLE `REPLY` (
	`REPLY_IDX`	BIGINT	NOT NULL,
	`REPLY_CONTENT`	VARCHAR(1000)	NOT NULL,
	`REPORT_FLAG`	CHAR	NOT NULL	DEFAULT 'N',
	`DELETE_FLAG`	CHAR	NOT NULL	DEFAULT 'N',
	`REGISTER_DATE`	DATETIME	NOT NULL,
	`UPDATE_DATE`	DATETIME	NULL,
	`NESTED_REPLY_IDX`	BIGINT	NOT NULL	DEFAULT 0,
	`RELATE_IDX`	BIGINT	NOT NULL	DEFAULT 0,
	`RELATE_TYPE`	CHAR	NOT NULL,
	PRIMARY KEY(REPLY_IDX)
);
 */
@Getter
@Setter
public class Reply {

    private Long replyIdx;
    private Long relateIdx;
    private Long nestedReplyIdx;
    private String replyContent;
    private String reportFlag;
    private String deleteFlag;
    private String relateType;
    private Timestamp registerDate;
    private Timestamp updateDate;

}
