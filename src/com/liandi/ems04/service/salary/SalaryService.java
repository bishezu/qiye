package com.liandi.ems04.service.salary;

import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.liandi.ems04.entity.salary.Salary;
import com.liandi.ems04.entity.salary.SalaryLevel;
import com.liandi.ems04.entity.staff.Staff;
import com.liandi.ems04.mapper.attendance.AttendanceMapper;
import com.liandi.ems04.mapper.salary.SalaryLevelMapper;
import com.liandi.ems04.mapper.salary.SalaryMapper;
import com.liandi.ems04.mapper.staff.StaffMapper;
import com.liandi.ems04.util.Page;

@Service
public class SalaryService implements ISalaryService {
	
	@Autowired
	private SalaryMapper salaryMapper;
	@Autowired
	private StaffMapper staffMapper;
	@Autowired
	private AttendanceMapper attendanceMapper;
	@Autowired
	private SalaryLevelMapper salaryLevelMapper;
	
	
	//private DateFormat df = new SimpleDateFormat("yyyy-MM-dd");//字符串转日期
	private SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM");//日期格式化字符串
	private SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy-MM-dd");//日期格式化字符串
	
	@Override
	public List<Salary> queryAll() {
		// TODO Auto-generated method stub
		return salaryMapper.findAll();
	}

	@Override
	public List<Salary> queryBySId(int id) {
		
		List<Salary> salarylist =salaryMapper.findBySId(id);
		
		return salarylist;
	}
	
	@Override
	public void queryByDate(HttpServletRequest request, Model model,String presentDate) {
		
		String pageNow = request.getParameter("pageNow");  
		Page page = null;  
		List<Salary> salarylist =new ArrayList<Salary>();
		
			
	    int totalCount = (int) salaryMapper.getfindByDateCount(presentDate);
		if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        salarylist = this.salaryMapper.findByDate(page.getStartPos(), page.getPageSize(), presentDate);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        salarylist = this.salaryMapper.findByDate(page.getStartPos(), page.getPageSize(), presentDate);  
	    }  
	  
	    model.addAttribute("salarylist", salarylist);  
	    model.addAttribute("page", page);  
		
	}

	@Override
	public void createTable(Salary salary) {
		// TODO Auto-generated method stub
		Salary salary2 =new Salary();
		
		salaryMapper.add(salary2);
	}

	@Override
	public Staff findBySIdStaff(int sid) {
		Staff staff  =salaryMapper.findBySIdStaff(sid);
		return staff;
	}

	@Override
	public void updateStaffSalaryLevel(Staff staff) {
		// TODO Auto-generated method stub
		salaryMapper.updateStaffSalaryLevel(staff);
	}

	@Override
	public List<Staff> findAllStaff() {
		// TODO Auto-generated method stub
		return salaryMapper.findAllStaff();
	}
	
	
	/*
	 * 薪资计算
	 * */
	@Scheduled(cron = "0 15 10 15 * ?")  //0 15 10 15 * ? 每月15日上午10:15触发      0 */1 * * * ?
	public void table(){
		Salary salary =new Salary();
		
		List<Staff> stafflist = salaryMapper.findAllStaff();
		
		//计算薪资前，先删除之前薪资信息
		salaryMapper.deleteAll();
		
		for(Staff staff:stafflist){	
			//建表
			Date date1=new Date();
			int sid =staff.getSid();
			Calendar calendar =Calendar.getInstance();
			calendar.setTime(date1);
			calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH)-1);
			date1 = calendar.getTime();
			
			salary.setSid(sid);			
			salary.setSalaryLevel(staff.getSalarylevel());
			salary.setPresentDate(sdf1.format(date1));
			salary.setSalaryStatus(true);			
					
			salaryMapper.add(salary);	
		}	
		
		absenceDays();
	}
	
	
	public void absenceDays(){
		//插考勤相关数据
		
		List<Staff> stafflist = salaryMapper.findAllStaff();
		
		for(Staff staff:stafflist){	
			
			Date date1=new Date();
			int sid =staff.getSid();
			Calendar calendar =Calendar.getInstance();
			calendar.setTime(date1);
			calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH)-1);
			date1 = calendar.getTime();
			String date2=sdf.format(date1);
			String date3=sdf1.format(date1);
			Map<String, Object> map1 = new HashMap<String, Object>();
			map1.put("sid",sid);
			map1.put("presentDate", date3);	
			
			Salary salary = salaryMapper.findBySIdD(map1);
				//System.out.println(salary+"nihao");		
				
				
				Map<String, Object> map2 = new HashMap<String, Object>();
				map2.put("sid",sid);
				
				map2.put("presentDate", date2);
				
//				System.out.println(sid+"0000000000");
//				System.out.println(date2+"1111111");
				
				double a1 = salaryMapper.count1(map2);
				double a2 = salaryMapper.count2(map2);
				double a3 = salaryMapper.count3(map2);
				double a4 = salaryMapper.count4(map2);
