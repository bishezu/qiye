package com.liandi.ems04.service.achieve;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.liandi.ems04.entity.achieve.Achieve;
import com.liandi.ems04.entity.attendance.Attendance;

/*
 * 考勤服务接口
 */
public interface IAchieveService {

	public void checkIn(Achieve achieve);


	public List<Achieve> findBySid(int sid);

	public List<Achieve> findAll();
	
	public void showAchieveBySidByPage(HttpServletRequest request,Model model,int sid);  
	
    public void showAchieveByPage(HttpServletRequest request,Model model);  

}
