package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.LixiaoliuchengEntity;
import com.entity.view.LixiaoliuchengView;

import com.service.LixiaoliuchengService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 离校流程
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-26 21:33:29
 */
@RestController
@RequestMapping("/lixiaoliucheng")
public class LixiaoliuchengController {
    @Autowired
    private LixiaoliuchengService lixiaoliuchengService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LixiaoliuchengEntity lixiaoliucheng, HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			lixiaoliucheng.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<LixiaoliuchengEntity> ew = new EntityWrapper<LixiaoliuchengEntity>();
		PageUtils page = lixiaoliuchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lixiaoliucheng), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LixiaoliuchengEntity lixiaoliucheng, HttpServletRequest request){
        EntityWrapper<LixiaoliuchengEntity> ew = new EntityWrapper<LixiaoliuchengEntity>();
		PageUtils page = lixiaoliuchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lixiaoliucheng), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LixiaoliuchengEntity lixiaoliucheng){
       	EntityWrapper<LixiaoliuchengEntity> ew = new EntityWrapper<LixiaoliuchengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( lixiaoliucheng, "lixiaoliucheng")); 
        return R.ok().put("data", lixiaoliuchengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LixiaoliuchengEntity lixiaoliucheng){
        EntityWrapper< LixiaoliuchengEntity> ew = new EntityWrapper< LixiaoliuchengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( lixiaoliucheng, "lixiaoliucheng")); 
		LixiaoliuchengView lixiaoliuchengView =  lixiaoliuchengService.selectView(ew);
		return R.ok("查询离校流程成功").put("data", lixiaoliuchengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LixiaoliuchengEntity lixiaoliucheng = lixiaoliuchengService.selectById(id);
        return R.ok().put("data", lixiaoliucheng);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LixiaoliuchengEntity lixiaoliucheng = lixiaoliuchengService.selectById(id);
        return R.ok().put("data", lixiaoliucheng);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        LixiaoliuchengEntity lixiaoliucheng = lixiaoliuchengService.selectById(id);
        if(type.equals("1")) {
        	lixiaoliucheng.setThumbsupnum(lixiaoliucheng.getThumbsupnum()+1);
        } else {
        	lixiaoliucheng.setCrazilynum(lixiaoliucheng.getCrazilynum()+1);
        }
        lixiaoliuchengService.updateById(lixiaoliucheng);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LixiaoliuchengEntity lixiaoliucheng, HttpServletRequest request){
    	lixiaoliucheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lixiaoliucheng);
        lixiaoliuchengService.insert(lixiaoliucheng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LixiaoliuchengEntity lixiaoliucheng, HttpServletRequest request){
    	lixiaoliucheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lixiaoliucheng);
        lixiaoliuchengService.insert(lixiaoliucheng);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody LixiaoliuchengEntity lixiaoliucheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(lixiaoliucheng);
        lixiaoliuchengService.updateById(lixiaoliucheng);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        lixiaoliuchengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<LixiaoliuchengEntity> wrapper = new EntityWrapper<LixiaoliuchengEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("jiaoshigonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = lixiaoliuchengService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
