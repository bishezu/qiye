package com.liandi.ems04.handler.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liandi.ems04.entity.admin.Admin;
import com.liandi.ems04.entity.staff.Staff;
import com.liandi.ems04.service.admin.IAdminService;
import com.liandi.ems04.service.login.ILoginService;

@Controller
@RequestMapping("/admin")
public class AdminHandler {

	@Autowired
	private IAdminService adminService;
	@Autowired
	private ILoginService loginService;
	
	/*
	 * 列出所有管理员类别及其简单的信息
	 */
	@RequestMapping("/adminType")
	public String adminType(Map<String,Object> map,HttpSession session,
			HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		Staff staff = (Staff) session.getAttribute("staff");
		int id = staff.getAdmintypeId();
		if(id==5){			
			List<Admin> adminTypeList = adminService.queryAllAdminType();
			map.put("adminTypeList", adminTypeList);
			return "admin/adminType";
		}else{
			out.flush();
		    out.println("<script>");
		    out.println("alert('你无此权限！');");
		    out.println("</script>");
		    return "empInfoModify";
		}
	}
	
	
	/*
	 * 发出修改请求，并跳转到修改界面
	 */
	@RequestMapping("/toAdminModifyType")
	public String toAdminModifyType(int adminTypeId,Map<String,Object> map){		
		Admin admin = adminService.queryAdminById(adminTypeId);
		map.put("admin", admin);
		return "admin/adminModifyType";			
	}
	
	
	/*
	 * 对管理员类别权限的修改
	 */
	@RequestMapping("/modify")
	public String modify(Admin admin){
		adminService.modify(admin);
		return "redirect:adminType.action";
	}
	
	/**
	 * 查询一类管理员下所有的员工
	 * @param map 存放
	 * @param adminTypeId
	 * @return 返回到某类管理员下所有员工的界面
	 * @throws IOException 
	 */
	@RequestMapping("/findAddTypeStaff")
	public String findAddTypeStaff(Map<String,Object> map,int adminTypeId,HttpSession session,
			HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		Staff staff = (Staff) session.getAttribute("staff");
		int id = staff.getAdmintypeId();
		if(id==5){
			List<Staff> staffList = adminService.querryByAdminTypeId(adminTypeId);
			map.put("staffList", staffList);
			return "admin/adminTypeSearch";			
		}else{
			out.flush();
		    out.println("<script>");
		    out.println("alert('你无此权限！');");
		    out.println("</script>");
		    List<Admin> adminTypeList = adminService.queryAllAdminType();
			map.put("adminTypeList", adminTypeList);
		    return "admin/adminType";
		}
	}
	
	/**
	 * 查询某个员工具体的权限信息
	 * @param map 存放数据
	 * @param admintypeId 管理员类别id
	 * @return 跳转到员工具体权限信息的界面
	 */
	@RequestMapping("/findStaffAdminById")
	public String findStaffAdminById(Map<String,Object> map,int admintypeId){
		Admin admin = adminService.queryAdminById(admintypeId);
		map.put("admin", admin);
		return "admin/adminTypeConcreteSearch";
	}
	
	/**
	 * 跳转到修改管理员类别界面
	 * @param t_staff表中的id
	 * @param map存放查找到的值
	 * @return 跳转到修改员工管理员类别的界面
	 */
	@RequestMapping("/toModifyStaffAdminType")
	public String toModifyStaffAdminType(int id,Map<String,Object> map){		
		map.put("staff",loginService.querryStaffById(id));
		return "admin/adminTypeModify";
	}
	
	/**
	 * 根据登录名和密码查询并修改员工的管理员类别
	 * @param staff 员工的数据
	 * @return 重定向到管理员类别界面
	 */
	@RequestMapping("/modifyStaffAdminType")
	public String modifyStaffAdminType(Staff staff){		
		loginService.modifyStaffInfo(staff);
		return "redirect:adminType.action";
	}
	
}
