package com.sans.web.wx_user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sans.web.wx_user.entity.WxUser;
import com.sans.web.wx_user.mapper.WxUserMapper;
import com.sans.web.wx_user.service.WxUserService;
import org.springframework.stereotype.Service;

/**
* @author Sans
 */
@Service
public class WxUserServiceImpl extends ServiceImpl<WxUserMapper, WxUser> implements WxUserService {

    @Override
    public int saveOrUpdateInfo(WxUser user) {
        return this.baseMapper.saveOrUpdateInfo(user);
    }
}
