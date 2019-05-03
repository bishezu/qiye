package com.liandi.ems04.service.dept;

import java.util.List;

import com.liandi.ems04.entity.dept.Dept;
import com.liandi.ems04.entity.staff.Staff;

public interface IDeptService {

	public List<Dept> queryAll();

	public void add(Dept dept);
	
	public List<Staff> findStaff(int id);

	public void delete(Integer id);
	
	public List<Staff> findBySid(int sid);

	}


