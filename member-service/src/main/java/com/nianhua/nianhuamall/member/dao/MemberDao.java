package com.nianhua.nianhuamall.member.dao;

import com.nianhua.nianhuamall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author kai
 * @email gilardino11@gmail.com
 * @date 2023-05-01 17:08:55
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
