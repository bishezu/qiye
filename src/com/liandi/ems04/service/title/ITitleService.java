package com.liandi.ems04.service.title;

import java.util.List;

import com.liandi.ems04.entity.staff.Staff;
import com.liandi.ems04.entity.title.Title;

public interface ITitleService {

	//添加服务
	public void add(Title title);
	
	//删除服务
	public void remove(int id);
	
	//修改职位服务
	public void modify(Title title);
	
	//员工修改服务
	public void staffModify(Staff staff);
	
	//查询所有职位服务
	public List<Title> queryAll();
	
	//查询职位id服务
	public Title queryById(int id);
	
	//通过职位id查询所有员工服务
	public List<Staff> queryStaffAllById(int id);

	//通过员工id查询该员工服务
	public Staff queryByStaffId(int id);
	
}
