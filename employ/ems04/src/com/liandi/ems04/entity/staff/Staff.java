package com.liandi.ems04.entity.staff;

import java.util.Date;

/**
 * 
 * @author 员工的实体类
 * 
 */
public class Staff {

	private Integer id; // id
	private Integer sid; // 员工id
	private String name; // 员工姓名
	private String gender; // 性别
	private Date hiredate; // 入职时间
//	private Integer seniority; // 工龄(年)
	private String account; // 账号
	private String password; // 密码
	private Integer deptId;// 部门id
	private Integer titleId;// 职位id
	private Integer admintypeId; // 账号权限类别id
//	private String nation; // 民族
	private Date birthday; // 出生日期
	private String phone; // 电话号码*
	private String email; // 个人邮箱*
//	private String homeaddress; // 家庭住址*
	private String edubackground; // 学历
//	private String school; // 毕业学校
//	private String profession; // 专业
	private Integer salarylevel; // 薪资等级
/*	private Integer numbera;
	private Integer numberb;
	private Integer numberc;*/

	public Staff() {
		super();
	}

	public Staff(Integer sid, String name, String gender, Date hiredate,
			 String account, String password, Integer deptId,
			Integer titleId, Integer admintypeId,  Date birthday,
			String phone, String email,
			String edubackground,
			Integer salarylevel) {
		super();
		this.sid = sid;
		this.name = name;
		this.gender = gender;
		this.hiredate = hiredate;
		
		this.account = account;
		this.password = password;
		this.deptId = deptId;
		this.titleId = titleId;
		this.admintypeId = admintypeId;
		
		this.birthday = birthday;
		this.phone = phone;
		this.email = email;
		
		this.edubackground = edubackground;
		
		this.salarylevel = salarylevel;
	
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", sid=" + sid + ", name=" + name
				+ ", gender=" + gender + ", hiredate=" + hiredate
				+ ", account=" + account
				+ ", password=" + password + ", deptId=" + deptId
				+ ", titleId=" + titleId + ", admintypeId=" + admintypeId
				+  ", birthday=" + birthday + ", phone="
				+ phone + ", email=" + email +  ", edubackground=" + edubackground 
				+ ", salarylevel=" + salarylevel
				+ "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public Integer getTitleId() {
		return titleId;
	}

	public void setTitleId(Integer titleId) {
		this.titleId = titleId;
	}

	public Integer getAdmintypeId() {
		return admintypeId;
	}

	public void setAdmintypeId(Integer admintypeId) {
		this.admintypeId = admintypeId;
	}

	

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public String getEdubackground() {
		return edubackground;
	}

	public void setEdubackground(String edubackground) {
		this.edubackground = edubackground;
	}

	
	public Integer getSalarylevel() {
		return salarylevel;
	}

	public void setSalarylevel(Integer salarylevel) {
		this.salarylevel = salarylevel;
	}

	
}
