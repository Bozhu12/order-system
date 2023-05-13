package com.sans.web.wx_user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sans.web.wx_user.entity.WxUser;

/**
* @author Sans
 */
public interface WxUserService extends IService<WxUser> {
    int saveOrUpdateInfo(WxUser user);
}
