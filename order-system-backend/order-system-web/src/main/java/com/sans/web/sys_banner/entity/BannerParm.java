package com.sans.web.sys_banner.entity;

import lombok.Data;

/**
* @author Sans
 */
@Data
public class BannerParm {
    private Integer currentPage; //当前页
    private Integer pageSize;//每页查询的条数
    private String title;
}
