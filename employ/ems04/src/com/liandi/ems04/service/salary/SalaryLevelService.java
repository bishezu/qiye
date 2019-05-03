package com.liandi.ems04.service.salary;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liandi.ems04.entity.salary.SalaryLevel;
import com.liandi.ems04.mapper.salary.SalaryLevelMapper;

@Service
public class SalaryLevelService implements ISalaryLevelService {
	@Autowired
	private SalaryLevelMapper salaryLevelMapper;

	@Override
	public List<SalaryLevel> queryAll() {
		
		return salaryLevelMapper.findAll();
	}

	@Override
	public SalaryLevel queryByLevel(int salarylevel) {
		
		return  salaryLevelMapper.findByLevel(salarylevel);
	}

	@Override
	public void modify(SalaryLevel salaryLevel) {
		
		salaryLevelMapper.update(salaryLevel);
		
	
	}
}
