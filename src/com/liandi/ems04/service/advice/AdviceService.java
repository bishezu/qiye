package com.liandi.ems04.service.advice;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liandi.ems04.entity.advice.Advice;
import com.liandi.ems04.mapper.advice.AdviceMapper;

@Service
public class AdviceService implements IAdviceService {

	@Autowired
	private AdviceMapper adviceMapper;

	@Override
	public void save(Advice advice) {
		adviceMapper.addAdvice(advice);
		
	}

	@Override
	public void remove(int adviceId) {
		adviceMapper.deleteByAdviceId(adviceId);
	}

	@Override
	public Advice queryByAdviceId(int adviceId) {
		Advice advice = adviceMapper.findByAdviceId(adviceId);	
		return advice;
	}

	@Override
	public List<Advice> findAll() {
		List<Advice> advice = adviceMapper.findAll();
		return advice;
	}

	@Override
	public void modify(Advice reply) {
		adviceMapper.addReply(reply);		
	}

	@Override
	public List<Advice> queryByStaffId(int staffId) {
		
		return adviceMapper.findByStaffId(staffId);
	}
	
	
	
	
}
