package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LixiaoliuchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LixiaoliuchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LixiaoliuchengView;


/**
 * 离校流程
 *
 * @author 
 * @email 
 * @date 2021-01-26 21:33:29
 */
public interface LixiaoliuchengService extends IService<LixiaoliuchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LixiaoliuchengVO> selectListVO(Wrapper<LixiaoliuchengEntity> wrapper);
   	
   	LixiaoliuchengVO selectVO(@Param("ew") Wrapper<LixiaoliuchengEntity> wrapper);
   	
   	List<LixiaoliuchengView> selectListView(Wrapper<LixiaoliuchengEntity> wrapper);
   	
   	LixiaoliuchengView selectView(@Param("ew") Wrapper<LixiaoliuchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LixiaoliuchengEntity> wrapper);
   	
}

