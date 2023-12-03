package com.petkin.common.dto;

import lombok.Getter;
import lombok.Setter;

/*
CREATE TABLE `LIKE` (
	`MEMBER_IDX`	BIGINT	NOT NULL,
	`RELATE_IDX`	BIGINT	NOT NULL,
	`RELATE_TYPE`	CHAR	NOT NULL,
	FOREIGN KEY (MEMBER_IDX) REFERENCES member(MEMBER_IDX)
);

 */
@Getter
@Setter
public class Like {

    private Long memberIdx;
    private Long relateIdx;

    private String relateType;

}
