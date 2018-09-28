package com.bootdo.system.dao;

import com.bootdo.system.domain.AdvDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 广告表
 * @author chglee
 * @email 596004778@qq.com
 * @date 2018-09-27 17:05:30
 */
@Mapper
public interface AdvDao {

	AdvDO get(Long advId);
	
	List<AdvDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AdvDO adv);
	
	int update(AdvDO adv);
	
	int remove(Long adv_id);
	
	int batchRemove(Long[] advIds);
}
