package com.liandi.ems04.handler.staff;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liandi.ems04.entity.staff.Staff;
import com.liandi.ems04.service.staff.IStaffService;

@Controller
@RequestMapping("/staff")
public class StaffHandler {

	@Autowired
	private IStaffService staffService;
	
	@RequestMapping("/add")
	public String add(Integer sid,String name,String gender,String account,String password,
			Integer deptId,Integer titleId,Integer admintypeId,String birthday,String phone,String email,
			String edubackground,Integer salarylevel) throws ParseException{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");   
		Date date = new Date();
		Date birth = formatter.parse(birthday);
		Staff staff = new Staff(sid,name,gender,Timestamp.valueOf(simpleDate.format(date)),account, password,
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
		
        if(id==2 || id==5){
        	List<Staff> staffList = staffService.queryAll(); 
        	map.put("staffList", staffList);
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
	public String empInfoModify(Staff staff){
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
