package com.liandi.ems04.handler.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liandi.ems04.entity.staff.Staff;
import com.liandi.ems04.service.advice.IAdviceService;
import com.liandi.ems04.service.login.ILoginService;


@Controller
@RequestMapping("/login")
public class LoginHandler {
	@Autowired
	private ILoginService loginService;
	@Autowired
	private IAdviceService adviceService;

	/**
	 * 
	 * @param account 员工登录的账号
	 * @param password 员工登录的密码
	 * @param response 页面的响应
	 * @param session 用来存储用户登陆的账号和密码
	 * @throws IOException 抛出异常
	 */
	@RequestMapping("/toLogin")
	public void toLogin(String account,String password,HttpServletResponse response,HttpSession session) throws IOException{
		Staff staff = loginService.CheckLogin(account,password);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		//登录成功
		if(staff!=null){
			session.setAttribute("staff", staff);
			int admintypeId = staff.getAdmintypeId();
			if(admintypeId==1){
				out.write("{\"msg\":0}");//0:登录成功的消息
			}else{				
				out.write("{\"msg\":1}");//1:登录成功的消息
			}
		}
		//登录失败
		else{
			boolean isContainsAccount = loginService.isContainsAccount(account);
			if(!isContainsAccount){
				out.write("{\"msg\":2}");//2:登录失败:账号不存在
			}else{
				out.write("{\"msg\":3}");//3:登录失败:密码错误
			}
		}
		out.close();
	}
	
	/**
	 * 
	 * @return 跳转到修改密码的页面
	 */
	@RequestMapping("/toModifyPassword")
	public String toModifyPassword(HttpSession session,Map<String,Object> map){
		Staff staff = (Staff) session.getAttribute("staff");
		map.put("staff", staff);
		return "passwordModify";
	}
	
	/**
	 * 
	 * @param staff 员工对象
	 * @return 返回到修改界面
	 */
	@RequestMapping("/modifyPassword")
	public String modifyPassword(Staff staff){
		loginService.modifyStaffPw(staff);
		return "passwordModify";
	}
	
	@RequestMapping("/empInfoModify")
	public String empInfoModify(Staff staff){
		loginService.modifyStaffOwnInfo(staff);
		return "empInfoModify";
	}
	
	
}
