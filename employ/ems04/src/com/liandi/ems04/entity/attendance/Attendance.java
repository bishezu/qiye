package com.liandi.ems04.entity.attendance;

import org.springframework.stereotype.Component;

/*
 * 考勤实体类
 */

@Component
public class Attendance {
	int id;
	int sid;
	String name;
	String presentDate;
	String checkIn;
	String checkOut;
	boolean arriveLate;
	boolean leaveEarly;
	boolean halfAbsenteeism;
	boolean absenteeism;

	public Attendance() {
		super();
	}

	public Attendance(int sid, String presentDate, String checkOut) {
		super();
		this.sid = sid;
		this.presentDate = presentDate;
		this.checkOut = checkOut;
	}

	public Attendance(int sid, String name, String presentDate, String checkIn) {
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

	public boolean isArriveLate() {
		return arriveLate;
	}

	public void setArriveLate(boolean arriveLate) {
		this.arriveLate = arriveLate;
	}

	public boolean isLeaveEarly() {
		return leaveEarly;
	}

	public void setLeaveEarly(boolean leaveEarly) {
		this.leaveEarly = leaveEarly;
	}

	public boolean isHalfAbsenteeism() {
		return halfAbsenteeism;
	}

	public void setHalfAbsenteeism(boolean halfAbsenteeism) {
		this.halfAbsenteeism = halfAbsenteeism;
	}

	public boolean isAbsenteeism() {
		return absenteeism;
	}

	public void setAbsenteeism(boolean absenteeism) {
		this.absenteeism = absenteeism;
	}

	@Override
	public String toString() {
		return "Attendance [id=" + id + ", sid=" + sid + ", name=" + name
				+ ", presentDate=" + presentDate + ", checkIn=" + checkIn
				+ ", checkOut=" + checkOut + ", arriveLate=" + arriveLate
				+ ", leaveEarly=" + leaveEarly + ", halfAbsenteeism="
				+ halfAbsenteeism + ", absenteeism=" + absenteeism + "]";
	}

}
