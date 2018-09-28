package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 广告位表
 * 
 * @author chglee
 * @email 596004778@qq.com
 * @date 2018-09-27 17:05:26
 */
public class AdvPositionDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//广告位置id
	private Long apId;
	//广告位置名
	private String apName;
	//广告位简介
	private String apIntro;
	//广告类别：0图片1文字2幻灯3Flash
	private Integer apClass;
	//广告展示方式：0幻灯片1多广告展示2单广告展示
	private Integer apDisplay;
	//广告位是否启用：0不启用1启用
	private Integer isUse;
	//广告位宽度
	private Integer apWidth;
	//广告位高度
	private Integer apHeight;
	//取值键
	private String apKey;
	//排序
	private Integer apSort;

	/**
	 * 设置：广告位置id
	 */
	public void setApId(Long apId) {
		this.apId = apId;
	}
	/**
	 * 获取：广告位置id
	 */
	public Long getApId() {
		return apId;
	}
	/**
	 * 设置：广告位置名
	 */
	public void setApName(String apName) {
		this.apName = apName;
	}
	/**
	 * 获取：广告位置名
	 */
	public String getApName() {
		return apName;
	}
	/**
	 * 设置：广告位简介
	 */
	public void setApIntro(String apIntro) {
		this.apIntro = apIntro;
	}
	/**
	 * 获取：广告位简介
	 */
	public String getApIntro() {
		return apIntro;
	}
	/**
	 * 设置：广告类别：0图片1文字2幻灯3Flash
	 */
	public void setApClass(Integer apClass) {
		this.apClass = apClass;
	}
	/**
	 * 获取：广告类别：0图片1文字2幻灯3Flash
	 */
	public Integer getApClass() {
		return apClass;
	}
	/**
	 * 设置：广告展示方式：0幻灯片1多广告展示2单广告展示
	 */
	public void setApDisplay(Integer apDisplay) {
		this.apDisplay = apDisplay;
	}
	/**
	 * 获取：广告展示方式：0幻灯片1多广告展示2单广告展示
	 */
	public Integer getApDisplay() {
		return apDisplay;
	}
	/**
	 * 设置：广告位是否启用：0不启用1启用
	 */
	public void setIsUse(Integer isUse) {
		this.isUse = isUse;
	}
	/**
	 * 获取：广告位是否启用：0不启用1启用
	 */
	public Integer getIsUse() {
		return isUse;
	}
	/**
	 * 设置：广告位宽度
	 */
	public void setApWidth(Integer apWidth) {
		this.apWidth = apWidth;
	}
	/**
	 * 获取：广告位宽度
	 */
	public Integer getApWidth() {
		return apWidth;
	}
	/**
	 * 设置：广告位高度
	 */
	public void setApHeight(Integer apHeight) {
		this.apHeight = apHeight;
	}
	/**
	 * 获取：广告位高度
	 */
	public Integer getApHeight() {
		return apHeight;
	}
	/**
	 * 设置：取值键
	 */
	public void setApKey(String apKey) {
		this.apKey = apKey;
	}
	/**
	 * 获取：取值键
	 */
	public String getApKey() {
		return apKey;
	}
	/**
	 * 设置：排序
	 */
	public void setApSort(Integer apSort) {
		this.apSort = apSort;
	}
	/**
	 * 获取：排序
	 */
	public Integer getApSort() {
		return apSort;
	}
}
