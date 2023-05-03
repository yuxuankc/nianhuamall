package com.nianhua.nianhuamall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nianhua.nianhuamall.common.utils.PageUtils;
import com.nianhua.nianhuamall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author kai
 * @email gilardino11@gmail.com
 * @date 2023-05-01 17:08:55
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

