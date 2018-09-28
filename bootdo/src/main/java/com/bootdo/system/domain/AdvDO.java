package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 广告表
 * 
 * @author chglee
 * @email 596004778@qq.com
 * @date 2018-09-27 17:05:30
 */
public class AdvDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//广告自增标识编号
	private Long advId;
	//广告位id
	private Long apId;
	//标题
	private String advTitle;
	//广告内容
	private String advUrl;
	//广告开始时间
	private Long startDate;
	//广告结束时间
	private Long endDate;
	//幻灯片排序
	private Integer sort;
	//广告点击率
	private Integer clickNum;
	//
	private String resUrl;

	/**
	 * 设置：广告自增标识编号
	 */
	public void setAdvId(Long advId) {
		this.advId = advId;
	}
	/**
	 * 获取：广告自增标识编号
	 */
	public Long getAdvId() {
		return advId;
	}
	/**
	 * 设置：广告位id
	 */
	public void setApId(Long apId) {
		this.apId = apId;
	}
	/**
	 * 获取：广告位id
	 */
	public Long getApId() {
		return apId;
	}
	/**
	 * 设置：标题
	 */
	public void setAdvTitle(String advTitle) {
		this.advTitle = advTitle;
	}
	/**
	 * 获取：标题
	 */
	public String getAdvTitle() {
		return advTitle;
	}
	/**
	 * 设置：广告内容
	 */
	public void setAdvUrl(String advUrl) {
		this.advUrl = advUrl;
	}
	/**
	 * 获取：广告内容
	 */
	public String getAdvUrl() {
		return advUrl;
	}
	/**
	 * 设置：广告开始时间
	 */
	public void setStartDate(Long startDate) {
		this.startDate = startDate;
	}
	/**
	 * 获取：广告开始时间
	 */
	public Long getStartDate() {
		return startDate;
	}
	/**
	 * 设置：广告结束时间
	 */
	public void setEndDate(Long endDate) {
		this.endDate = endDate;
	}
	/**
	 * 获取：广告结束时间
	 */
	public Long getEndDate() {
		return endDate;
	}
	/**
	 * 设置：幻灯片排序
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	/**
	 * 获取：幻灯片排序
	 */
	public Integer getSort() {
		return sort;
	}
	/**
	 * 设置：广告点击率
	 */
	public void setClickNum(Integer clickNum) {
		this.clickNum = clickNum;
	}
	/**
	 * 获取：广告点击率
	 */
	public Integer getClickNum() {
		return clickNum;
	}
	/**
	 * 设置：
	 */
	public void setResUrl(String resUrl) {
		this.resUrl = resUrl;
	}
	/**
	 * 获取：
	 */
	public String getResUrl() {
		return resUrl;
	}
}
