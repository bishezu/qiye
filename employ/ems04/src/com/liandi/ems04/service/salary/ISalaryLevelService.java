package com.liandi.ems04.service.salary;

import java.util.List;



import com.liandi.ems04.entity.salary.SalaryLevel;

public interface ISalaryLevelService {
	
	public List<SalaryLevel> queryAll();
	
	public SalaryLevel queryByLevel(int salaryLevel);

	public void modify(SalaryLevel salaryLevel);
}
