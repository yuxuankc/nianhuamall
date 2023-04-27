package com.nianhua.nianhuamall.coupon.dao;

import com.nianhua.nianhuamall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author kai
 * @email gilardino11@gmail.com
 * @date 2023-04-27 11:39:00
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
