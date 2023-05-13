package com.sans.web.user_order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sans.web.user_order.entity.SunList;
import com.sans.web.user_order.entity.UserOrder;

import java.util.List;


/**
* @author Sans
 */
public interface UserOrderMapper extends BaseMapper<UserOrder> {
    //按天查询
    List<SunList> getDays();
    //按月查询
    List<SunList> getMonths();
    //按年查询
    List<SunList> getYears();

}
