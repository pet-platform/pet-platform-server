package com.petkin.communityservice.dto;

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

    private Long jobIdx;
    private Long communityIdx;

    private String salary;
    private String salaryType;
    private String workStartDate;
    private String workEndDate;
    private String workStartTime;
    private String workEndTime;
    private String jobStatus;

}
