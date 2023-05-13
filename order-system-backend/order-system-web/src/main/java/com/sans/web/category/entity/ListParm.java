package com.sans.web.category.entity;

import lombok.Data;

/**
* @author Sans
 */
@Data
public class ListParm {
    private Integer currentPage; //当前页
    private Integer pageSize;//每页查询的条数
    private String categoryName;
}
