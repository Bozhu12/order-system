package com.sans.web.goods.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sans.web.goods.entity.GoodsParm;
import com.sans.web.goods.entity.SysGoods;

/**
* @author Sans
 */
public interface SysGoodsService extends IService<SysGoods> {
    //保存
    void saveGoods(GoodsParm parm);
    //编辑
    void editGoods(GoodsParm parm);
    //删除
    void deleteGoods(Long goodsId);
}
