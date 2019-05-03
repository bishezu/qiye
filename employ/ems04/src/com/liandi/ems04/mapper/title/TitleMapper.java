package com.liandi.ems04.mapper.title;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.liandi.ems04.entity.staff.Staff;
import com.liandi.ems04.entity.title.Title;


@Repository
public interface TitleMapper {
	
	//添加职位
	public void add(Title title);
	
	//根据id删除职位
	public void deleteById(int id);
	
	//根据id将员工的titleId置为0
	public void deleteStaffById(int id);
	
	//修改职位信息
	public void update(Title title);
	
	//修改员工的职位
	public void updateById(Staff staff);
	
	//查看所有的职位
	public List<Title> findAll();
	
	//找出职位的id
	public Title findById(int id);
	
	//找出该职位的所有员工
	public List<Staff> findStaffAllById(int id);
	
	//找出该员工id
	public Staff findByStaffId(int id);
	
}
