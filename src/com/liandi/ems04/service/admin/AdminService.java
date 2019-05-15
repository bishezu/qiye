package com.liandi.ems04.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liandi.ems04.entity.admin.Admin;
import com.liandi.ems04.entity.staff.Staff;
import com.liandi.ems04.mapper.admin.AdminMapper;


@Service
public class AdminService implements IAdminService {

	@Autowired
	private AdminMapper adminMapper;
	
	@Override
	public Admin queryAdminById(int adminTypeId) {
		return adminMapper.findByAdminId(adminTypeId);
	}

	@Override
	public void modify(Admin admin) {
		adminMapper.update(admin);
	}

	@Override
	public List<Admin> queryAllAdminType() {
		return adminMapper.findAllAdminType();
	}

	@Override
	public List<Staff> querryByAdminTypeId(int adminTypeId) {
		return adminMapper.findStaffByAdminId(adminTypeId);
	}

}
