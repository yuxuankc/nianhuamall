package com.nianhua.nianhuamall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.nianhua.nianhuamall.common.utils.PageUtils;
import com.nianhua.nianhuamall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author kai
 * @email gilardino11@gmail.com
 * @date 2023-05-01 17:08:55
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

