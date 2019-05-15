package com.liandi.ems04.handler.advice;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liandi.ems04.entity.advice.Advice;
import com.liandi.ems04.entity.staff.Staff;
import com.liandi.ems04.service.advice.IAdviceService;

@Controller
@RequestMapping("/advice")
public class AdviceHandler {

	@Autowired
	private IAdviceService adviceService;
	
	@RequestMapping("/advice")
	public String advice(Map<String,Object> map){
		List<Advice> adviceList = adviceService.findAll();
		map.put("adviceList",adviceList);
		return "advice/advice";
	}
	
	@RequestMapping("/save")
	public String save(String adviceTitle,String adviceContent,HttpSession session){
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   
		Date date = new Date();
		Staff staff = (Staff) session.getAttribute("staff");
		int id = staff.getId();
		Advice advice = new Advice();
		advice.setStaffId(id);
		advice.setAdviceTitle(adviceTitle);
		advice.setAdviceContent(adviceContent);
		advice.setAdviceTime(Timestamp.valueOf(simpleDate.format(date)));
		adviceService.save(advice);
		return "redirect:adviceStaff.action";
	}
	
	@RequestMapping("/remove")
	public String remove(int adviceId){
		adviceService.remove(adviceId);
		return "redirect:advice.action";
	}
	
	
	//根据意见id查询
	@RequestMapping("/queryByAdviceId")
	public String queryByAdviceId(int adviceId,Map<String,Object> map){
		Advice advice = adviceService.queryByAdviceId(adviceId);
		map.put("advice", advice);
		return "advice/adviceSearchById";
	}
	
	
	 //根据员工id查询
	@RequestMapping("/queryByStaffId")
	public String queryByStaffId(int staffId,Map<String,Object> map){
		List<Advice> adviceList= adviceService.queryByStaffId(staffId);
		map.put("adviceList", adviceList);
		return "advice/advice";
	}
	
	//跳转到修改界面，并将原来的数据传到修改界面
	@RequestMapping("/toModify")
	public String modify(int adviceId,Map<String,Object> map,HttpServletResponse response) throws IOException{
		Advice advice = adviceService.queryByAdviceId(adviceId);
		String reply = advice.getReplyContent();
		if(reply==null){
			map.put("advice", advice);
			return "advice/adviceReply";			
		}else{
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.flush();
			out.println("<script>");
			out.println("alert('该意见已回复！');");
			out.println("</script>");
		
			List<Advice> adviceList = adviceService.findAll();
			map.put("adviceList",adviceList);
			return "advice/advice";
		}
	}
	
	//修改回复
	@RequestMapping("/modify")
	public String modify(int adviceId,String replyContent,HttpSession session){
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   
		Date date = new Date();
		Advice advice = adviceService.queryByAdviceId(adviceId);
		advice.setReplyTime(Timestamp.valueOf(simpleDate.format(date)));
		advice.setReplyContent(replyContent);
		Staff staff = (Staff)session.getAttribute("staff");
		int adminId = staff.getAdmintypeId();
		advice.setAdminId(adminId);
		adviceService.modify(advice);
		return "redirect:advice.action";
	}
	
	//前台个人意见界面
	@RequestMapping("/adviceStaff")
	public String adviceStaff(HttpSession session,Map<String,Object> map){
		Staff staff = (Staff) session.getAttribute("staff");
		int id = staff.getId();
		List<Advice> adviceList = adviceService.queryByStaffId(id);
		map.put("adviceList", adviceList);
		return "advice/adviceStaff";
	}
}
