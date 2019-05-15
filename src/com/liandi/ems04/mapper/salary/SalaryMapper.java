package com.liandi.ems04.mapper.salary;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;







import com.liandi.ems04.entity.salary.Salary;
import com.liandi.ems04.entity.staff.Staff;

@Repository
public interface SalaryMapper {

	public List<Salary> findBySId(int sid);

	public void add(Salary salary);
	
	public Salary findBySIdD(Map<String ,Object> map);
	
	public void update(Salary salary);
	
	public double count1(Map<String ,Object> map);
	
	public double count2(Map<String ,Object> map);
	
	public double count3(Map<String ,Object> map);
	
	public double count4(Map<String ,Object> map);
	//查询员工薪资信息
	public Staff findBySIdStaff(int sid);
		
	//修改员工薪资等级
	public void updateStaffSalaryLevel(Staff staff);
	
	//查询全部员工薪资
	public List<Staff> findAllStaff();
	
	public List<Salary> findAll();
	
	public List<Salary> findByDate(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize,@Param(value="presentDate") String presentDate);
	public long getfindByDateCount(@Param(value="presentDate")String presentDate); 
	
	/** 
	 * 使用注解方式传入多个参数，薪资表分页 
	 * @param page 
	 * @param userId 
	 * @return startPos},#{pageSize}  
	 */  
	public List<Salary> showsalariesByPage(@Param(value="startPos") Integer startPos,@Param(value="pageSize") Integer pageSize);  
		
	/** 
	 * 取得列表数量信息，通过登录用户ID查询 
	 * @param userId 
	 * @return 
	 */  
	public long getsalariesCount();

	public void deleteAll();  
}
