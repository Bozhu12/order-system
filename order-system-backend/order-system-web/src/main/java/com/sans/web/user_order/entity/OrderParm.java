package com.sans.web.user_order.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
* @author Sans
 */
@Data
public class OrderParm {
    private String openid;
    private String userName;
    private String phone;
    private String address;
    private BigDecimal price;
    //订单对应的商品
    private List<ParmDetail> details = new ArrayList<>();
}
