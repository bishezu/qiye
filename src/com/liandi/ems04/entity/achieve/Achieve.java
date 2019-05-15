package com.liandi.ems04.entity.achieve;

import org.springframework.stereotype.Component;

/**
 * 
 * @author 此类是绩效的实体类
 * 
 */
@Component
public class Achieve {
	int id;
	int sid;
	String name;
	int achieve;
	int efficient;
	int absent;
	String level;

	public Achieve() {
		super();
	}

	public Achieve(int sid,String level) {
		super();
		this.sid = sid;
		this.level = level;
	}

//	public Achieve(int sid, String name, String presentDate, String checkIn) {
//		super();
//		this.sid = sid;
//		this.name = name;
//		this.presentDate = presentDate;
//		this.checkIn = checkIn;
//	}
  public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAchieve() {
		return achieve;
	}
	public void setAchieve(int achieve) {
		this.achieve = achieve;
	}
	public int getEfficient() {
		return efficient;
	}
	public void setEfficient(int efficient) {
		this.efficient = efficient;
	}
	public int getAbsent() {
		return absent;
	}
	public void setAbsent(int absent) {
		this.absent = absent;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

}
