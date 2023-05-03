package com.nianhua.nianhuamall.warehouse.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nianhua.nianhuamall.common.utils.PageUtils;
import com.nianhua.nianhuamall.warehouse.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author kai
 * @email gilardino11@gmail.com
 * @date 2023-05-01 17:12:19
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

