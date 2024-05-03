package com.entity.view;

import com.entity.LunwenshenheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 论文审核
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-26 21:33:29
 */
@TableName("lunwenshenhe")
public class LunwenshenheView  extends LunwenshenheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LunwenshenheView(){
	}
 
 	public LunwenshenheView(LunwenshenheEntity lunwenshenheEntity){
 	try {
			BeanUtils.copyProperties(this, lunwenshenheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
