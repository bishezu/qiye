package com.liandi.ems04.mapper.dept;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.liandi.ems04.entity.dept.Dept;
import com.liandi.ems04.entity.staff.Staff;

@Repository
public interface DeptMapper {
	/**
	 * 添加部门
	 * @param dept
	 */
	public  void add(Dept dept);
    /**
     * 查询所有部门
     * @return 部门合集
     */
	public List<Dept> findAll();

	/**
	 * 按部门ID查找员工信息
	 * @return 员工信息
	 */
	public List<Staff> findStaffById(int id);
	
	/**
	 * 按员工ID查找员工信息
	 * @return 员工信息
	 */
	public List<Staff> findStaffBySid(int id);
	
	/**
	 * 删除部门
	 * @param dept
	 */
	public void delete(Integer dept);
	
	/**
	 * 删除员工
	 * @param dept
	 */
	public void deleteemp(Integer dept);
	
	/**
	 * 修改部门
	 * @param dept
	 */
	public void update(Dept dept);

}
