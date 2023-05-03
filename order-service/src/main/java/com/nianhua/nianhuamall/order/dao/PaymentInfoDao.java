package com.nianhua.nianhuamall.order.dao;

import com.nianhua.nianhuamall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author kai
 * @email gilardino11@gmail.com
 * @date 2023-05-01 17:11:07
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
