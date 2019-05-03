package com.liandi.ems04.service.staff;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liandi.ems04.entity.staff.Staff;
import com.liandi.ems04.mapper.staff.StaffMapper;

@Service
public class StaffService implements IStaffService {

	@Autowired
	private StaffMapper staffMapper;
	
	@Override
	public void registerStaff(Staff staff) {
		staffMapper.add(staff);
	}

	@Override
	public void removeBySid(int sid) {
		staffMapper.deleteBySid(sid);
	}

	@Override
	public void removeBySids(Map<String, Object> map) {
		staffMapper.deleteBySids(map);
	}

	@Override
	public void modify(Staff staff) {
		staffMapper.update(staff);
	}

	@Override
	public Staff queryStaffBySid(int sid) {
		return staffMapper.findBySid(sid);
	}

	@Override
	public Staff queryStaffByAccount(String account) {
		return staffMapper.findByAccount(account);
	}

	@Override
	public Staff queryStaffByAccountAndPassword(Map<String, Object> map) {
		return staffMapper.findByAccountAndPassword(map);
	}

	@Override
	public List<Staff> queryAll() {
	    List list=staffMapper.findAll();
		
		return staffMapper.findAll();
	}

	@Override
	public boolean isContainsAccount(String account) {
		return false;
	}

	@Override
	public List<Staff> query(Map<String, Object> map) {
		return staffMapper.find(map);
	}

}
