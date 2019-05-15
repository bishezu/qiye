package com.liandi.ems04.service.login;


import org.springframework.stereotype.Service;

import com.liandi.ems04.entity.staff.Staff;

@Service
public interface ILoginService {

	//检查登录的账户和密码
	public Staff CheckLogin(String account,String password);
	
	//检查登陆的账户是否存在
	public boolean isContainsAccount(String account);
	
	//根据t_staff的id字段查询
	public Staff querryStaffById(int id);
	
	//修改员工管理员类别
	public void modifyStaffInfo(Staff staff);
	
	//修改员工密码
	public void modifyStaffPw(Staff staff);
	
	//修改员工基本信息
	public void modifyStaffOwnInfo(Staff staff);
}
