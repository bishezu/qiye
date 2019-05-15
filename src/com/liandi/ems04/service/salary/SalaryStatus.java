package com.liandi.ems04.service.salary;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SalaryStatus {

	
	
	@Scheduled(cron = "0 0 0 15 * ? ")
	public void pay(){
			
		
	}
	
	public void statisticalWages(String date){
		
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
    
    /*public void payoff(String date,int salarylevel){
    	SalaryService salaryService=new SalaryService();
    	SalaryLevelService salaryLevelService = new SalaryLevelService();
    	SalaryLevel salaryLevel =salaryLevelService.queryByLevel(salarylevel);
    	List<Salary> list = salaryService.queryByDate(date);
    	for(Salary salary:list){
    		if(!salary.g){
    			double salaryBasic=salaryLevel.getSalaryBase(),
    			absenceFine=salary.getAbsenceFine(),
    			attendAwards=salary.getAttendAwards(),
    			tax=salary.getSalaryTax(),
    			insurance=salary.getInsurnce();
    			
    			payTax(tax);
    			payInsurancesAndFunds(insurancesAndFunds);
    			payOff(basicSalary+attendAwards-absenceFine-tax-insurance);
    			salaryService.updatePayroll(salary);    //在salary表中的发放状态改为已发放
    		}
    		
    	}
    	
	}
	*/

}
