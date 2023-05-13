package com.sans.web.goods_specs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sans.web.goods_specs.entity.SysGoodsSpecs;
import com.sans.web.goods_specs.mapper.SysGoodsSpecsMapper;
import com.sans.web.goods_specs.service.SysGoodsSpecsService;
import org.springframework.stereotype.Service;

/**
* @author Sans
 */
@Service
public class SysGoodsSpecsServiceImpl extends ServiceImpl<SysGoodsSpecsMapper,SysGoodsSpecs> implements SysGoodsSpecsService {
}
