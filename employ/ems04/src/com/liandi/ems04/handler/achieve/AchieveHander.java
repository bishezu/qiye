package com.liandi.ems04.handler.achieve;

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

import com.liandi.ems04.entity.achieve.Achieve;
import com.liandi.ems04.entity.attendance.Attendance;
import com.liandi.ems04.entity.staff.Staff;
import com.liandi.ems04.service.achieve.IAchieveService;
import com.liandi.ems04.service.attendance.IAttendanceService;

/*
 * 考勤控制类
 */

@Controller
@RequestMapping("/Achieve")
public class AchieveHander {

	@Autowired
	private IAchieveService achieveService;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
	private SimpleDateFormat sdf3 = new SimpleDateFormat("EEE");

	/* 显示绩效 */
	@RequestMapping("/achieve")
	public String achieve(HttpSession session,Map<String, Object> map) {
		Staff staff = (Staff) session.getAttribute("staff");
		int sid = staff.getSid();
		List achieveList=achieveService.findBySid(sid);
		map.put("achieveList", achieveList);
		return "achieve/achieveList";
	}
	
	/*添加绩效方法*/
	@RequestMapping("/addAchieve")
	public String addAchieve(HttpServletRequest request, Map<String, Object> map) {
		int sid=0;
		int achieve=0;
		int efficient=0;
		int absent=0;
		if(request.getParameter("sid")!=null) {
			sid=Integer.parseInt(request.getParameter("sid"));
		}
		String name=request.getParameter("name");
		if(request.getParameter("achieve")!=null) {
			achieve=Integer.parseInt(request.getParameter("achieve"));
		}
		if(request.getParameter("efficient")!=null) {
			efficient=Integer.parseInt(request.getParameter("efficient"));
		}
		if(request.getParameter("absent")!=null) {
			absent=Integer.parseInt(request.getParameter("absent"));
		}
		String level=request.getParameter("level");
		Achieve achieve2=new Achieve();
		achieve2.setSid(sid);
		achieve2.setName(name);
		achieve2.setAchieve(achieve);
		achieve2.setEfficient(efficient);
		achieve2.setAbsent(absent);
		achieve2.setLevel(level);
		achieveService.checkIn(achieve2);
		List<Achieve> achieveList = new ArrayList<Achieve>();
		achieveList.add(achieve2);
		map.put("achieveList", achieveList);
		return "achieve/achieveListAdmin";
		
	}
	@RequestMapping("/achieveList")
	public String achieveList(HttpSession session,Map<String,Object> map) {
		Staff staff = (Staff) session.getAttribute("staff");
		int sid = staff.getSid();
		List<Achieve> achieveList=achieveService.findBySid(sid);
		return "achieve/achieveList";
		
	}
	
	/* 跳转添加绩效页面*/
	@RequestMapping("/signIn")
	public String signIn(HttpSession session,Map<String,Object> map) {
		return "achieve/signIn";
	}
	
	
/*-------------------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------分页部分-------------------------------------------------*/	
/*------------------------------------------------------------------------------------------------------------*/
	
	
	/*分页 显示全部考勤记录控制方法 */
	@RequestMapping(value = "/achieveListAdmin", method = RequestMethod.GET)  
	public String achieveListAdminPage(HttpServletRequest request, Model model,
			HttpSession session,HttpServletResponse response) throws IOException {  
		PrintWriter out = response.getWriter();
		Staff staff = (Staff) session.getAttribute("staff");
		int id = staff.getAdmintypeId();
		if(id==2 || id==5){	
			//此处的productService是注入的IProductService接口的对象  
			this.achieveService.showAchieveByPage(request, model);  
			return "achieve/achieveListAdmin";  			
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
		
			this.achieveService.showAchieveBySidByPage(request, model, sid);
			Sid = sid;
			return "achieve/achieveListBySid";  			
		
	}  
	
	/* 管理员按员工编号分页显示考勤记录辅控制方法 */
	@RequestMapping(value = "/AdminFindBySidPage", method = RequestMethod.GET)  
	public String AdminFindBySid2(HttpServletRequest request, Model model) { 
		int sid = 0;
		sid = Sid;
	    this.achieveService.showAchieveBySidByPage(request, model, sid); 
	    return "achieve/achieveListBySid";  
	}  
	
}
