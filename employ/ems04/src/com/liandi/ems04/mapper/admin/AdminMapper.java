package com.liandi.ems04.mapper.admin;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.liandi.ems04.entity.admin.Admin;
import com.liandi.ems04.entity.staff.Staff;
/**
 * 
 * @author 此类是权限管理的底层接口
 *
 */
@Repository
public interface AdminMapper {
	//根据管理员类别id查询管理员类别
	public Admin findByAdminId(int adminTypeId);
	//查看所有管理员类别
	public List<Admin> findAllAdminType();
	//修改权限
	public void update(Admin admin);
	//点击查看--根据管理员类型id查询员工
	public List<Staff> findStaffByAdminId(int adminTypeId);
}
