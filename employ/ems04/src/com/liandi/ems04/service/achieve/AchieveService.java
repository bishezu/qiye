package com.liandi.ems04.service.achieve;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.liandi.ems04.entity.achieve.Achieve;
import com.liandi.ems04.mapper.achieve.AchieveMapper;
import com.liandi.ems04.util.Page;

/*
 * 考勤服务类
 */

@Service
public class AchieveService implements IAchieveService {

	@Autowired
	private AchieveMapper achieveMapper;
	@Autowired
	private Achieve achieve;

	/* 添加绩效 */
	@Override
	public void checkIn(Achieve achieve) {
		achieveMapper.add(achieve);
	}
	/* 显示所有考勤记录方法 */
	@Override
	public List<Achieve> findAll() {
		return achieveMapper.findAll();
	}

	/* 按员工编号显示考勤记录 */
	@Override
	public List<Achieve> findBySid(int sid) {
		return achieveMapper.findBySid(sid);
	}

	
	/*分页按员工编号显示考勤记录*/
	@Override  
	public void showAchieveBySidByPage(HttpServletRequest request, Model model,int sid) {  
	    String pageNow = request.getParameter("pageNow");  
	  
	    Page page = null;  
	  
	    List<Achieve> achieve = new ArrayList<Achieve>();  
	  
	    int totalCount = (int)  achieveMapper.getAchieveCountBySid(sid);  
	  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        achieve = this. achieveMapper.findBySidPage(page.getStartPos(), page.getPageSize(), sid);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        achieve = this.achieveMapper.findBySidPage(page.getStartPos(), page.getPageSize(), sid);  
	    }  
	  
	    model.addAttribute("achieve", achieve);  
	    model.addAttribute("page", page);  
	}  
	
	/*查询全部分页*/
	@Override  
	public void showAchieveByPage(HttpServletRequest request, Model model) {  
	    String pageNow = request.getParameter("pageNow");  
	  
	    Page page = null;  
	  
	    List<Achieve> achieve = new ArrayList<Achieve>();  
	  
	    int totalCount = (int) achieveMapper.getAchieveCount();  
	  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        achieve = this.achieveMapper.findAllPage(page.getStartPos(), page.getPageSize());  
	    } else {  
	        page = new Page(totalCount, 1);  
	        achieve = this.achieveMapper.findAllPage(page.getStartPos(), page.getPageSize());  
	    }  
	  
	    model.addAttribute("achieve", achieve);  
	    model.addAttribute("page", page);  
	}  
}
