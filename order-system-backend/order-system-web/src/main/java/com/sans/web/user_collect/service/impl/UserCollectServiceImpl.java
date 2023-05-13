package com.sans.web.user_collect.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sans.web.user_collect.entity.UserCollect;
import com.sans.web.user_collect.mapper.UserCollectMapper;
import com.sans.web.user_collect.service.UserCollectService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Sans
 */
@Service
public class UserCollectServiceImpl extends ServiceImpl<UserCollectMapper, UserCollect> implements UserCollectService {
    @Override
    public List<UserCollect> getList(String openid) {
        return this.baseMapper.getList(openid);
    }
}
