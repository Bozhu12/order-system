package com.sans.web.wx_user.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
* @author Sans
 */
@Data
@TableName("wx_user")
public class WxUser {
    @TableId
    private String openid;
    private String nickName;
    private String avatarUrl;
}
