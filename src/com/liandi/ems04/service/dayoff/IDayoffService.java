package com.liandi.ems04.service.dayoff;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.liandi.ems04.entity.attendance.Attendance;
import com.liandi.ems04.entity.dayoff.Dayoff;

//请假接口
public interface IDayoffService {
	public void checkIn(Dayoff dayoff);

	public List<Dayoff> findBySid(int sid);

	public List<Dayoff> findByDate(String time);
	
	public Dayoff findBySidAndDate(Map<String, Object> map);
	
    public List<Dayoff> findAll();
	
	public void showDayoffBySidByPage(HttpServletRequest request,Model model,int sid);  
	
	public void showDayoffByDateByPage(HttpServletRequest request,Model model,String time);  
	
    public void showDayoffByPage(HttpServletRequest request,Model model);  

}
