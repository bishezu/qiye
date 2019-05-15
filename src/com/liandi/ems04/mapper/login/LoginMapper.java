package com.liandi.ems04.mapper.login;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.liandi.ems04.entity.staff.Staff;

@Repository
public interface LoginMapper {

	//根据账号和密码查询
	public Staff findByAccountAndPassword(Map<String,Object> map);
	
	//判断账户是否存在
	public Boolean isContainsAccount(String account);
	
	//根据t_staff的id字段查询
	public Staff findById(int id);
	
	//修改员工管理员类别信息
	public void updateStaffInfo(Staff staff);
	
	//修改员工密码
	public void updateStaffPw(Staff staff);
	
	//修改员工基本信息
	public void updateStaffOwnInfo(Staff staff);
}
