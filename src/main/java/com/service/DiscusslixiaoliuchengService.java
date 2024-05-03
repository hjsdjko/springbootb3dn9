package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusslixiaoliuchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusslixiaoliuchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusslixiaoliuchengView;


/**
 * 离校流程评论表
 *
 * @author 
 * @email 
 * @date 2021-01-26 21:33:29
 */
public interface DiscusslixiaoliuchengService extends IService<DiscusslixiaoliuchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusslixiaoliuchengVO> selectListVO(Wrapper<DiscusslixiaoliuchengEntity> wrapper);
   	
   	DiscusslixiaoliuchengVO selectVO(@Param("ew") Wrapper<DiscusslixiaoliuchengEntity> wrapper);
   	
   	List<DiscusslixiaoliuchengView> selectListView(Wrapper<DiscusslixiaoliuchengEntity> wrapper);
   	
   	DiscusslixiaoliuchengView selectView(@Param("ew") Wrapper<DiscusslixiaoliuchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusslixiaoliuchengEntity> wrapper);
   	
}

