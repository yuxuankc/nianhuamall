package com.nianhua.nianhuamall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nianhua.common.utils.PageUtils;
import com.nianhua.nianhuamall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author kai
 * @email gilardino11@gmail.com
 * @date 2023-04-27 11:39:00
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

