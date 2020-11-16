package com.qr.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;

@Data
public class PageResult {
//    当前页码
private int pageNum;
//    每页数量
private int pageSize;
//    记录总数
private long totalSize;
//    页码总数
private int totalPages;
//    数据模型
private List<?> content;
}
