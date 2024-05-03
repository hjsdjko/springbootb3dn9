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


import com.dao.LixiaoliuchengDao;
import com.entity.LixiaoliuchengEntity;
import com.service.LixiaoliuchengService;
import com.entity.vo.LixiaoliuchengVO;
import com.entity.view.LixiaoliuchengView;

@Service("lixiaoliuchengService")
public class LixiaoliuchengServiceImpl extends ServiceImpl<LixiaoliuchengDao, LixiaoliuchengEntity> implements LixiaoliuchengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LixiaoliuchengEntity> page = this.selectPage(
                new Query<LixiaoliuchengEntity>(params).getPage(),
                new EntityWrapper<LixiaoliuchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LixiaoliuchengEntity> wrapper) {
		  Page<LixiaoliuchengView> page =new Query<LixiaoliuchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LixiaoliuchengVO> selectListVO(Wrapper<LixiaoliuchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LixiaoliuchengVO selectVO(Wrapper<LixiaoliuchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LixiaoliuchengView> selectListView(Wrapper<LixiaoliuchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LixiaoliuchengView selectView(Wrapper<LixiaoliuchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
