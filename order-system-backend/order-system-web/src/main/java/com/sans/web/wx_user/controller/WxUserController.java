package com.sans.web.wx_user.controller;

import com.sans.utils.ResultUtils;
import com.sans.utils.ResultVo;
import com.sans.web.user.entity.SysUser;
import com.sans.web.wx_user.entity.WxUser;
import com.sans.web.wx_user.service.WxUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
* @author Sans
 */
@RestController
@RequestMapping("/wxapi/wxUser")
public class WxUserController {
    @Autowired
    private WxUserService wxUserService;

    @PostMapping("/saveOrUpdate")
    public ResultVo saveOrUpdate(@RequestBody WxUser wxUser){
        wxUserService.saveOrUpdate(wxUser);
        return ResultUtils.success("更新成功!");
    }

    //查询头像昵称
    @GetMapping("/getUserInfo")
    public ResultVo getUserInfo(String openid) {
        WxUser user = wxUserService.getById(openid);
        return ResultUtils.error("查询成功!",user);
    }
}