//				System.out.println(a1);
//				System.out.println(a2);
//				System.out.println(a3);
//				System.out.println(a4);
				double sum=0;
				double fine=0;
				double attendAwards=0;
				double salarygoss=0;
				double salarybase=0;
				double insurance=0;
				double tax=0;
				double salaryFinal=0;
				
				int salarylevel=salary.getSalaryLevel();
				
				
				SalaryLevel salaryl=salaryLevelMapper.findByLevel(salarylevel);
				salarybase = salaryl.getSalaryBase();	
				sum= 0.25*(a1+a2)+0.5*(a3)+a4;
				if(sum < 0.25){
					attendAwards=200;
					salary.setAttendAwards(attendAwards);
				}else {
					attendAwards=0;
					salary.setAttendAwards(attendAwards);
				}
				fine =sum*100;
				
				System.out.println(sum);
				salarygoss =salarybase+attendAwards-fine;

				insurance = calculateInsurancesAndFunds(salarygoss);
				insurance = (double)Math.round(insurance*100)/100;
				
				tax = calculateTax(salarygoss-insurance);
				tax = (double)Math.round(tax*100)/100;
				
				salaryFinal = salarygoss-insurance-tax;
				salaryFinal = (double)Math.round(salaryFinal*100)/100;
				
				
				
				
				salary.setAbsenceDays(sum);
				salary.setAbsenceFine(fine);
				salary.setSalaryGross(salarygoss);
				salary.setInsurnce(insurance);
				salary.setSalaryTax(tax);
				salary.setSalaryFinal(salaryFinal);
				salaryMapper.update(salary);
		}
		
	}
	
	
	/**
	 * 税金
	 * 
	 */
	public double calculateTax(double salaryBase){
		
		Properties pr = new Properties();
		double tax=0;
		try{
			pr.load(SalaryStatus.class.getClassLoader().getResourceAsStream(
					"taxes.properties"));
			Set<Object> set = pr.keySet();
			List<Integer> list = new ArrayList<Integer>();
			for (Object obj : set) {
				list.add(Integer.parseInt(obj.toString()));
			}
			Collections.sort(list);
			double a = 0, b = 0;
			for (int i = 2; i <= list.size(); i++) {
				if (salaryBase <= list.get(i - 1)) {
					break;
				} else if (i == list.size()) {
					a = Float.parseFloat(pr.getProperty(
							list.get(0).toString()).toString());
					b = salaryBase - list.get(i - 1);
				} else if (salaryBase <= list.get(i)) {
					a = Float.parseFloat(pr.getProperty(
							list.get(i).toString()).toString());
					b = salaryBase - list.get(i - 1);
				} else {
					a = Float.parseFloat(pr.getProperty(
							list.get(i).toString()).toString());
					b = list.get(i) - list.get(i - 1);
				}
				tax += b * a;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tax;
	}
	
	
	/**
     * 五险一金的计算方法
     * @param basicSalary 基础工资
     * @return 个人应交的五险一金
     */
    public double calculateInsurancesAndFunds(double salaryBase){
    	Properties pr = new Properties();
		double endowmentInsurance = 0;
		double medicalInsuranc = 0;
		double unemploymentInsurance = 0;
		double employmentInjuryInsurance = 0;
		double maternityInsurance = 0;
		double housingProvidentFund = 0;
		double otherInsurance = 0;
		double otherInsuranceExtra = 0;
		double max = 0;
		double min = 0;
		double insurancesAndFunds=0;
		try {
			pr.load(SalaryStatus.class.getClassLoader().getResourceAsStream(
					"insurances.properties"));
			endowmentInsurance = Float.parseFloat(pr
					.getProperty("p_endowment_insurance"));
			medicalInsuranc = Float.parseFloat(pr
					.getProperty("p_medical_insuranc"));
			unemploymentInsurance = Float.parseFloat(pr
					.getProperty("p_unemployment_insurance"));
			employmentInjuryInsurance = Float.parseFloat(pr
					.getProperty("p_employment_injury_insurance"));
			maternityInsurance = Float.parseFloat(pr
					.getProperty("p_maternity_insurance"));
			housingProvidentFund = Float.parseFloat(pr
					.getProperty("p_housing_provident_fund"));
			otherInsurance = Float.parseFloat(pr
					.getProperty("p_other_insurance"));
			otherInsuranceExtra = Float.parseFloat(pr
					.getProperty("p_other_insurance_extra"));
			max = Float.parseFloat(pr.getProperty("max"));
			min = Float.parseFloat(pr.getProperty("min"));

			double sum = endowmentInsurance + medicalInsuranc
					+ unemploymentInsurance + employmentInjuryInsurance
					+ maternityInsurance + housingProvidentFund
					+ otherInsurance;
			double a=salaryBase;
			if(a>max){
				a=max;
			}else if(a<min){
				a=min;
			}
			insurancesAndFunds=a*sum+otherInsuranceExtra;		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return insurancesAndFunds;
    }

	@Override
	public void showsalariesByPage(HttpServletRequest request,Model model) {
	
		 String pageNow = request.getParameter("pageNow");  
		  
		    Page page = null;  
		  
		    List<Salary> salaries = new ArrayList<Salary>();  
		  
		    int totalCount = (int) salaryMapper.getsalariesCount();  
		  
		    if (pageNow != null) {  
		        page = new Page(totalCount, Integer.parseInt(pageNow));  
		        salaries = this.salaryMapper.showsalariesByPage(page.getStartPos(), page.getPageSize());
		    } else {  
		        page = new Page(totalCount, 1);  
		        salaries = this.salaryMapper.showsalariesByPage(page.getStartPos(), page.getPageSize());

		    }  
		  
		    model.addAttribute("salaries", salaries);  
		    model.addAttribute("page", page);  
	}

}
