package com.liandi.ems04.mapper.dayoff;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.liandi.ems04.entity.dayoff.Dayoff;

//请假mapper类
@Repository
public interface DayoffMapper {
	public void add(Dayoff dayoff);

	public List<Dayoff> findBySid(int sid);

	public List<Dayoff> findByDate(String presentDate);

	public Dayoff findBySidAndDate(Map<String, Object> map);
	
	
    public List<Dayoff> findAll();
	
	
	public List<Dayoff> findBySidPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="sid") Integer sid);
	
	public long getDayoffCountBySid(@Param(value="sid") Integer sid);  
	
	
	public List<Dayoff> findByDatePage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="time") String time);
	
	public  long getDayoffCountByDate(@Param(value="time") String time);  
	
	public List<Dayoff> findAllPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize);
	
	public long getDayoffCount(); 


}
