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


import com.dao.DiscusslixiaoliuchengDao;
import com.entity.DiscusslixiaoliuchengEntity;
import com.service.DiscusslixiaoliuchengService;
import com.entity.vo.DiscusslixiaoliuchengVO;
import com.entity.view.DiscusslixiaoliuchengView;

@Service("discusslixiaoliuchengService")
public class DiscusslixiaoliuchengServiceImpl extends ServiceImpl<DiscusslixiaoliuchengDao, DiscusslixiaoliuchengEntity> implements DiscusslixiaoliuchengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusslixiaoliuchengEntity> page = this.selectPage(
                new Query<DiscusslixiaoliuchengEntity>(params).getPage(),
                new EntityWrapper<DiscusslixiaoliuchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusslixiaoliuchengEntity> wrapper) {
		  Page<DiscusslixiaoliuchengView> page =new Query<DiscusslixiaoliuchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusslixiaoliuchengVO> selectListVO(Wrapper<DiscusslixiaoliuchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusslixiaoliuchengVO selectVO(Wrapper<DiscusslixiaoliuchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusslixiaoliuchengView> selectListView(Wrapper<DiscusslixiaoliuchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusslixiaoliuchengView selectView(Wrapper<DiscusslixiaoliuchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
