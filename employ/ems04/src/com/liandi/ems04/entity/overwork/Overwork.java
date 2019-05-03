package com.liandi.ems04.entity.overwork;

import org.springframework.stereotype.Component;

/*加班实体类*/
@Component
public class Overwork {
	int id;
	int sid;
	String name;
	String presentDate;
	String checkIn;
	String checkOut;
	public Overwork() {
		super();
	}

	public Overwork(int sid, String presentDate, String checkOut) {
		super();
		this.sid = sid;
		this.presentDate = presentDate;
		this.checkOut = checkOut;
	}

	public Overwork(int sid, String name, String presentDate, String checkIn) {
		super();
		this.sid = sid;
		this.name = name;
		this.presentDate = presentDate;
		this.checkIn = checkIn;
	}
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
	public String getPresentDate() {
		return presentDate;
	}
	public void setPresentDate(String presentDate) {
		this.presentDate = presentDate;
	}
	public String getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	public String getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}
}
