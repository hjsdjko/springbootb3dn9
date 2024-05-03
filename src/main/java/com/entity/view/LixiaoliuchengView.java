package com.entity.view;

import com.entity.LixiaoliuchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 离校流程
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-26 21:33:29
 */
@TableName("lixiaoliucheng")
public class LixiaoliuchengView  extends LixiaoliuchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LixiaoliuchengView(){
	}
 
 	public LixiaoliuchengView(LixiaoliuchengEntity lixiaoliuchengEntity){
 	try {
			BeanUtils.copyProperties(this, lixiaoliuchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
