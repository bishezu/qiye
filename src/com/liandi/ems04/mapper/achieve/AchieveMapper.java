package com.liandi.ems04.mapper.achieve;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.liandi.ems04.entity.achieve.Achieve;
import com.liandi.ems04.entity.attendance.Attendance;

/*
 * 考勤mapper类
 */

@Repository
public interface AchieveMapper {

	public void add(Achieve achieve);

	public List<Achieve> findBySid(int sid);

	
	public List<Achieve> findAll();
	
	
	public List<Achieve> findBySidPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="sid") Integer sid);
	
	public long getAchieveCountBySid(@Param(value="sid") Integer sid);  
	
	
	public List<Achieve> findAllPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize);
	
	public long getAchieveCount(); 
}
