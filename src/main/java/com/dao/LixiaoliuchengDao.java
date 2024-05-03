package com.dao;

import com.entity.LixiaoliuchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LixiaoliuchengVO;
import com.entity.view.LixiaoliuchengView;


/**
 * 离校流程
 * 
 * @author 
 * @email 
 * @date 2021-01-26 21:33:29
 */
public interface LixiaoliuchengDao extends BaseMapper<LixiaoliuchengEntity> {
	
	List<LixiaoliuchengVO> selectListVO(@Param("ew") Wrapper<LixiaoliuchengEntity> wrapper);
	
	LixiaoliuchengVO selectVO(@Param("ew") Wrapper<LixiaoliuchengEntity> wrapper);
	
	List<LixiaoliuchengView> selectListView(@Param("ew") Wrapper<LixiaoliuchengEntity> wrapper);

	List<LixiaoliuchengView> selectListView(Pagination page,@Param("ew") Wrapper<LixiaoliuchengEntity> wrapper);
	
	LixiaoliuchengView selectView(@Param("ew") Wrapper<LixiaoliuchengEntity> wrapper);
	
}
