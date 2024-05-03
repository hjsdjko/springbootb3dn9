package com.dao;

import com.entity.LunwenshenheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LunwenshenheVO;
import com.entity.view.LunwenshenheView;


/**
 * 论文审核
 * 
 * @author 
 * @email 
 * @date 2021-01-26 21:33:29
 */
public interface LunwenshenheDao extends BaseMapper<LunwenshenheEntity> {
	
	List<LunwenshenheVO> selectListVO(@Param("ew") Wrapper<LunwenshenheEntity> wrapper);
	
	LunwenshenheVO selectVO(@Param("ew") Wrapper<LunwenshenheEntity> wrapper);
	
	List<LunwenshenheView> selectListView(@Param("ew") Wrapper<LunwenshenheEntity> wrapper);

	List<LunwenshenheView> selectListView(Pagination page,@Param("ew") Wrapper<LunwenshenheEntity> wrapper);
	
	LunwenshenheView selectView(@Param("ew") Wrapper<LunwenshenheEntity> wrapper);
	
}
