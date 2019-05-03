package com.liandi.ems04.handler.dayoff;

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

// * 加班控制类
import org.springframework.web.bind.annotation.RequestMethod;

import com.liandi.ems04.entity.dayoff.Dayoff;
import com.liandi.ems04.entity.staff.Staff;
import com.liandi.ems04.service.dayoff.IDayoffService; 

@Controller
@RequestMapping("/Dayoff")
public class DayoffHandler {
	@Autowired
	private IDayoffService dayoffService;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
	private SimpleDateFormat sdf3 = new SimpleDateFormat("EEE");
	
	// 请假签到控制方法 
	@RequestMapping("/checkIn")
	public String checkIn(HttpSession session,HttpServletRequest request) {
		Staff staff = (Staff) session.getAttribute("staff");
		int sid = staff.getSid();
		String name = staff.getName();
		int days=Integer.parseInt(request.getParameter("days")) ;
		String time=(String) request.getParameter("time");
		String reason=(String) request.getParameter("reason");
		Dayoff dayoff=new Dayoff(sid, name, days, time, reason);
		dayoffService.checkIn(dayoff);
		return "redirect:signIn.action";
	}
	
	//跳转到请假表格页面方法
	@RequestMapping("/goTable")
	public String goTable(HttpSession session) {
		return "dayoff/table";
	}
	
	
	// 员工按日期显示请假记录控制方法 
	@RequestMapping("/EmlFindByDate")
	public String EmlFindByDate(HttpSession session,String time, Map<String, Object> map) {
		Staff staff = (Staff) session.getAttribute("staff");
		int sid = staff.getSid();
		Map<String, Object> mapFind = new HashMap<String, Object>();
		mapFind.put("sid", sid);
		mapFind.put("time",time);
		Dayoff dayoff = dayoffService.findBySidAndDate(mapFind);
		List<Dayoff> dayoffList = new ArrayList<Dayoff>();
		dayoffList.add(dayoff);
		map.put("dayoffList", dayoffList);
		return "dayoff/dayoffListEml";
	}
	
	 //前台个人请假信息界面 
	@RequestMapping("/signIn")
	public String signIn(HttpSession session,Map<String,Object> map) {
		Staff staff = (Staff) session.getAttribute("staff");
		int sid = staff.getSid();
		List<Dayoff> dayoffList = dayoffService.findBySid(sid);
		map.put("dayoffList", dayoffList);
		return "dayoff/signIn";
	}
	
//	-------------------------------------------------------------------------------------------------------------
//	------------------------------------------------------分页部分-------------------------------------------------	
//	------------------------------------------------------------------------------------------------------------
//		
		
		//分页 显示全部请假记录控制方法 
		@RequestMapping(value = "/dayoffListAdmin", method = RequestMethod.GET)  
		public String attendanceListAdminPage(HttpServletRequest request, Model model,
				HttpSession session,HttpServletResponse response) throws IOException {  
			PrintWriter out = response.getWriter();
			Staff staff = (Staff) session.getAttribute("staff");
			int id = staff.getAdmintypeId();
			if(id==2 || id==5){	
				//此处的productService是注入的IProductService接口的对象  
				this.dayoffService.showDayoffByPage(request, model);  
				return "dayoff/dayoffListAdmin";  			
			}else{
				out.flush();
			    out.println("<script>");
			    out.println("alert('你无此权限！');");
			    out.println("</script>");
			    return "empInfoModify";
			}
		}  
		
		
		int Sid = 0;//员工编号中间变量
		// 管理员按员工编号分页显示请假记录主控制方法 
		@RequestMapping(value = "/AdminFindBySid", method = RequestMethod.GET)  
		public String AdminFindBySid(int sid,HttpServletRequest request, Model model) { 
			
				this.dayoffService.showDayoffBySidByPage(request, model, sid);
				Sid = sid;
				return "dayoff/dayoffListBySid";  			
			
		}  
		
		// 管理员按员工编号分页显示请假记录辅控制方法 
		@RequestMapping(value = "/AdminFindBySidPage", method = RequestMethod.GET)  
		public String AdminFindBySid2(HttpServletRequest request, Model model) { 
			int sid = 0;
			sid = Sid;
		    this.dayoffService.showDayoffBySidByPage(request, model, sid); 
		    return "dayoff/dayoffListBySid";  
		}  
		
		
		
		String presentDateTemp = null;//日期中间变量
		// 管理员按日期分页显示请假记录主控制方法 
		@RequestMapping(value = "/AdminFindByDate", method = RequestMethod.GET)  
		public String showMyProduct(String time ,HttpServletRequest request, Model model) {
			System.out.println(time);
		    this.dayoffService.showDayoffByDateByPage(request, model, time);
		    presentDateTemp = time;
		    return "dayoff/dayoffListByDate";  
		}  
		
		// 管理员按日期分页显示请假记录辅控制方法 
		@RequestMapping(value = "/AdminFindByDatePage", method = RequestMethod.GET)  
		public String showMyProduct2(HttpServletRequest request, Model model) { 
			String time = null;
			time = presentDateTemp;
		    this.dayoffService.showDayoffByDateByPage(request, model, time); 
		    return "dayoff/dayoffListByDate";  
		}  

}
