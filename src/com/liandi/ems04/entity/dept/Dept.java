package com.liandi.ems04.entity.dept;

import org.springframework.stereotype.Component;


/**
 * 
 * @author 此类是部门类别的实体类
 * 
 */
@Component
public class Dept {
	private Integer deptId;
	private String deptName;
	public Dept() {
		
	}
	public Dept(Integer deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
}
