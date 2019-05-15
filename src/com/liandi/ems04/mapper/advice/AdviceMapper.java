package com.liandi.ems04.mapper.advice;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.liandi.ems04.entity.advice.Advice;


@Repository
public interface AdviceMapper {

	public void addAdvice(Advice advice);
	
	public void deleteByAdviceId(int adviceId);
	
	
	public Advice findByAdviceId(int adviceId);
	
	public List<Advice> findByStaffId(int staffId);
	
	public void addReply(Advice reply);
	
	public List<Advice> findAll();
	
}
