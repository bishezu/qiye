package com.liandi.ems04.service.train;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.liandi.ems04.entity.attendance.Attendance;
import com.liandi.ems04.entity.train.Train;
import com.liandi.ems04.mapper.train.TrainMapper;
import com.liandi.ems04.util.Page;

@Service
public class TrainService implements ITrainService{
	@Autowired
	TrainMapper trainMapper;

	//添加培训信息
	@Override
	public void add(Train train) {
	   trainMapper.add(train);
	}

	//员工签到
	@Override
	public void checkIn(Train train) {
	   trainMapper.checkIn(train);
	}

	//查询
	@Override
	public List<Train> find() {
		List<Train> trainList=trainMapper.find();
		return trainList;
	}

	//员工查询
	@Override
	public List<Train> findById(int sid) {
		List<Train> trainList=trainMapper.findById(sid);
		return trainList;
	}

	@Override
	public Date selectDate() {
		Date date=trainMapper.selectDate();
		return date;
	}

	@Override
	public void showTrainBySidByPage(HttpServletRequest request, Model model, int sid) {
		 String pageNow = request.getParameter("pageNow");  
		  
		    Page page = null;  
		  
		    List<Train> train = new ArrayList<Train>();  
		  
		    int totalCount = (int)  trainMapper.getTrainCountBySid(sid);  
		  
		    if (pageNow != null) {  
		        page = new Page(totalCount, Integer.parseInt(pageNow));  
		        train = this. trainMapper.findBySidPage(page.getStartPos(), page.getPageSize(), sid);  
		    } else {  
		        page = new Page(totalCount, 1);  
		        train = this.trainMapper.findBySidPage(page.getStartPos(), page.getPageSize(), sid);  
		    }  
		  
		    model.addAttribute("train", train);  
		    model.addAttribute("page", page);  
		}  
		

	@Override
	public void showTrainByDateByPage(HttpServletRequest request, Model model, String date) {
		String pageNow = request.getParameter("pageNow");  
	    Page page = null;  
	  
	    List<Train> train = new ArrayList<Train>();  
	  
	    int totalCount = (int)  trainMapper.getTrainCountByDate(date);
	  
	    if (pageNow != null) {  
	        page = new Page(totalCount, Integer.parseInt(pageNow));  
	        train = this. trainMapper.findByDatePage(page.getStartPos(), page.getPageSize(), date);  
	    } else {  
	        page = new Page(totalCount, 1);  
	        train = this.trainMapper.findByDatePage(page.getStartPos(), page.getPageSize(),date);  
	    }  
	  
	    model.addAttribute("train", train);  
	    model.addAttribute("page", page);  
		
	}

	@Override
	public void showTrainByPage(HttpServletRequest request, Model model) {
		 String pageNow = request.getParameter("pageNow");  
		  
		    Page page = null;  
		  
		    List<Train> train = new ArrayList<Train>();  
		  
		    int totalCount = (int) trainMapper.getTrainCount();  
		  
		    if (pageNow != null) {  
		        page = new Page(totalCount, Integer.parseInt(pageNow));  
		        train = this.trainMapper.findAllPage(page.getStartPos(), page.getPageSize());  
		    } else {  
		        page = new Page(totalCount, 1);  
		        train = this.trainMapper.findAllPage(page.getStartPos(), page.getPageSize());  
		    }  
		  
		    model.addAttribute("train", train);  
		    model.addAttribute("page", page);  
		
	}
    
	
}
