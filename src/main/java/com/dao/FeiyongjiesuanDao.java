package com.dao;

import com.entity.FeiyongjiesuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FeiyongjiesuanVO;
import com.entity.view.FeiyongjiesuanView;


/**
 * 费用结算
 * 
 * @author 
 * @email 
 * @date 2021-01-26 21:33:29
 */
public interface FeiyongjiesuanDao extends BaseMapper<FeiyongjiesuanEntity> {
	
	List<FeiyongjiesuanVO> selectListVO(@Param("ew") Wrapper<FeiyongjiesuanEntity> wrapper);
	
	FeiyongjiesuanVO selectVO(@Param("ew") Wrapper<FeiyongjiesuanEntity> wrapper);
	
	List<FeiyongjiesuanView> selectListView(@Param("ew") Wrapper<FeiyongjiesuanEntity> wrapper);

	List<FeiyongjiesuanView> selectListView(Pagination page,@Param("ew") Wrapper<FeiyongjiesuanEntity> wrapper);
	
	FeiyongjiesuanView selectView(@Param("ew") Wrapper<FeiyongjiesuanEntity> wrapper);
	
}
