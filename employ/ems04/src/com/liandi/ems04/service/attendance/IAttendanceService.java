package com.liandi.ems04.service.attendance;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.liandi.ems04.entity.attendance.Attendance;

/*
 * 考勤服务接口
 */
public interface IAttendanceService {

	public void checkIn(Attendance attendance);

	public void checkOut(Attendance attendance);
	
	
	public List<Attendance> findBySid(int sid);

	public List<Attendance> findByDate(String presentDate);
	
	public Attendance findBySidAndDate(Map<String, Object> map);

	public List<Attendance> findAll();
	
	public void showAttendanceBySidByPage(HttpServletRequest request,Model model,int sid);  
	
	public void showAttendanceByDateByPage(HttpServletRequest request,Model model,String presentDate);  
	
    public void showAttendanceByPage(HttpServletRequest request,Model model);  

}
