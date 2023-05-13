package com.sans.web.category.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sans.web.category.entity.SysCategory;
import com.sans.web.category.mapper.SysCategoryMapper;
import com.sans.web.category.service.SysCategoryService;
import org.springframework.stereotype.Service;

/**
* @author Sans
 */
@Service
public class SysCategoryServiceImpl extends ServiceImpl<SysCategoryMapper, SysCategory> implements SysCategoryService {
}
