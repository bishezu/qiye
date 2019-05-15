package com.liandi.ems04.entity.dayoff;

import org.springframework.stereotype.Component;

@Component
public class Dayoff {
   int id;
   int sid;
   String name;
   public Dayoff() {
		super();
	}

	public Dayoff(int sid, String name, int days,String time, String reason) {
		super();
		this.sid = sid;
		this.name = name;
		this.time = time;
		this.reason = reason;
		this.days=days;
	}
   public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
int days;
   String time;
   String reason;
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
public int getDays() {
	return days;
}
public void setDays(int days) {
	this.days = days;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}
}
