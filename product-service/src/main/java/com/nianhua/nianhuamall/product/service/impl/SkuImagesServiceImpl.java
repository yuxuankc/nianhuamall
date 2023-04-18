package com.nianhua.nianhuamall.product.service.impl;

import com.nianhua.nianhuamall.common.utils.PageUtils;
import com.nianhua.nianhuamall.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
;

import com.nianhua.nianhuamall.product.dao.SkuImagesDao;
import com.nianhua.nianhuamall.product.entity.SkuImagesEntity;
import com.nianhua.nianhuamall.product.service.SkuImagesService;


@Service("skuImagesService")
public class SkuImagesServiceImpl extends ServiceImpl<SkuImagesDao, SkuImagesEntity> implements SkuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuImagesEntity> page = this.page(
                new Query<SkuImagesEntity>().getPage(params),
                new QueryWrapper<SkuImagesEntity>()
        );

        return new PageUtils(page);
    }

}