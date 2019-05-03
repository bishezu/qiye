package com.liandi.ems04.service.title;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liandi.ems04.entity.staff.Staff;
import com.liandi.ems04.entity.title.Title;
import com.liandi.ems04.mapper.title.TitleMapper;

@Service
public class TitleService implements ITitleService {

	@Autowired
	private TitleMapper titleMapper;
	
	@Override
	public void add(Title title) {
		titleMapper.add(title);
	}
	
	@Override
	public void remove(int id){
		titleMapper.deleteById(id);
		titleMapper.deleteStaffById(id);
	}
	
	@Override
	public void modify(Title title) {
		titleMapper.update(title);
	}
	
	@Override
	public void staffModify(Staff staff) {
		titleMapper.updateById(staff);
	}

	@Override
	public List<Title> queryAll() {
		return titleMapper.findAll();
	}
	
	@Override
	public Title queryById(int id){
		return titleMapper.findById(id);
	}

	@Override
	public List<Staff> queryStaffAllById(int id) {
		return titleMapper.findStaffAllById(id);
	}	
	
	@Override
	public Staff queryByStaffId(int id){
		return titleMapper.findByStaffId(id);
	}

}
