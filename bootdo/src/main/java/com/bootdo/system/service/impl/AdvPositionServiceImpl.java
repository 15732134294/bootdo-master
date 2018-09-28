package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.AdvPositionDao;
import com.bootdo.system.domain.AdvPositionDO;
import com.bootdo.system.service.AdvPositionService;



@Service
public class AdvPositionServiceImpl implements AdvPositionService {
	@Autowired
	private AdvPositionDao advPositionDao;
	
	@Override
	public AdvPositionDO get(Long apId){
		return advPositionDao.get(apId);
	}
	
	@Override
	public List<AdvPositionDO> list(Map<String, Object> map){
		return advPositionDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return advPositionDao.count(map);
	}
	
	@Override
	public int save(AdvPositionDO advPosition){
		return advPositionDao.save(advPosition);
	}
	
	@Override
	public int update(AdvPositionDO advPosition){
		return advPositionDao.update(advPosition);
	}
	
	@Override
	public int remove(Long apId){
		return advPositionDao.remove(apId);
	}
	
	@Override
	public int batchRemove(Long[] apIds){
		return advPositionDao.batchRemove(apIds);
	}
	
}
