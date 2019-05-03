package com.liandi.ems04.mapper.attendance;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.liandi.ems04.entity.attendance.Attendance;

/*
 * 考勤mapper类
 */

@Repository
public interface AttendanceMapper {

	public void add(Attendance attendance);

	public List<Attendance> findBySid(int sid);

	public List<Attendance> findByDate(String presentDate);

	public Attendance findBySidAndDate(Map<String, Object> map);

	public void update(Attendance attendance);

	public List<Attendance> findAll();
	
	
	public List<Attendance> findBySidPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="sid") Integer sid);
	
	public long getAttendanceCountBySid(@Param(value="sid") Integer sid);  
	
	
	public List<Attendance> findByDatePage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="presentDate") String presentDate);
	
	public long getAttendanceCountByDate(@Param(value="presentDate") String presentDate);  
	
	public List<Attendance> findAllPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize);
	
	public long getAttendanceCount(); 
}
