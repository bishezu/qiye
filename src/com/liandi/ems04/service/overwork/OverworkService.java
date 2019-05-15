package com.liandi.ems04.service.overwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import com.liandi.ems04.entity.overwork.Overwork;
import com.liandi.ems04.mapper.overwork.OverworkMapper;
import com.liandi.ems04.util.Page;

//加班方法类
@Service
public class OverworkService implements IOverworkService{
	@Autowired
	private OverworkMapper overworkMapper;
	@Autowired
	private Overwork overwork;

   /*
    * 加班签到方法
    */
	@Override
	public void checkIn(Overwork overwork) {
		// TODO 自动生成的方法存根
		overworkMapper.add(overwork);
	}

	/*
	 * 加班签退方法
	 */
	@Override
	public void checkOut(Overwork overwork) {
		// TODO 自动生成的方法存根
		overworkMapper.update(overwork);
	}

	/*
	 * 按员工Id显示加班记录
	 */
	@Override
	public List<Overwork> findBySid(int sid) {
		// TODO 自动生成的方法存根
		return overworkMapper.findBySid(sid);
	}

	/*
	 * 按日期显示加班记录
	 */
	@Override
	public List<Overwork> findByDate(String presentDate) {
		// TODO 自动生成的方法存根
		return overworkMapper.findByDate(presentDate);
	}

	/*
	 * 按日期和员工Id显示加班记录
	 */
	@Override
	public Overwork findBySidAndDate(Map<String, Object> map) {
		// TODO 自动生成的方法存根
		return overworkMapper.findBySidAndDate(map);
	}
	
	/* 显示所有加班记录方法 */
	@Override
	public List<Overwork> findAll() {
		// TODO 自动生成的方法存根
		return overworkMapper.findAll();
	}

	/*分页按员工编号显示加班记录*/
	@Override  
	public void showOverworkBySidByPage(HttpServletRequest request, Model model,int sid) {  
	    String pageNow = request.getParameter("pageNow");  
	  
	    Page page = null;  
	  
	    List<Overwork> overwork = new ArrayList<Overwork>();  
	  
	    int totalCount = (int)  overworkMapper.getOverworkCountBySid(sid);  
	  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        overwork = this. overworkMapper.findBySidPage(page.getStartPos(), page.getPageSize(), sid);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        overwork = this.overworkMapper.findBySidPage(page.getStartPos(), page.getPageSize(), sid);  
	    }  
	  
	    model.addAttribute("overwork", overwork);  
	    model.addAttribute("page", page);  
	}  
	
	
	
	/*分页按日期显示考勤记录*/
	@Override  
	public void showOverworkByDateByPage(HttpServletRequest request, Model model,String presentDate) { 
	    String pageNow = request.getParameter("pageNow");  
	    Page page = null;  
	  
	    List<Overwork> overwork = new ArrayList<Overwork>();  
	  
	    int totalCount = (int)  overworkMapper.getOverworkCountByDate(presentDate);
	  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        overwork = this. overworkMapper.findByDatePage(page.getStartPos(), page.getPageSize(), presentDate);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        overwork = this.overworkMapper.findByDatePage(page.getStartPos(), page.getPageSize(),presentDate);  
	    }  
	  
	    model.addAttribute("overwork", overwork);  
	    model.addAttribute("page", page);  
	}  
	
	
	
	/*查询全部分页*/
	@Override  
	public void showOverworkByPage(HttpServletRequest request, Model model) {  
	    String pageNow = request.getParameter("pageNow");  
	  
	    Page page = null;  
	  
	    List<Overwork> overwork = new ArrayList<Overwork>();  
	  
	    int totalCount = (int) overworkMapper.getOverworkCount();  
	  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        overwork = this.overworkMapper.findAllPage(page.getStartPos(), page.getPageSize());  
	    } else {  
	        page = new Page(totalCount, 1);  
	        overwork = this.overworkMapper.findAllPage(page.getStartPos(), page.getPageSize());  
	    }  
	  
	    model.addAttribute("overwork", overwork);  
	    model.addAttribute("page", page);  
	}  


}
