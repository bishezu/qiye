package com.liandi.ems04.service.attendance;

import org.springframework.scheduling.annotation.Scheduled;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.liandi.ems04.entity.attendance.Attendance;
import com.liandi.ems04.mapper.attendance.AttendanceMapper;
import com.liandi.ems04.util.Page;

/*
 * 考勤服务类
 */

@Service
public class AttendanceService implements IAttendanceService {

	@Autowired
	private AttendanceMapper attendanceMapper;
	@Autowired
	private Attendance attendance;

	/* 统计员工上班签到方法 */
	@Override
	public void checkIn(Attendance attendance) {
		attendanceMapper.add(attendance);
	}

	/* 统计员工下班签到方法 */
	@Override
	public void checkOut(Attendance attendance) {
		attendanceMapper.update(attendance);
	}

	/* 显示所有考勤记录方法 */
	@Override
	public List<Attendance> findAll() {
		return attendanceMapper.findAll();
	}

	/* 按员工编号显示考勤记录 */
	@Override
	public List<Attendance> findBySid(int sid) {
		return attendanceMapper.findBySid(sid);
	}

	/* 按日期显示考勤记录 */
	@Override
	public List<Attendance> findByDate(String presentDate) {
		return attendanceMapper.findByDate(presentDate);
	}
	
	public Attendance findBySidAndDate(Map<String, Object> map){
		return attendanceMapper.findBySidAndDate(map);
	}
	
	/*分页按员工编号显示考勤记录*/
	@Override  
	public void showAttendanceBySidByPage(HttpServletRequest request, Model model,int sid) {  
	    String pageNow = request.getParameter("pageNow");  
	  
	    Page page = null;  
	  
	    List<Attendance> attendance = new ArrayList<Attendance>();  
	  
	    int totalCount = (int)  attendanceMapper.getAttendanceCountBySid(sid);  
	  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        attendance = this. attendanceMapper.findBySidPage(page.getStartPos(), page.getPageSize(), sid);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        attendance = this.attendanceMapper.findBySidPage(page.getStartPos(), page.getPageSize(), sid);  
	    }  
	  
	    model.addAttribute("attendance", attendance);  
	    model.addAttribute("page", page);  
	}  
	
	
	
	/*分页按日期显示考勤记录*/
	@Override  
	public void showAttendanceByDateByPage(HttpServletRequest request, Model model,String presentDate) { 
	    String pageNow = request.getParameter("pageNow");  
	    Page page = null;  
	  
	    List<Attendance> attendance = new ArrayList<Attendance>();  
	  
	    int totalCount = (int)  attendanceMapper.getAttendanceCountByDate(presentDate);
	  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        attendance = this. attendanceMapper.findByDatePage(page.getStartPos(), page.getPageSize(), presentDate);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        attendance = this.attendanceMapper.findByDatePage(page.getStartPos(), page.getPageSize(),presentDate);  
	    }  
	  
	    model.addAttribute("attendance", attendance);  
	    model.addAttribute("page", page);  
	}  
	
	
	
	/*查询全部分页*/
	@Override  
	public void showAttendanceByPage(HttpServletRequest request, Model model) {  
	    String pageNow = request.getParameter("pageNow");  
	  
	    Page page = null;  
	  
	    List<Attendance> attendance = new ArrayList<Attendance>();  
	  
	    int totalCount = (int) attendanceMapper.getAttendanceCount();  
	  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        attendance = this.attendanceMapper.findAllPage(page.getStartPos(), page.getPageSize());  
	    } else {  
	        page = new Page(totalCount, 1);  
	        attendance = this.attendanceMapper.findAllPage(page.getStartPos(), page.getPageSize());  
	    }  
	  
	    model.addAttribute("attendance", attendance);  
	    model.addAttribute("page", page);  
	}  


	/* 考勤计算方法 */
	@Scheduled(cron = "0 19 10 ? * *")
	public void summarize() {
		List<Attendance> attendanceList = attendanceMapper.findAll();
		for (Attendance attendance : attendanceList) {
			if (attendance.getCheckIn() == null
					|| attendance.getCheckOut() == null) {
				attendance.setHalfAbsenteeism(true);
			} else {
				DateFormat df = new SimpleDateFormat("HH:mm:ss");
				Date d1 = null;
				Date d2 = null;
				Date d3 = null;
				Date d4 = null;
				try {
					d1 = df.parse(attendance.getCheckIn());// 上班签到时间
					d2 = df.parse(attendance.getCheckOut());// 下班签退时间
					d3 = df.parse("09:00:00");// 公司规定上班时间
					d4 = df.parse("18:00:00");// 公司规定下班时间

				} catch (ParseException e) {
					e.printStackTrace();
				}
				long diff1 = d2.getTime() - d1.getTime();// 当日工作时长
				long diff2 = d1.getTime() - d3.getTime();// 上班打卡时间减去公司规定上班时间
				long diff3 = d4.getTime() - d2.getTime();// 公司规定下班时间减去下班打卡时间
				if (diff1 < 4 * 60 * 60 * 1000) {
					attendance.setAbsenteeism(true);
				} else if (diff1 < 8 * 60 * 60 * 1000) {
					attendance.setHalfAbsenteeism(true);
				}

				if (diff2 > 30 * 60 * 1000 && diff3 <= 30 * 60 * 1000 && diff1 >= 4 * 60 * 60 * 1000) {
					attendance.setHalfAbsenteeism(true);
				} else if (diff2 > 0 && diff1 >= 8 * 60 * 60 * 1000) {
					attendance.setArriveLate(true);
				}

				if (diff3 > 30 * 60 * 1000 && diff1 >= 4 * 60 * 60 * 1000) {
					attendance.setHalfAbsenteeism(true);
				} else if (diff3 > 0 && diff2 <= 30 * 60 * 1000  &&diff1 >= 8 * 60 * 60 * 1000) {
					attendance.setLeaveEarly(true);
				}
			}
			attendanceMapper.update(attendance);
		}
	}
}
