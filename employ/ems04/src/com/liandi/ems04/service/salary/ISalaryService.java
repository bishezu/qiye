package com.liandi.ems04.service.salary;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.liandi.ems04.entity.salary.Salary;
import com.liandi.ems04.entity.staff.Staff;

public interface ISalaryService {
	
	public List<Salary> queryBySId(int id);
	
	public List<Salary> queryAll();
	
	public void queryByDate(HttpServletRequest request, Model model,String presentDate);
	
	//public void modify(Map<String ,Object> map);
	
	//public Salary queryBySIdD(Map<String ,Object> map);
	
	public void createTable(Salary salary);
	
	//查询员工薪资信息
	public Staff findBySIdStaff(int sid);
			
	//修改员工薪资等级
	public void updateStaffSalaryLevel(Staff staff);
		
	//查询全部员工薪资
	public List<Staff> findAllStaff();
	
	/** 
     * 分页显示商品 
     * @param request 
     * @param model 
     * @param loginUserId 
     */  
    public void showsalariesByPage(HttpServletRequest request,Model model); 
}
