package com.liandi.ems04.service.dayoff;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import com.liandi.ems04.mapper.dayoff.DayoffMapper;
import com.liandi.ems04.util.Page;
import com.liandi.ems04.entity.dayoff.Dayoff;
//加班方法类
@Service
public class DayoffService implements IDayoffService{
	@Autowired
	private DayoffMapper DayoffMapper;
	@Autowired
	private Dayoff Dayoff;

   /*
    * 请假签到方法
    */
	@Override
	public void checkIn(Dayoff Dayoff) {
		// TODO 自动生成的方法存根
		DayoffMapper.add(Dayoff);
	}


	/*
	 * 按员工Id显示请假记录
	 */
	@Override
	public List<Dayoff> findBySid(int sid) {
		// TODO 自动生成的方法存根
		return DayoffMapper.findBySid(sid);
	}

	/*
	 * 按日期显示请假记录
	 */
	@Override
	public List<Dayoff> findByDate(String time) {
		// TODO 自动生成的方法存根
		return DayoffMapper.findByDate(time);
	}

	/*
	 * 按日期和员工Id显示请假记录
	 */
	@Override
	public Dayoff findBySidAndDate(Map<String, Object> map) {
		// TODO 自动生成的方法存根
		return DayoffMapper.findBySidAndDate(map);
	}
	
	/* 显示所有请假记录方法 */
	@Override
	public List<Dayoff> findAll() {
		// TODO 自动生成的方法存根
		return DayoffMapper.findAll();
	}

	/*分页按员工编号显示请假记录*/
	@Override  
	public void showDayoffBySidByPage(HttpServletRequest request, Model model,int sid) {  
	    String pageNow = request.getParameter("pageNow");  
	  
	    Page page = null;  
	  
	    List<Dayoff> dayoff = new ArrayList<Dayoff>();  
	  
	    int totalCount = (int)  DayoffMapper.getDayoffCountBySid(sid);  
	  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        dayoff = this. DayoffMapper.findBySidPage(page.getStartPos(), page.getPageSize(), sid);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        dayoff = this.DayoffMapper.findBySidPage(page.getStartPos(), page.getPageSize(), sid);  
	    }  
	  
	    model.addAttribute("dayoff", dayoff);  
	    model.addAttribute("page", page);  
	}  
	
	
	
	/*分页按日期显示请假记录*/
	@Override  
	public void showDayoffByDateByPage(HttpServletRequest request, Model model,String time) { 
	    String pageNow = request.getParameter("pageNow");  
	    Page page = null;  
	  
	    List<Dayoff> dayoff = new ArrayList<Dayoff>();  
	  
	    int totalCount = (int)  DayoffMapper.getDayoffCountByDate(time);
	  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        dayoff = this. DayoffMapper.findByDatePage(page.getStartPos(), page.getPageSize(), time);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        dayoff = this.DayoffMapper.findByDatePage(page.getStartPos(), page.getPageSize(),time);  
	    }  
	  
	    model.addAttribute("dayoff", dayoff);  
	    model.addAttribute("page", page);  
	}  
	
	
	
	/*查询全部分页*/
	@Override  
	public void showDayoffByPage(HttpServletRequest request, Model model) {  
	    String pageNow = request.getParameter("pageNow");  
	  
	    Page page = null;  
	  
	    List<Dayoff> dayoff = new ArrayList<Dayoff>();  
	  
	    int totalCount = (int) DayoffMapper.getDayoffCount();  
	  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        dayoff = this.DayoffMapper.findAllPage(page.getStartPos(), page.getPageSize());  
	    } else {  
	        page = new Page(totalCount, 1);  
	        dayoff = this.DayoffMapper.findAllPage(page.getStartPos(), page.getPageSize());  
	    }  
	  
	    model.addAttribute("dayoff", dayoff);  
	    model.addAttribute("page", page);  
	}  


}
