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

import com.bootdo.system.domain.AdvDO;
import com.bootdo.system.service.AdvService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 广告表
 * 
 * @author chglee
 * @email 596004778@qq.com
 * @date 2018-09-27 17:05:30
 */
 
@Controller
@RequestMapping("/system/adv")
public class AdvController {
	@Autowired
	private AdvService advService;
	
	@GetMapping()
	@RequiresPermissions("system:adv:adv")
	String Adv(){
	    return "system/adv/adv";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:adv:adv")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<AdvDO> advList = advService.list(query);
		int total = advService.count(query);
		PageUtils pageUtils = new PageUtils(advList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:adv:add")
	String add(){
	    return "system/adv/add";
	}

	@GetMapping("/edit/{advId}")
	@RequiresPermissions("system:adv:edit")
	String edit(@PathVariable("advId") Long advId,Model model){
		AdvDO adv = advService.get(advId);
		model.addAttribute("adv", adv);
	    return "system/adv/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:adv:add")
	public R save( AdvDO adv){
		if(advService.save(adv)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:adv:edit")
	public R update( AdvDO adv){
		advService.update(adv);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:adv:remove")
	public R remove( Long advId){
		if(advService.remove(advId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:adv:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] advIds){
		advService.batchRemove(advIds);
		return R.ok();
	}
	
}
