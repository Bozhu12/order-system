package com.sans.web.address.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sans.web.address.entity.UserAddress;
import com.sans.web.address.mapper.UserAddressMapper;
import com.sans.web.address.service.UserAddressService;
import org.springframework.stereotype.Service;

/**
* @author Sans
 */
@Service
public class UserAddressServiceImpl extends ServiceImpl<UserAddressMapper, UserAddress> implements UserAddressService {
}
