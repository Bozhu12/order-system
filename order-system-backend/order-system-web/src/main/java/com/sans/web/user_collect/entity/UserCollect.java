package com.sans.web.user_collect.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
* @author Sans
 */
@Data
@TableName("user_collect")
public class UserCollect {
    @TableId(type = IdType.AUTO)
    private Long collectId;
    private String openid;
    @TableField(exist = false)
    private String goodsName;
    @TableField(exist = false)
    private String goodsImage;
    private Long goodsId;
}
