package com.liandi.ems04.handler.train;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

import com.liandi.ems04.entity.staff.Staff;
import com.liandi.ems04.entity.train.Train;
import com.liandi.ems04.service.train.ITrainService;

@Controller
@RequestMapping("/train")
public class TrainHandler {
	@Autowired
	ITrainService trainService;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	
	//跳转到员工培训列表
	@RequestMapping("/signIn")
	public String trainList(Map<String, Object> map) {
		List<Train> trainList=trainService.find();
		map.put("train",trainList);
		return "train/signIn";
	}
	
	//跳转到添加培训信息页面
	@RequestMapping("/addTrain")
	public String addTrain() {
		return "train/addTrain";
	}
	
	//添加培训信息
	@RequestMapping("/add")
	public String  add(HttpServletRequest request) {
		String num=request.getParameter("num");
		String date=request.getParameter("date");
		String info=request.getParameter("info");
		Train train=new Train();
		train.setNum(num);
		train.setDate(date);
		train.setInfo(info);
		trainService.add(train);
		return "train/trainListAdmin";
	}
	
	//员工签到
	@RequestMapping("/checkIn")
	public String checkIn(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception {
		PrintWriter out = response.getWriter();
		Staff staff = (Staff) session.getAttribute("staff");
		int sid=staff.getSid();
		String name=staff.getName();
		Date d=new Date();
		String checkIn=sdf.format(d);
		Train train=new Train();
		train.setSid(sid);
		train.setName(name);
		train.setCheck_in(checkIn);
		Date date1=trainService.selectDate();
		String date=sdf2.format(date1);
	    if(checkIn.equals(date)) {
	    	trainService.checkIn(train);
	    	return "redirect:findById.action";
	    }else {
	    	out.flush();
		    out.println("<script>");
		    out.println("alert('当前不能签到！！');");
		    out.println("</script>");	
	    }
		return "empInfoModify";
		
	}

	//显示所有培训信息
	@RequestMapping("/trainListAdmin")
	public String trainListAdmin(HttpServletRequest request, Model model,
			HttpSession session,HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		Staff staff = (Staff) session.getAttribute("staff");
		int id = staff.getAdmintypeId();
		if(id==2 || id==5){	
			//此处的productService是注入的IProductService接口的对象  
			this.trainService.showTrainByPage(request, model);  
			return "train/trainListAdmin";  			
		}else{
			out.flush();
		    out.println("<script>");
		    out.println("alert('你无此权限！');");
		    out.println("</script>");
		    return "empInfoModify";
		}
	}
	
	//显示该员工的培训信息
    @RequestMapping("/findById")
	public String findById(HttpSession session,Map<String, Object> map) {
    	Staff staff=(Staff) session.getAttribute("staff");
    	int sid=staff.getSid();
		List<Train> trainList=trainService.findById(sid);
		map.put("train", trainList);
	    return "train/trainList";
		}
    
    
    
    //分页
    int Sid = 0;//员工编号中间变量
	/* 管理员按员工编号分页显示培训记录主控制方法 */
	@RequestMapping(value = "/AdminFindBySid", method = RequestMethod.GET)  
	public String AdminFindBySid(int sid,HttpServletRequest request, Model model) { 
		
			this.trainService.showTrainBySidByPage(request, model, sid);
			Sid = sid;
			return "train/trainListBySid";  			
		
	}  
	
	/* 管理员按员工编号分页显示培训记录辅控制方法 */
	@RequestMapping(value = "/AdminFindBySidPage", method = RequestMethod.GET)  
	public String AdminFindBySid2(HttpServletRequest request, Model model) { 
		int sid = 0;
		sid = Sid;
	    this.trainService.showTrainBySidByPage(request, model, sid); 
	    return "train/trainListBySid";  
	}  
	
	
	
	String presentDateTemp = null;//日期中间变量
	/* 管理员按日期分页显示培训记录主控制方法 */
	@RequestMapping(value = "/AdminFindByDate", method = RequestMethod.GET)  
	public String showMyProduct(String date ,HttpServletRequest request, Model model) {
		System.out.println(date);
	    this.trainService.showTrainByDateByPage(request, model, date);
	    presentDateTemp =date;
	    return "train/trainListByDate";  
	}  
	
	/* 管理员按日期分页显示培训记录辅控制方法 */
	@RequestMapping(value = "/AdminFindByDatePage", method = RequestMethod.GET)  
	public String showMyProduct2(HttpServletRequest request, Model model) { 
		String date = null;
		date = presentDateTemp;
	    this.trainService.showTrainByDateByPage(request, model, date); 
	    return "train/trainListByDate";  
	}  
}
