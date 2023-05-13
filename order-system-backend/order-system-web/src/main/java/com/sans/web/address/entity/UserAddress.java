package com.sans.web.address.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
* @author Sans
 */
@Data
@TableName("user_address")
public class UserAddress {
    @TableId(type = IdType.AUTO)
    private Long addressId;
    private String openid;
    private String userName;
    private String phone;
    private String area;
    private String address;
    private String status;
}
