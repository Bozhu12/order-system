package com.sans.web.wxapi.entity;

import lombok.Data;

/**
* @author Sans
 */
@Data
public class LoginVo {
    private String openid;
    private String sessionKey;
}
