package com.liandi.ems04.handler.attendance;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.liandi.ems04.entity.attendance.Attendance;
import com.liandi.ems04.entity.staff.Staff;
import com.liandi.ems04.service.attendance.AttendanceService;
import com.liandi.ems04.service.attendance.IAttendanceService;

/*
 * 考勤控制类
 */

@Controller
@RequestMapping("/Attendance")
public class AttendanceHander {

	@Autowired
	private AttendanceService attendanceService;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
	private SimpleDateFormat sdf3 = new SimpleDateFormat("EEE");

	/* 考勤上班签到控制方法 */
	@RequestMapping("/checkIn")
	public String checkIn(HttpSession session) {
		Staff staff = (Staff) session.getAttribute("staff");
		int sid = staff.getSid();
		String name = staff.getName();
		Date d = new Date();
		String a = sdf3.format(d);
		if ((a.equals("星期六") || a.equals("星期日")) == false) {

			Map<String, Object> map = new HashMap<String, Object>();
			map.put("sid", sid);
			map.put("presentDate", sdf.format(d));
			Attendance attendanceResult = attendanceService.findBySidAndDate(map);
			if (attendanceResult == null) {
				Attendance attendance = new Attendance(sid, name,
						sdf.format(d), sdf2.format(d));
				attendanceService.checkIn(attendance);
				attendanceService.summarize(sid);
			}
		}
		
		return "redirect:signIn.action";
	}

	/* 考勤下班签出控制方法 */
	@RequestMapping("/checkOut")
	public String checkOut(HttpSession session) {
		Staff staff = (Staff) session.getAttribute("staff");
		int sid = staff.getSid();
		String name = staff.getName();
		Date d = new Date();
		String a = sdf3.format(d);
		if ((a.equals("星期六") || a.equals("星期日")) == false) {

			Map<String, Object> map = new HashMap<String, Object>();
			map.put("sid", sid);
			map.put("presentDate", sdf.format(d));
			Attendance attendanceResult = attendanceService.findBySidAndDate(map);
			if (attendanceResult== null) {
				Attendance attendanceIn = new Attendance(sid, name,
						sdf.format(d), null);
				attendanceService.checkIn(attendanceIn);
				Attendance attendanceOut = new Attendance(sid,sdf.format(d),
						sdf2.format(d));
				attendanceService.checkOut(attendanceOut);
				attendanceService.summarize2(sid);
				
			}else if(attendanceResult.getCheckOut() == null){
				Attendance attendanceOut = new Attendance(sid,sdf.format(d),
						sdf2.format(d));
				attendanceService.checkOut(attendanceOut);
				attendanceService.summarize2(sid);
			}
		}
		return "redirect:signIn.action";
	}
	/* 员工按日期显示考勤记录控制方法 */
	@RequestMapping("/EmlFindByDate")
	public String EmlFindByDate(HttpSession session,String presentDate, Map<String, Object> map) {
		Staff staff = (Staff) session.getAttribute("staff");
		int sid = staff.getSid();
		Map<String, Object> mapFind = new HashMap<String, Object>();
		mapFind.put("sid", sid);
		mapFind.put("presentDate",presentDate);
		Attendance attendance = attendanceService.findBySidAndDate(mapFind);
		List<Attendance> attendanceList = new ArrayList<Attendance>();
		attendanceList.add(attendance);
		map.put("attendanceList", attendanceList);
		return "attendance/attendanceListEml";
	}
	
	/* 前台个人考勤信息界面 */
	@RequestMapping("/signIn")
	public String signIn(HttpSession session,Map<String,Object> map) {
		Staff staff = (Staff) session.getAttribute("staff");
		int sid = staff.getSid();
		List<Attendance> attendanceList = attendanceService.findBySid(sid);
		map.put("attendanceList", attendanceList);
		return "attendance/signIn";
	}
	
	
/*-------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------分页部分-------------------------------------------------*/	
/*------------------------------------------------------------------------------------------------------------*/
	
	
	/*分页 显示全部考勤记录控制方法 */
	@RequestMapping(value = "/attendanceListAdmin", method = RequestMethod.GET)  
	public String attendanceListAdminPage(HttpServletRequest request, Model model,
			HttpSession session,HttpServletResponse response) throws IOException {  
		PrintWriter out = response.getWriter();
		Staff staff = (Staff) session.getAttribute("staff");
		int id = staff.getAdmintypeId();
		if(id==5){	
			//此处的productService是注入的IProductService接口的对象  
			this.attendanceService.showAttendanceByPage(request, model);  
			return "attendance/attendanceListAdmin";  			
		}else{
			out.flush();
		    out.println("<script>");
		    out.println("alert('你无此权限！');");
		    out.println("</script>");
		    return "empInfoModify";
		}
	}  
	
	
	int Sid = 0;//员工编号中间变量
	/* 管理员按员工编号分页显示考勤记录主控制方法 */
	@RequestMapping(value = "/AdminFindBySid", method = RequestMethod.GET)  
	public String AdminFindBySid(int sid,HttpServletRequest request, Model model) { 
		
			this.attendanceService.showAttendanceBySidByPage(request, model, sid);
			Sid = sid;
			return "attendance/attendanceListBySid";  			
		
	}  
	
	/* 管理员按员工编号分页显示考勤记录辅控制方法 */
	@RequestMapping(value = "/AdminFindBySidPage", method = RequestMethod.GET)  
	public String AdminFindBySid2(HttpServletRequest request, Model model) { 
		int sid = 0;
		sid = Sid;
	    this.attendanceService.showAttendanceBySidByPage(request, model, sid); 
	    return "attendance/attendanceListBySid";  
	}  
	
	
	
	String presentDateTemp = null;//日期中间变量
	/* 管理员按日期分页显示考勤记录主控制方法 */
	@RequestMapping(value = "/AdminFindByDate", method = RequestMethod.GET)  
	public String showMyProduct(String presentDate ,HttpServletRequest request, Model model) {
		System.out.println(presentDate);
	    this.attendanceService.showAttendanceByDateByPage(request, model, presentDate);
	    presentDateTemp = presentDate;
	    return "attendance/attendanceListByDate";  
	}  
	
	/* 管理员按日期分页显示考勤记录辅控制方法 */
	@RequestMapping(value = "/AdminFindByDatePage", method = RequestMethod.GET)  
	public String showMyProduct2(HttpServletRequest request, Model model) { 
		String presentDate = null;
		presentDate = presentDateTemp;
	    this.attendanceService.showAttendanceByDateByPage(request, model, presentDate); 
	    return "attendance/attendanceListByDate";  
	}  
}
