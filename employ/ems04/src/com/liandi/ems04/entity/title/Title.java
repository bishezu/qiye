package com.liandi.ems04.entity.title;

/**
 * 
 * @author 此类是职位类别的实体类
 * 
 */

public class Title {
	
	private Integer id; //职位id
	private String titleName;//职位名称
//	private String titleFunction;//职位功能
	private Integer deptId;//部门id
	//private Dept dept;
	
	public Title() {
		super();
	}

	public Title(String titleName,Integer deptId) {
		super();
		this.titleName = titleName;
	//	this.titleFunction = titleFunction;
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Title [id=" + id + ", titleName=" + titleName
				+ ", deptId=" + deptId
				+ "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

//	public String getTitleFunction() {
//		return titleFunction;
//	}
//
//	public void setTitleFunction(String titleFunction) {
//		this.titleFunction = titleFunction;
//	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

}
