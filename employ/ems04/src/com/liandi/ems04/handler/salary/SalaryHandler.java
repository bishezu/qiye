package com.liandi.ems04.handler.salary;

import java.io.IOException;
import java.io.PrintWriter;
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

import com.liandi.ems04.entity.salary.Salary;
import com.liandi.ems04.entity.salary.SalaryLevel;
import com.liandi.ems04.entity.staff.Staff;
import com.liandi.ems04.service.salary.ISalaryLevelService;
import com.liandi.ems04.service.salary.ISalaryService;

@Controller
@RequestMapping("/salary")
public class SalaryHandler {
	
	@Autowired
	private ISalaryService salaryService;
	@Autowired
	private ISalaryLevelService salaryLevelService;


	
	@RequestMapping("/findBySId")
	public String list1(Map<String,Object> map,int sid){
		List<Salary> salarysearchlist = salaryService.queryBySId(sid);
		map.put("salarysearchlist", salarysearchlist);
		return "salary/findBySId";
	}
	
	String presentDate1 = null;
	@RequestMapping(value="/findByDate",method = RequestMethod.GET)
	public String findByDate(HttpServletRequest request, Model model,String presentDate){	
		
		this.salaryService.queryByDate(request, model, presentDate);
		presentDate1 = presentDate;	
		return "salary/findByDate";
	}
	
	
	@RequestMapping(value="/findBydate",method = RequestMethod.GET)
	public String findByDate1(HttpServletRequest request, Model model){	
		String presentDate= null;
		presentDate = presentDate1;
		this.salaryService.queryByDate(request, model, presentDate);	
		return "salary/findByDate";
	}
	
	@RequestMapping("/standard")
	public String list2(Map<String,Object> map,HttpSession session,
			HttpServletResponse response) throws IOException{
		response.setContentType("textml;charset=utf-8");
		PrintWriter out = response.getWriter();
		Staff staff = (Staff) session.getAttribute("staff");
		int id = staff.getAdmintypeId();
		if(id==4 || id==5){
			List<SalaryLevel> salaryLevellist = salaryLevelService.queryAll();
			map.put("salaryLevellist", salaryLevellist);
			return "salary/standard";			
		}else{
			out.flush();
		    out.println("<script>");
		    out.println("alert('你无此权限！');");
		    out.println("</script>");
		    return "empInfoModify";
		}
	}
	
	@RequestMapping("/tostandardUpdate")
	public String list3(Map<String,Object> map,int salaryLevel){
		SalaryLevel salaryLevel1 = salaryLevelService.queryByLevel(salaryLevel);
		map.put("salaryLevellist", salaryLevel1);
		return "salary/standardUpdate";
	}
	
	@RequestMapping("/standardUpdate")
	public String salaryLevel(SalaryLevel salarylevel){
		
		salaryLevelService.modify(salarylevel);
		
	
		return "redirect:standard.action";
	}
	
	@RequestMapping("/stafflist")
	public String list1(Map<String,Object> map,HttpSession session,
			HttpServletResponse response) throws IOException{
		response.setContentType("textml;charset=utf-8");
		PrintWriter out = response.getWriter();
		Staff staff = (Staff) session.getAttribute("staff");
		int id = staff.getAdmintypeId();
		if(id==4 || id==5){
			List<Staff> stafflist = salaryService.findAllStaff();
			map.put("stafflist", stafflist);
			return "salary/staffList";			
		}else{
			out.flush();
		    out.println("<script>");
		    out.println("alert('你无此权限！');");
		    out.println("</script>");
		    return "empInfoModify";
		}
	}
	
	
	@RequestMapping("/toupdateStaffSalaryLevel")
	public String list5(Map<String,Object> map,int sid){
		Staff staff = salaryService.findBySIdStaff(sid);
		map.put("staff", staff);
		return "salary/updateStaff";
	}
	
	@RequestMapping("/updateStaffSalaryLevel")
	public String salaryLevel2(Staff staff){
		
		salaryService.updateStaffSalaryLevel(staff);;
		
	
		return "redirect:stafflist.action";
	}
	
	@RequestMapping("/payroll")
	public String payroll(HttpSession session,Map<String,Object> map){
		Staff staff = (Staff) session.getAttribute("staff");
		int sid = staff.getSid();
		List<Salary> salaryList = salaryService.queryBySId(sid);
		map.put("salaryList", salaryList);	
		return "salary/payroll";
	}
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public String list5(HttpServletRequest request, Model model,HttpSession session,
			HttpServletResponse response) throws IOException {
		response.setContentType("textml;charset=utf-8");
		PrintWriter out = response.getWriter();
		Staff staff = (Staff) session.getAttribute("staff");
		int id = staff.getAdmintypeId();
		if(id==4 || id==5){
			this.salaryService.showsalariesByPage(request, model);
			return "salary/list";			
		}else{
			out.flush();
		    out.println("<script>");
		    out.println("alert('你无此权限！');");
		    out.println("</script>");
		    return "empInfoModify";
		}
		
			
			
		
	}
	
}
	
	


