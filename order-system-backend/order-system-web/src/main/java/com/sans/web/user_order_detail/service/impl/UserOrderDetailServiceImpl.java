package com.sans.web.user_order_detail.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sans.web.user_order_detail.entity.UserOrderDetail;
import com.sans.web.user_order_detail.mapper.UserOrderDetailMapper;
import com.sans.web.user_order_detail.service.UserOrderDetailService;
import org.springframework.stereotype.Service;

/**
* @author Sans
 */
@Service
public class UserOrderDetailServiceImpl extends ServiceImpl<UserOrderDetailMapper, UserOrderDetail> implements UserOrderDetailService {
}
