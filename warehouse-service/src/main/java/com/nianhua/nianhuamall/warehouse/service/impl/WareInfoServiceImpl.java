package com.nianhua.nianhuamall.warehouse.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nianhua.nianhuamall.common.utils.PageUtils;
import com.nianhua.nianhuamall.common.utils.Query;

import com.nianhua.nianhuamall.warehouse.dao.WareInfoDao;
import com.nianhua.nianhuamall.warehouse.entity.WareInfoEntity;
import com.nianhua.nianhuamall.warehouse.service.WareInfoService;


@Service("wareInfoService")
public class WareInfoServiceImpl extends ServiceImpl<WareInfoDao, WareInfoEntity> implements WareInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareInfoEntity> page = this.page(
                new Query<WareInfoEntity>().getPage(params),
                new QueryWrapper<WareInfoEntity>()
        );

        return new PageUtils(page);
    }

}