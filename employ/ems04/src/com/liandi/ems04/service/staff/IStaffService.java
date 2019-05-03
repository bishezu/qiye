package com.liandi.ems04.service.staff;

import java.util.List;
import java.util.Map;

import com.liandi.ems04.entity.staff.Staff;

/**
 * 
 * @author 员工管理模块服务层
 * 
 */
public interface IStaffService {
	// 添加员工
	public void registerStaff(Staff staff);

	// 删除员工
	public void removeBySid(int sid);

	// 根据多个sid删除员工
	public void removeBySids(Map<String, Object> map);

	// 更新员工信息
	public void modify(Staff staff);

	// 查询员工
	public Staff queryStaffBySid(int sid);

	// 根据账号查询
	public Staff queryStaffByAccount(String account);

	// 根据账号密码查询员工信息
	public Staff queryStaffByAccountAndPassword(Map<String, Object> map);

	// 查询所有员工
	public List<Staff> queryAll();

	// 根据账号查询是否存在账户
	public boolean isContainsAccount(String account);

	// 动态查询、模糊查询、分页查询
	public List<Staff> query(Map<String, Object> map);

}
