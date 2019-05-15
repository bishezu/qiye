package com.liandi.ems04.service.overwork;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.liandi.ems04.entity.attendance.Attendance;
import com.liandi.ems04.entity.overwork.Overwork;
//加班接口
public interface IOverworkService {
	public void checkIn(Overwork overwork);

	public void checkOut(Overwork overwork);

	public List<Overwork> findBySid(int sid);

	public List<Overwork> findByDate(String presentDate);
	
	public Overwork findBySidAndDate(Map<String, Object> map);
	
    public List<Overwork> findAll();
	
	public void showOverworkBySidByPage(HttpServletRequest request,Model model,int sid);  
	
	public void showOverworkByDateByPage(HttpServletRequest request,Model model,String presentDate);  
	
    public void showOverworkByPage(HttpServletRequest request,Model model);  

}
