package com.sans.web.goods_specs.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
* @author Sans
 */
@Data
@TableName("sys_goods_specs")
public class SysGoodsSpecs {
    @TableId(type = IdType.AUTO)
    private Long specsId;
    private Long goodsId;
    private String specsName;
    private BigDecimal goodsPrice;
    private Integer orderNum;
}
