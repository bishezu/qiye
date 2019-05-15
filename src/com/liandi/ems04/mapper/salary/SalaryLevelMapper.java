package com.liandi.ems04.mapper.salary;

import java.util.List;

import com.liandi.ems04.entity.salary.SalaryLevel;

public interface SalaryLevelMapper {
	
	public void update(SalaryLevel salaryLevel);
	
	public List<SalaryLevel> findAll(); 
	
	public SalaryLevel findByLevel(int salaryBase);

	
}
