package com.nianhua.nianhuamall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nianhua.nianhuamall.common.utils.PageUtils;
import com.nianhua.nianhuamall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author kai
 * @email gilardino11@gmail.com
 * @date 2023-05-01 17:11:07
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

