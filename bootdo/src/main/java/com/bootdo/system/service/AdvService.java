package com.bootdo.system.service;

import com.bootdo.system.domain.AdvDO;

import java.util.List;
import java.util.Map;

/**
 * 广告表
 * 
 * @author chglee
 * @email 596004778@qq.com
 * @date 2018-09-27 17:05:30
 */
public interface AdvService {
	
	AdvDO get(Long advId);
	
	List<AdvDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AdvDO adv);
	
	int update(AdvDO adv);
	
	int remove(Long advId);
	
	int batchRemove(Long[] advIds);
}
