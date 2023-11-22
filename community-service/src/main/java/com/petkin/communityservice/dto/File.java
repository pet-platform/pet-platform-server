package com.petkin.communityservice.dto;
/*
CREATE TABLE `FILE` (
	`FILE_IDX`	BIGINT	NOT NULL,
	`FILE_NAME`	VARCHAR(500)	NOT NULL,
	`FILE_PATH`	VARCHAR(500)	NOT NULL,
	`REGISTER_DATE`	DATETIME	NOT NULL,
	`UPDATE_DATE`	DATETIME	NOT NULL,
	`RELATE_IDX`	BIGINT	NOT NULL,
	`RELATE_TYPE`	CHAR	NOT NULL,
	PRIMARY KEY(FILE_IDX)
);
 */

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class File {

    private Long fileIdx;
    private Long relateIdx;

    private String fileName;
    private String filePath;
    private String relateType;

    private Timestamp registerDate;
    private Timestamp updateDate;

}
