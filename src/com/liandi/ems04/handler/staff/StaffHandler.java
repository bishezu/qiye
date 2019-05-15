package com.liandi.ems04.handler.staff;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liandi.ems04.entity.staff.Staff;
import com.liandi.ems04.entity.title.Title;
import com.liandi.ems04.service.staff.IStaffService;
import com.liandi.ems04.service.title.TitleService;

@Controller
@RequestMapping("/staff")
public class StaffHandler {

	@Autowired
	private IStaffService staffService;
	
	@Autowired
	private TitleService titleService;
	
	@RequestMapping("/add")
	public String add(String name,String gender,String account,String password,
			Integer deptId,Integer titleId,Integer admintypeId,String birthday,String phone,String email,
			String edubackground,Integer salarylevel) throws ParseException{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");   
		Date date = new Date();
		Date birth = formatter.parse(birthday);
		
		//查询最新一条数据的sid
		Staff stf = staffService.queryLastInsert();
		Integer sid = stf.getSid()+1;
		
		Staff staff = new Staff(sid,name,gender,formatter.parse(simpleDate.format(date)),account, password,
				deptId, titleId, admintypeId,birth, phone, email,
				 edubackground, salarylevel);
		staffService.registerStaff(staff);
		return "redirect:list.action";			
	}
	
	@RequestMapping("/list")
	public String list(Map<String,Object> map,HttpSession session,
			HttpServletResponse response) throws IOException{
		response.setContentType("textml;charset=utf-8");
		PrintWriter out = response.getWriter();
		Staff staff = (Staff) session.getAttribute("staff");
		int id = staff.getAdmintypeId();
		
        if(id==5){
        	List<Staff> staffList = staffService.queryAll();
        	ArrayList<Staff> list = new ArrayList<Staff>();
        	for (Staff stf : staffList) {
				Integer titleId = stf.getTitleId();
				if(titleId!=null) {
					Title title = titleService.queryById(titleId);
					if(title!=null && title.getTitleName()!=null) {
						stf.setTitle(title.getTitleName());
					}
				}
				list.add(stf);
			}
        	map.put("staffList", list);
        	return "staff/staff";       	
        }else{
        	out.flush();
		    out.println("<script>");
		    out.println("alert('你无此权限！');");
		    out.println("</script>");
		    return "empInfoModify";
        }
	}
	
	@RequestMapping("/toModify")
	public String toModify(int sid,Map<String,Object> map){
		Staff staff = staffService.queryStaffBySid(sid);
		map.put("staff", staff);
		return "staff/empModify";
	}
	
	@RequestMapping("/empModify")
	public String empInfoModify(Staff staff,HttpServletRequest request){
	  /* String type=	request.getParameter("usertype");
	   int sid=	Integer.parseInt(request.getParameter("sid"));
	   String name=	request.getParameter("name");
	   String account=	request.getParameter("account");
	   String phone=	request.getParameter("phone");
	   String email=	request.getParameter("email");
		
	   int typeid;
	   if(type.equals("管理员")) {
		   typeid=5;
	   }else {
		   typeid=1;
	   }*/
		 int admintypeId=Integer.parseInt(request.getParameter("typeId")); 
		//staffService.modify(name,account,phone,email,typeid,sid);
		 System.out.println(admintypeId);
		 staff.setAdmintypeId(admintypeId);
	     System.out.println(staff);
		 staffService.modify(staff);
	   return "redirect:list.action";
	}
	
	@RequestMapping("/remove")
	public String remove(int sid){
		staffService.removeBySid(sid);
		return "redirect:list.action";
	}
	
	@RequestMapping("/detail")
	public String detail(int sid,Map<String,Object> map){
		Staff staff = staffService.queryStaffBySid(sid);
		map.put("staff", staff);
		return "staff/staffTypeConcreteSearch";
	}
}
