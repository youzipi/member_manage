package com.common;

import lombok.Data;

import java.util.List;

/**
 * Created by youzipi on 16/11/3.
 */
@Data
public class PageBean<T> {
    // 符合条件的记录总数
    private Integer rows;
    // 总页数
    private int totalPages;
    // 每页显示多少条
    private int pageSize = 15;
    // 当前页码
    private int pageNo = 1;
    // 上一页码
    private int prePageNo;
    // 下一页码
    private int nextPageNo;
    // 第一页码
    private int firstPageNo = 1;
    // 最后一页码
    private int lastPageNo;
    // 开始页码
    private int startNo = 1;
    // 结束页码
    private int endNo;
    // 分页开始的条数
    private int startRowNum;
    // 分页结束的条数
    private int endRowNum;

    private List<T> list;
}
