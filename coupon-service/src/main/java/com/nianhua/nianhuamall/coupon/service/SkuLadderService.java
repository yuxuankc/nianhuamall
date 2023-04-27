package com.nianhua.nianhuamall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nianhua.common.utils.PageUtils;
import com.nianhua.nianhuamall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author kai
 * @email gilardino11@gmail.com
 * @date 2023-04-27 11:39:00
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

