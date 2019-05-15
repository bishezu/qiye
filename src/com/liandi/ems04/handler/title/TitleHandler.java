package com.liandi.ems04.handler.title;

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
import com.liandi.ems04.entity.title.Title;
import com.liandi.ems04.service.dept.IDeptService;
import com.liandi.ems04.service.title.ITitleService;

@Controller
@RequestMapping("/title")
public class TitleHandler {
	
	@Autowired
	private ITitleService titleService;
	@Autowired
	private IDeptService deptService;
	
	/*
	 * 发出添加请求，并跳转到添加界面
	 * 将所有部门带过去
	 */
	@RequestMapping("/toTitleAdd")
	public String toTitleAdd(Map<String,Object> map){
		List<Dept> deptList = deptService.queryAll();
		map.put("deptList", deptList);
		return "title/titleAdd";
	}
	
	/*
	 * 进行职位的添加
	 */
	@RequestMapping("/titleAdd")
	public String add(String titleName,Integer deptId){
		Title title = new Title(titleName,deptId);
		titleService.add(title);
		return "redirect:title.action";
	}
	
	/*
	 * 列出所有职位类别及其信息
	 */
	@RequestMapping("/title")
	public String list(Map<String,Object> map,HttpSession session,
			HttpServletResponse response) throws IOException{
		response.setContentType("textml;charset=utf-8");
		PrintWriter out = response.getWriter();
		Staff staff = (Staff) session.getAttribute("staff");
		int id = staff.getAdmintypeId();
        if(id==5){
        	List<Title> titleList = titleService.queryAll();
        	map.put("titleList",titleList);
        	return "title/title";        	
        }else{
        	out.flush();
		    out.println("<script>");
		    out.println("alert('你无此权限！');");
		    out.println("</script>");
		    return "empInfoModify";
        }
	}
	
	/*
	 * 发出修改请求，并跳转到职位修改界面
	 */
	@RequestMapping("/toTitleModify")
	public String toTitleModify(int id,Map<String,Object> map){
		List<Dept> deptList = deptService.queryAll();
		Title title = titleService.queryById(id);
		map.put("title", title);
		map.put("deptList", deptList);
		return "title/titleModify";
	}
	
	/*
	 * 对职位信息进行修改
	 */
	@RequestMapping("/titleModify")
	public String modify(Title title){
		titleService.modify(title);
		return "redirect:title.action";
	}
	
	/**
	 * 查询该职位下下所有的员工
	 * @param map 存放
	 * @param titleId
	 * @return 返回到某职位下所有员工的界面
	 * @throws IOException 
	 */
	@RequestMapping("/staff")
	public String staff(Map<String,Object> map,int id){
		List<Staff> staffList = titleService.queryStaffAllById(id);
		map.put("staffList",staffList);
		return "title/titleDetail";
	}
	
	/*
	 * 发出删除请求，执行删除操作
	 */
	@RequestMapping("/delete")
	public String delete(int id){
		titleService.remove(id);
		return "redirect:title.action";
	}
	
	/*
	 * 发出修改请求，并跳转到员工职位修改界面
	 * 将所有职位带过去
	 */
	@RequestMapping("/toStaffModify")
	public String toStaffModify(Map<String,Object> map,int sid){
		List<Title> titleList = titleService.queryAll();
		Staff staff = titleService.queryByStaffId(sid);
		map.put("titleList", titleList);
    	map.put("staff",staff);
		return "title/staffModify";	
	}
	
	/*
	 * 对员工职位信息进行修改
	 */
	@RequestMapping("/modifyStaff")
	public String modifyStaff(Staff staff){
		titleService.staffModify(staff);
		return "redirect:title.action";	
	}

}
