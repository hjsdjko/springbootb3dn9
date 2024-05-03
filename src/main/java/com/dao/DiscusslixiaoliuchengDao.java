package com.dao;

import com.entity.DiscusslixiaoliuchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusslixiaoliuchengVO;
import com.entity.view.DiscusslixiaoliuchengView;


/**
 * 离校流程评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-26 21:33:29
 */
public interface DiscusslixiaoliuchengDao extends BaseMapper<DiscusslixiaoliuchengEntity> {
	
	List<DiscusslixiaoliuchengVO> selectListVO(@Param("ew") Wrapper<DiscusslixiaoliuchengEntity> wrapper);
	
	DiscusslixiaoliuchengVO selectVO(@Param("ew") Wrapper<DiscusslixiaoliuchengEntity> wrapper);
	
	List<DiscusslixiaoliuchengView> selectListView(@Param("ew") Wrapper<DiscusslixiaoliuchengEntity> wrapper);

	List<DiscusslixiaoliuchengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusslixiaoliuchengEntity> wrapper);
	
	DiscusslixiaoliuchengView selectView(@Param("ew") Wrapper<DiscusslixiaoliuchengEntity> wrapper);
	
}
