package com.liandi.ems04.service.admin;

import java.util.List;

import com.liandi.ems04.entity.admin.Admin;
import com.liandi.ems04.entity.staff.Staff;
/**
 * 
 * @author 权限管理模块服务层
 *
 */
public interface IAdminService {

	//查询服务
	public Admin queryAdminById(int adminTypeId);
	//查询所有
	public List<Admin> queryAllAdminType();
	//修改服务
	public void modify(Admin admin);
	//查询服务
	public List<Staff> querryByAdminTypeId(int adminTypeId);
}
