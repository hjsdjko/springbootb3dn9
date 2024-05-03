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


import com.dao.LunwenshenheDao;
import com.entity.LunwenshenheEntity;
import com.service.LunwenshenheService;
import com.entity.vo.LunwenshenheVO;
import com.entity.view.LunwenshenheView;

@Service("lunwenshenheService")
public class LunwenshenheServiceImpl extends ServiceImpl<LunwenshenheDao, LunwenshenheEntity> implements LunwenshenheService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LunwenshenheEntity> page = this.selectPage(
                new Query<LunwenshenheEntity>(params).getPage(),
                new EntityWrapper<LunwenshenheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LunwenshenheEntity> wrapper) {
		  Page<LunwenshenheView> page =new Query<LunwenshenheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LunwenshenheVO> selectListVO(Wrapper<LunwenshenheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LunwenshenheVO selectVO(Wrapper<LunwenshenheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LunwenshenheView> selectListView(Wrapper<LunwenshenheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LunwenshenheView selectView(Wrapper<LunwenshenheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
