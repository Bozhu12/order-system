package com.sans.web.user_collect.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sans.web.user_collect.entity.UserCollect;


import java.util.List;

/**
* @author Sans
 */
public interface UserCollectService extends IService<UserCollect> {
    List<UserCollect> getList(String openid);
}
