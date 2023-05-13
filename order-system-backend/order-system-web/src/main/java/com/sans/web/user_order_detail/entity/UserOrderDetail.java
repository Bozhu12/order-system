package com.sans.web.user_order_detail.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
* @author Sans
 */
@Data
@TableName("user_order_detail")
public class UserOrderDetail {
    @TableId(type = IdType.AUTO)
    private Long detailId;
    private Long orderId;
    private Long goodsId;
    private String goodsImage;
    private String goodsName;
    private String goodsUnit;
    private String specsName;
    private BigDecimal price;
    private Integer num;
}