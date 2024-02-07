package com.petkin.customerservice.inquiry.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchDto {

    private int page;
    private int recordSize;
    private int pageSize;
    private String keyword;
    private String searchType;
    private Pagination pagination;

    public SearchDto(){
        this.page = 1;
        this.recordSize = 5;
        this.pageSize = 10;
    }

    public int getOffset(){
        return (page -1)* recordSize;
    }
}
