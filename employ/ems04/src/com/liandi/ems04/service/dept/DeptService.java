package com.liandi.ems04.service.dept;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liandi.ems04.entity.dept.Dept;
import com.liandi.ems04.entity.staff.Staff;
import com.liandi.ems04.mapper.dept.DeptMapper;

@Service
public class DeptService implements IDeptService{
	
	@Autowired
	private DeptMapper deptMapper;

	@Override
	public void add(Dept dept) {
		deptMapper.add(dept);
		
	}
	
	@Override
	public List<Dept> queryAll() {
		return deptMapper.findAll();	
	}
	@Override
	public List<Staff> findStaff(int id){
		return deptMapper.findStaffById(id);
	}

	@Override
	public void delete(Integer dept) {	
		deptMapper.deleteemp(dept);
		deptMapper.delete(dept);
				
	}

	@Override
	public List<Staff> findBySid(int sid) {
		return deptMapper.findStaffBySid(sid);
	}
	
}
