package com.liandi.ems04.service.advice;



import java.util.List;

import com.liandi.ems04.entity.advice.Advice;

public interface IAdviceService {

	public void save(Advice advice);
	
	public void remove(int adviceId);
	
	public Advice queryByAdviceId(int adviceId);
	
	public List<Advice> queryByStaffId(int staffId);
	
	public List<Advice> findAll();
	
	public void modify(Advice reply);
}
