package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FeiyongjiesuanDao;
import com.entity.FeiyongjiesuanEntity;
import com.service.FeiyongjiesuanService;
import com.entity.vo.FeiyongjiesuanVO;
import com.entity.view.FeiyongjiesuanView;

@Service("feiyongjiesuanService")
public class FeiyongjiesuanServiceImpl extends ServiceImpl<FeiyongjiesuanDao, FeiyongjiesuanEntity> implements FeiyongjiesuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FeiyongjiesuanEntity> page = this.selectPage(
                new Query<FeiyongjiesuanEntity>(params).getPage(),
                new EntityWrapper<FeiyongjiesuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FeiyongjiesuanEntity> wrapper) {
		  Page<FeiyongjiesuanView> page =new Query<FeiyongjiesuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FeiyongjiesuanVO> selectListVO(Wrapper<FeiyongjiesuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FeiyongjiesuanVO selectVO(Wrapper<FeiyongjiesuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FeiyongjiesuanView> selectListView(Wrapper<FeiyongjiesuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FeiyongjiesuanView selectView(Wrapper<FeiyongjiesuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
