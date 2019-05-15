package com.liandi.ems04.mapper.train;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.liandi.ems04.entity.attendance.Attendance;
import com.liandi.ems04.entity.train.Train;

public interface TrainMapper {
	//添加培训信息
    public void add(Train train); 
    
    //签到
    public void checkIn(Train train);
    
    //查询全部
    public List<Train> find();
    
    //员工查询
    public List<Train> findById(int sid);
    
    //查询日期
    public Date selectDate();
    
    public List<Train> findBySidPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="sid") Integer sid);
	
	public long getTrainCountBySid(@Param(value="sid") Integer sid);  
	
	
	public List<Train> findByDatePage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="date") String date);
	
	public long getTrainCountByDate(@Param(value="date") String date);  
	
	public List<Train> findAllPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize);
	
	public long getTrainCount(); 
}
