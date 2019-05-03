package com.liandi.ems04.handler.dept;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liandi.ems04.entity.dept.Dept;
import com.liandi.ems04.entity.staff.Staff;
import com.liandi.ems04.service.dept.IDeptService;

@Controller
@RequestMapping("/dept")
public class DeptHandler {

	@Autowired
	private IDeptService deptService;

	
	@RequestMapping("/deptAdd")
	public String add(String deptId,String deptName){
		Dept dept = new Dept();
		int id=Integer.parseInt(deptId);
		dept.setDeptId(id);
		dept.setDeptName(deptName);
		deptService.add(dept);
		return "redirect:list.action";
	}

	@RequestMapping("/list")
	public String list(Map<String,Object> map,HttpSession session,
			HttpServletResponse response) throws IOException{
		response.setContentType("textml;charset=utf-8");
		PrintWriter out = response.getWriter();
		System.out.println(session.getAttribute("staff"));
		Staff staff = (Staff) session.getAttribute("staff");
		int id = staff.getAdmintypeId();
        if(id==3 || id==5){
        	List<Dept> deptList = deptService.queryAll();
        	map.put("deptList", deptList);
        	return "dept/deptWeb";       	
        }else{
        	out.flush();
		    out.println("<script>");
		    out.println("alert('你无此权限！');");
		    out.println("</script>");
		    return "empInfoModify";
        }
	}
	
	@RequestMapping("/detail")
	public String detail(Integer id,Map<String,Object> map){
		List<Staff> staffList = deptService.findStaff(id);
		map.put("staffList", staffList);
		return "dept/deptSearch";
	}
	@RequestMapping("/deptDelete")
	public String deptdelete(Integer deptId){
		deptService.delete(deptId);
		return "redirect:list.action";
	}
	@RequestMapping("/searchBySid")
	public String searchBySid(String sid,Map<String,Object> map){
		int num=Integer.parseInt(sid);
		List<Staff> staffList= deptService.findBySid(num);
		map.put("staffList", staffList);
		return "dept/deptSearch";
	}
	
	@RequestMapping("/modify")
	public String modify(Integer id,Map<String,Object> map){
		List<Staff> staffList = deptService.findStaff(id);
		map.put("staffList", staffList);
		return "dept/deptModify";
	}
}
