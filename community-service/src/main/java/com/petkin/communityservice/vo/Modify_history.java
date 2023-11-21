package com.petkin.communityservice.vo;
import lombok.Getter;
import lombok.Setter;

/*
CREATE TABLE `MODIFY_HISTORY` (
	`MODIFY_HISTORY_IDX`	BIGINT	NOT NULL,
	`COMMUNITY_IDX`	BIGINT	NOT NULL,
	`MODIFY_CONTENT`	VARCHAR(255)	NULL,
	PRIMARY KEY(MODIFY_HISTORY_IDX),
	FOREIGN KEY (COMMUNITY_IDX) REFERENCES COMMUNITY(COMMUNITY_IDX)
);
 */
@Getter
@Setter
public class Modify_history {

    private Long modify_history_idx,community_idx;
    private String modify_content;

}
