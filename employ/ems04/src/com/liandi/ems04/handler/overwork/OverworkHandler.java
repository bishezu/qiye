package com.liandi.ems04.handler.overwork;

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
/*
 * 加班控制类
 */
import org.springframework.web.bind.annotation.RequestMethod;
import com.liandi.ems04.entity.overwork.Overwork;
import com.liandi.ems04.entity.staff.Staff;
import com.liandi.ems04.service.overwork.IOverworkService;

@Controller
@RequestMapping("/Overwork")
public class OverworkHandler {
	@Autowired
	private IOverworkService overworkService;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
	private SimpleDateFormat sdf3 = new SimpleDateFormat("EEE");
	
	/* 加班上班签到控制方法 */
	@RequestMapping("/checkIn")
	public String checkIn(HttpSession session) {
		Staff staff = (Staff) session.getAttribute("staff");
		int sid = staff.getSid();
		String name = staff.getName();
		Date d = new Date();
		String a = sdf3.format(d);
		if ((a.equals("星期六") || a.equals("星期日")) == true) {

			Map<String, Object> map = new HashMap<String, Object>();
			map.put("sid", sid);
			map.put("presentDate", sdf.format(d));
			Overwork overworkResult = overworkService.findBySidAndDate(map);
			if (overworkResult == null) {
				Overwork overwork = new Overwork(sid, name,
						sdf.format(d), sdf2.format(d));
				overworkService.checkIn(overwork);
			}
		}
		
		return "redirect:signIn.action";
	}
	
	
	/* 加班下班签出控制方法 */
	@RequestMapping("/checkOut")
	public String checkOut(HttpSession session) {
		Staff staff = (Staff) session.getAttribute("staff");
		int sid = staff.getSid();
		String name = staff.getName();
		Date d = new Date();
		String a = sdf3.format(d);
		if ((a.equals("星期六") || a.equals("星期日")) == true) {

			Map<String, Object> map = new HashMap<String, Object>();
			map.put("sid", sid);
			map.put("presentDate", sdf.format(d));
			Overwork overworkResult = overworkService.findBySidAndDate(map);
			if (overworkResult== null) {
				Overwork overworkIn = new Overwork(sid, name,
						sdf.format(d), null);
				overworkService.checkIn(overworkIn);
				Overwork overworkOut = new Overwork(sid,sdf.format(d),
						sdf2.format(d));
				overworkService.checkOut(overworkOut);
				
			}else if(overworkResult.getCheckOut() == null){
				Overwork overworkOut = new Overwork(sid,sdf.format(d),
						sdf2.format(d));
				overworkService.checkOut(overworkOut);
			}
		}
		return "redirect:signIn.action";
	}
	
	
	/* 员工按日期显示加班记录控制方法 */
	@RequestMapping("/EmlFindByDate")
	public String EmlFindByDate(HttpSession session,String presentDate, Map<String, Object> map) {
		Staff staff = (Staff) session.getAttribute("staff");
		int sid = staff.getSid();
		Map<String, Object> mapFind = new HashMap<String, Object>();
		mapFind.put("sid", sid);
		mapFind.put("presentDate",presentDate);
		Overwork overwork = overworkService.findBySidAndDate(mapFind);
		List<Overwork> overworkList = new ArrayList<Overwork>();
		overworkList.add(overwork);
		map.put("overworkList", overworkList);
		return "overwork/overworkListEml";
	}
	
	/* 前台个人加班信息界面 */
	@RequestMapping("/signIn")
	public String signIn(HttpSession session,Map<String,Object> map) {
		Staff staff = (Staff) session.getAttribute("staff");
		int sid = staff.getSid();
		List<Overwork> overworkList = overworkService.findBySid(sid);
		map.put("overworkList", overworkList);
		return "overwork/signIn";
	}
	
	/*-------------------------------------------------------------------------------------------------------------*/
	/*------------------------------------------------------分页部分-------------------------------------------------*/	
	/*------------------------------------------------------------------------------------------------------------*/
		
		
		/*分页 显示全部加班记录控制方法 */
		@RequestMapping(value = "/overworkListAdmin", method = RequestMethod.GET)  
		public String attendanceListAdminPage(HttpServletRequest request, Model model,
				HttpSession session,HttpServletResponse response) throws IOException {  
			PrintWriter out = response.getWriter();
			Staff staff = (Staff) session.getAttribute("staff");
			int id = staff.getAdmintypeId();
			if(id==2 || id==5){	
				//此处的productService是注入的IProductService接口的对象  
				this.overworkService.showOverworkByPage(request, model);  
				return "overwork/overworkListAdmin";  			
			}else{
				out.flush();
			    out.println("<script>");
			    out.println("alert('你无此权限！');");
			    out.println("</script>");
			    return "empInfoModify";
			}
		}  
		
		
		int Sid = 0;//员工编号中间变量
		/* 管理员按员工编号分页显示加班记录主控制方法 */
		@RequestMapping(value = "/AdminFindBySid", method = RequestMethod.GET)  
		public String AdminFindBySid(int sid,HttpServletRequest request, Model model) { 
			
				this.overworkService.showOverworkBySidByPage(request, model, sid);
				Sid = sid;
				return "overwork/overworkListBySid";  			
			
		}  
		
		/* 管理员按员工编号分页显示加班记录辅控制方法 */
		@RequestMapping(value = "/AdminFindBySidPage", method = RequestMethod.GET)  
		public String AdminFindBySid2(HttpServletRequest request, Model model) { 
			int sid = 0;
			sid = Sid;
		    this.overworkService.showOverworkBySidByPage(request, model, sid); 
		    return "overwork/overworkListBySid";  
		}  
		
		
		
		String presentDateTemp = null;//日期中间变量
		/* 管理员按日期分页显示加班记录主控制方法 */
		@RequestMapping(value = "/AdminFindByDate", method = RequestMethod.GET)  
		public String showMyProduct(String presentDate ,HttpServletRequest request, Model model) {
			System.out.println(presentDate);
		    this.overworkService.showOverworkByDateByPage(request, model, presentDate);
		    presentDateTemp = presentDate;
		    return "overwork/overworkListByDate";  
		}  
		
		/* 管理员按日期分页显示考勤记录辅控制方法 */
		@RequestMapping(value = "/AdminFindByDatePage", method = RequestMethod.GET)  
		public String showMyProduct2(HttpServletRequest request, Model model) { 
			String presentDate = null;
			presentDate = presentDateTemp;
		    this.overworkService.showOverworkByDateByPage(request, model, presentDate); 
		    return "overwork/overworkListByDate";  
		}  

}
