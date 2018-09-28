package com.bootdo.system.dao;

import com.bootdo.system.domain.AdvPositionDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 广告位表
 * @author chglee
 * @email 596004778@qq.com
 * @date 2018-09-27 17:05:26
 */
@Mapper
public interface AdvPositionDao {

	AdvPositionDO get(Long apId);
	
	List<AdvPositionDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AdvPositionDO advPosition);
	
	int update(AdvPositionDO advPosition);
	
	int remove(Long ap_id);
	
	int batchRemove(Long[] apIds);
}
