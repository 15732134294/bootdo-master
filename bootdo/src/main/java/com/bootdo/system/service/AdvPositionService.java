package com.bootdo.system.service;

import com.bootdo.system.domain.AdvPositionDO;

import java.util.List;
import java.util.Map;

/**
 * 广告位表
 * 
 * @author chglee
 * @email 596004778@qq.com
 * @date 2018-09-27 17:05:26
 */
public interface AdvPositionService {
	
	AdvPositionDO get(Long apId);
	
	List<AdvPositionDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AdvPositionDO advPosition);
	
	int update(AdvPositionDO advPosition);
	
	int remove(Long apId);
	
	int batchRemove(Long[] apIds);
}
