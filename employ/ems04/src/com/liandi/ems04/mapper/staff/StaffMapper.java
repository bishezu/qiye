package com.liandi.ems04.mapper.staff;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.liandi.ems04.entity.staff.Staff;

/**
 * 
 * @author 员工管理的底层接口
 * 
 */
@Repository
public interface StaffMapper {
	// 添加员工
	public void add(Staff staff);

	// 删除员工
	public void deleteBySid(int sid);

	// 根据多个sid删除员工
	public void deleteBySids(Map<String, Object> map);

	// 更新员工信息
	public void update(Staff staff);

	// 查询员工
	public Staff findBySid(int sid);

	// 根据账号查询
	public Staff findByAccount(String account);

	// 根据账号密码查询员工信息
	public Staff findByAccountAndPassword(Map<String, Object> map);

	// 查询所有员工
	public List<Staff> findAll();

	// 根据账号查询是否存在账户
	public boolean isContainsAccount(String account);

	// 动态查询、模糊查询、分页查询
	public List<Staff> find(Map<String, Object> map);

}
