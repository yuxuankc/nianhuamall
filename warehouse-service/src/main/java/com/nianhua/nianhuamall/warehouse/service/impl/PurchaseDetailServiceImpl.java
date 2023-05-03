package com.nianhua.nianhuamall.warehouse.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nianhua.nianhuamall.common.utils.PageUtils;
import com.nianhua.nianhuamall.common.utils.Query;

import com.nianhua.nianhuamall.warehouse.dao.PurchaseDetailDao;
import com.nianhua.nianhuamall.warehouse.entity.PurchaseDetailEntity;
import com.nianhua.nianhuamall.warehouse.service.PurchaseDetailService;


@Service("purchaseDetailService")
public class PurchaseDetailServiceImpl extends ServiceImpl<PurchaseDetailDao, PurchaseDetailEntity> implements PurchaseDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PurchaseDetailEntity> page = this.page(
                new Query<PurchaseDetailEntity>().getPage(params),
                new QueryWrapper<PurchaseDetailEntity>()
        );

        return new PageUtils(page);
    }

}