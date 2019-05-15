package com.liandi.ems04.service.login;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liandi.ems04.entity.staff.Staff;
import com.liandi.ems04.mapper.login.LoginMapper;

@Service
public class LoginService implements ILoginService {
	@Autowired
	private LoginMapper loginMapper;

	/**
	 * 检查登录的账户和密码
	 */
	@Override
	public Staff CheckLogin(String account, String password) {		
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("account", account);
		map.put("password", password);
		return loginMapper.findByAccountAndPassword(map);
	}
	
	/**
	 * 检查登陆的账户是否存在
	 */
	@Override
	public boolean isContainsAccount(String account){
		return loginMapper.isContainsAccount(account);
	}

	/**
	 * 根据t_staff的id字段查询
	 */
	@Override
	public Staff querryStaffById(int id) {
		return loginMapper.findById(id);
	}

	/**
	 * 修改员工管理员类别
	 */
	@Override
	public void modifyStaffInfo(Staff staff) {
		loginMapper.updateStaffInfo(staff);
	}

	/**
	 * 修改员工密码
	 */
	@Override
	public void modifyStaffPw(Staff staff) {
		loginMapper.updateStaffPw(staff);
	}

	/**
	 * 修改员工的基本信息
	 */
	@Override
	public void modifyStaffOwnInfo(Staff staff) {
		loginMapper.updateStaffOwnInfo(staff);
	}


}
