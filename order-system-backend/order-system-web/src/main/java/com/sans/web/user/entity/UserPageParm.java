package com.sans.web.user.entity;

import lombok.Data;

/**
* @author Sans
 */
@Data
public class UserPageParm {
    private Integer currentPage; //当前页
    private Integer pageSize;//每页查询的条数
    private String name;
    private String phone;
}
