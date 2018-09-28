package com.bootdo.system.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.system.domain.AdvPositionDO;
import com.bootdo.system.service.AdvPositionService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 广告位表
 * 
 * @author chglee
 * @email 596004778@qq.com
 * @date 2018-09-27 17:05:26
 */
 
@Controller
@RequestMapping("/system/advPosition")
public class AdvPositionController {
	@Autowired
	private AdvPositionService advPositionService;
	
	@GetMapping()
	@RequiresPermissions("system:advPosition:advPosition")
	String AdvPosition(){
	    return "system/advPosition/advPosition";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:advPosition:advPosition")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<AdvPositionDO> advPositionList = advPositionService.list(query);
		int total = advPositionService.count(query);
		PageUtils pageUtils = new PageUtils(advPositionList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:advPosition:add")
	String add(){
	    return "system/advPosition/add";
	}

	@GetMapping("/edit/{apId}")
	@RequiresPermissions("system:advPosition:edit")
	String edit(@PathVariable("apId") Long apId,Model model){
		AdvPositionDO advPosition = advPositionService.get(apId);
		model.addAttribute("advPosition", advPosition);
	    return "system/advPosition/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:advPosition:add")
	public R save( AdvPositionDO advPosition){
		if(advPositionService.save(advPosition)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:advPosition:edit")
	public R update( AdvPositionDO advPosition){
		advPositionService.update(advPosition);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:advPosition:remove")
	public R remove( Long apId){
		if(advPositionService.remove(apId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:advPosition:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] apIds){
		advPositionService.batchRemove(apIds);
		return R.ok();
	}
	
}
