package com.liandi.ems04.service.train;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.liandi.ems04.entity.train.Train;

public interface ITrainService {
	//添加培训信息
    public void add(Train train); 
    
    //签到
    public void checkIn(Train train);
    
    //查询
    public List<Train> find();
    
    //员工查询
    public List<Train> findById(int sid);
    
    //查询日期
    public Date selectDate();
    
    public void showTrainBySidByPage(HttpServletRequest request,Model model,int sid);  
	
	public void showTrainByDateByPage(HttpServletRequest request,Model model,String date);  
	
    public void showTrainByPage(HttpServletRequest request,Model model);  

}
