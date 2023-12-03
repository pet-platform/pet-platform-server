package com.petkin.used.dto;

import lombok.Getter;
import lombok.Setter;
/*
CREATE TABLE `USED` (
	`USED_IDX`	BIGINT	NOT NULL,
	`COMMUNITY_IDX`	BIGINT	NOT NULL,
	`MEMBER_IDX`	BIGINT	NOT NULL,
	`USED_PRICE`	VARCHAR(500)	NOT NULL,
	`USED_STATUS`	VARCHAR(500)	NOT NULL,
	PRIMARY KEY(USED_IDX),
	FOREIGN KEY (MEMBER_IDX) REFERENCES member(MEMBER_IDX),
	FOREIGN KEY (COMMUNITY_IDX) REFERENCES community(COMMUNITY_IDX)
);
 */
@Getter
@Setter
public class Used {

    private Long usedIdx;
    private Long communityIdx;
    private Long memberIdx;
    private String usedPrice;
    private String usedStatus;

}
