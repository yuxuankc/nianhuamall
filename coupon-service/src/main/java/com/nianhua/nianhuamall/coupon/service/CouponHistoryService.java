package com.nianhua.nianhuamall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nianhua.common.utils.PageUtils;
import com.nianhua.nianhuamall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author kai
 * @email gilardino11@gmail.com
 * @date 2023-04-27 11:39:00
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

