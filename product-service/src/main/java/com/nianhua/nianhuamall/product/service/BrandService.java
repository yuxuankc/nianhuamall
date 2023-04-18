package com.nianhua.nianhuamall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nianhua.nianhuamall.common.utils.PageUtils;
import com.nianhua.nianhuamall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author kai
 * @email gilardino11@gmail.com
 * @date 2023-04-04 12:22:26
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

