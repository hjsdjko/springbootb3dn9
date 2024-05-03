package com.entity.vo;

import com.entity.LunwenshenheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 论文审核
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-26 21:33:29
 */
public class LunwenshenheVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 论文选题
	 */
	
	private String lunwenxuanti;
		
	/**
	 * 论文
	 */
	
	private String lunwen;
		
	/**
	 * 查重报告
	 */
	
	private String chazhongbaogao;
		
	/**
	 * 论文答辩成绩
	 */
	
	private String lunwendabianchengji;
		
	/**
	 * 答辩日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dabianriqi;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
				
	
	/**
	 * 设置：论文选题
	 */
	 
	public void setLunwenxuanti(String lunwenxuanti) {
		this.lunwenxuanti = lunwenxuanti;
	}
	
	/**
	 * 获取：论文选题
	 */
	public String getLunwenxuanti() {
		return lunwenxuanti;
	}
				
	
	/**
	 * 设置：论文
	 */
	 
	public void setLunwen(String lunwen) {
		this.lunwen = lunwen;
	}
	
	/**
	 * 获取：论文
	 */
	public String getLunwen() {
		return lunwen;
	}
				
	
	/**
	 * 设置：查重报告
	 */
	 
	public void setChazhongbaogao(String chazhongbaogao) {
		this.chazhongbaogao = chazhongbaogao;
	}
	
	/**
	 * 获取：查重报告
	 */
	public String getChazhongbaogao() {
		return chazhongbaogao;
	}
				
	
	/**
	 * 设置：论文答辩成绩
	 */
	 
	public void setLunwendabianchengji(String lunwendabianchengji) {
		this.lunwendabianchengji = lunwendabianchengji;
	}
	
	/**
	 * 获取：论文答辩成绩
	 */
	public String getLunwendabianchengji() {
		return lunwendabianchengji;
	}
				
	
	/**
	 * 设置：答辩日期
	 */
	 
	public void setDabianriqi(Date dabianriqi) {
		this.dabianriqi = dabianriqi;
	}
	
	/**
	 * 获取：答辩日期
	 */
	public Date getDabianriqi() {
		return dabianriqi;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
