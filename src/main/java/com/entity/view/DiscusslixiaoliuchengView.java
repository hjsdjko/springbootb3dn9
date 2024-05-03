package com.entity.view;

import com.entity.DiscusslixiaoliuchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 离校流程评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-26 21:33:29
 */
@TableName("discusslixiaoliucheng")
public class DiscusslixiaoliuchengView  extends DiscusslixiaoliuchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusslixiaoliuchengView(){
	}
 
 	public DiscusslixiaoliuchengView(DiscusslixiaoliuchengEntity discusslixiaoliuchengEntity){
 	try {
			BeanUtils.copyProperties(this, discusslixiaoliuchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
