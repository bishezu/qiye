package com.liandi.ems04.mapper.overwork;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.liandi.ems04.entity.overwork.Overwork;

//加班mapper类
@Repository
public interface OverworkMapper {
	public void add(Overwork overwork);

	public List<Overwork> findBySid(int sid);

	public List<Overwork> findByDate(String presentDate);

	public Overwork findBySidAndDate(Map<String, Object> map);
	
	public void update(Overwork overwork);
	
    public List<Overwork> findAll();
	
	
	public List<Overwork> findBySidPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="sid") Integer sid);
	
	public long getOverworkCountBySid(@Param(value="sid") Integer sid);  
	
	
	public List<Overwork> findByDatePage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="presentDate") String presentDate);
	
	public  long getOverworkCountByDate(@Param(value="presentDate") String presentDate);  
	
	public List<Overwork> findAllPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize);
	
	public long getOverworkCount(); 

}
