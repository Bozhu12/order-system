package com.sans.web.user_order.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
* @author Sans
 */
@Data
public class ParmDetail {
    private Long goodsId;
    private String goodsImage;
    private String goodsName;
    private String goodsUnit;
    private String specsName;
    private BigDecimal price;
    private Integer num;
}