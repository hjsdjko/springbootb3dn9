package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LunwenshenheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LunwenshenheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LunwenshenheView;


/**
 * 论文审核
 *
 * @author 
 * @email 
 * @date 2021-01-26 21:33:29
 */
public interface LunwenshenheService extends IService<LunwenshenheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LunwenshenheVO> selectListVO(Wrapper<LunwenshenheEntity> wrapper);
   	
   	LunwenshenheVO selectVO(@Param("ew") Wrapper<LunwenshenheEntity> wrapper);
   	
   	List<LunwenshenheView> selectListView(Wrapper<LunwenshenheEntity> wrapper);
   	
   	LunwenshenheView selectView(@Param("ew") Wrapper<LunwenshenheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LunwenshenheEntity> wrapper);
   	
}

