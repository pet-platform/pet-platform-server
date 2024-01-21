package com.petkin.communityservice.dto;

import lombok.Getter;
import lombok.Setter;
/*
CREATE TABLE `HASH_TAG` (
	`HASH_TAG_IDX`	BIGINT	NOT NULL,
	`HASH_TAG_NAME` VARCHAR(500)	NOT NULL,
	`RELATE_IDX`	BIGINT	NOT NULL,
	`RELATE_TYPE`	VARCHAR(100) NOT NULL,
	PRIMARY KEY(HASH_TAG_IDX)
);
 */
@Getter
@Setter
public class Hash_tag {

    private Long hashTagIdx;
    private Long relateIdx;
    private String hashTagName;
    private String relateType;

}
