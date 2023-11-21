package com.petkin.communityservice.vo;

import lombok.Getter;
import lombok.Setter;
/*
CREATE TABLE `JOB` (
	`JOB_IDX`	BIGINT	NOT NULL,
	`COMMUNITY_IDX`	BIGINT	NOT NULL,
	`SALARY`	VARCHAR(500)	NOT NULL,
	`SALARY_TYPE`	VARCHAR(100)	NOT NULL,
	`WORK_START_DATE`	VARCHAR(1000)	NOT NULL,
	`WORK_END_DATE`	VARCHAR(1000)	NOT NULL,
	`WORK_START_TIME`	VARCHAR(1000)	NOT NULL,
	`WORK_END_TIME`	VARCHAR(1000)	NOT NULL,
	`JOB_STATUS`	VARCHAR(1000)	NOT NULL,
	PRIMARY KEY(JOB_IDX),
	FOREIGN KEY (COMMUNITY_IDX) REFERENCES community(COMMUNITY_IDX)
);

 */
@Getter
@Setter
public class Job {

    private Long job_idx,community_idx;
    private String salary,salary_type,work_start_date,
            work_end_date,work_start_time,work_end_time,job_status;

}
