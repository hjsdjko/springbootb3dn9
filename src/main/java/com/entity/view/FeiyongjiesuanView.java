package com.entity.view;

import com.entity.FeiyongjiesuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 费用结算
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-26 21:33:29
 */
@TableName("feiyongjiesuan")
public class FeiyongjiesuanView  extends FeiyongjiesuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FeiyongjiesuanView(){
	}
 
 	public FeiyongjiesuanView(FeiyongjiesuanEntity feiyongjiesuanEntity){
 	try {
			BeanUtils.copyProperties(this, feiyongjiesuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
