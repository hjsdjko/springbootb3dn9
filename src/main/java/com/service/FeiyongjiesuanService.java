package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FeiyongjiesuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FeiyongjiesuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FeiyongjiesuanView;


/**
 * 费用结算
 *
 * @author 
 * @email 
 * @date 2021-01-26 21:33:29
 */
public interface FeiyongjiesuanService extends IService<FeiyongjiesuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FeiyongjiesuanVO> selectListVO(Wrapper<FeiyongjiesuanEntity> wrapper);
   	
   	FeiyongjiesuanVO selectVO(@Param("ew") Wrapper<FeiyongjiesuanEntity> wrapper);
   	
   	List<FeiyongjiesuanView> selectListView(Wrapper<FeiyongjiesuanEntity> wrapper);
   	
   	FeiyongjiesuanView selectView(@Param("ew") Wrapper<FeiyongjiesuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FeiyongjiesuanEntity> wrapper);
   	
}

