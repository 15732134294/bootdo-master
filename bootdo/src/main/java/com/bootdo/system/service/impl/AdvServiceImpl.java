package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.AdvDao;
import com.bootdo.system.domain.AdvDO;
import com.bootdo.system.service.AdvService;



@Service
public class AdvServiceImpl implements AdvService {
	@Autowired
	private AdvDao advDao;
	
	@Override
	public AdvDO get(Long advId){
		return advDao.get(advId);
	}
	
	@Override
	public List<AdvDO> list(Map<String, Object> map){
		return advDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return advDao.count(map);
	}
	
	@Override
	public int save(AdvDO adv){
		return advDao.save(adv);
	}
	
	@Override
	public int update(AdvDO adv){
		return advDao.update(adv);
	}
	
	@Override
	public int remove(Long advId){
		return advDao.remove(advId);
	}
	
	@Override
	public int batchRemove(Long[] advIds){
		return advDao.batchRemove(advIds);
	}
	
}
