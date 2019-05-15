package com.liandi.ems04.entity.salary;

import org.springframework.stereotype.Component;


/*
 * 薪资实体类
 */
@Component
public class Salary {
	private int salaryId;
	private int sid;
	private int salaryLevel;
	private String presentDate;
	private double absenceDays;
	private double absenceFine;
	private double attendAwards;
	private double salaryGross;
	private double insurnce;
	private double salaryTax;
	private double salaryFinal;
	private boolean salaryStatus;
	public int getSalaryId() {
		return salaryId;
	}
	public void setSalaryId(int salaryId) {
		this.salaryId = salaryId;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}


	public int getSalaryLevel() {
		return salaryLevel;
	}
	public void setSalaryLevel(int salaryLevel) {
		this.salaryLevel = salaryLevel;
	}
	
	public String getPresentDate() {
		return presentDate;
	}
	public void setPresentDate(String presentDate) {
		this.presentDate = presentDate;
	}
	public double getAbsenceDays() {
		return absenceDays;
	}
	public void setAbsenceDays(double absenceDays) {
		this.absenceDays = absenceDays;
	}
	public double getAbsenceFine() {
		return absenceFine;
	}
	public void setAbsenceFine(double absenceFine) {
		this.absenceFine = absenceFine;
	}
	public double getAttendAwards() {
		return attendAwards;
	}
	public void setAttendAwards(double attendAwards) {
		this.attendAwards = attendAwards;
	}
	public double getSalaryGross() {
		return salaryGross;
	}
	public void setSalaryGross(double salaryGross) {
		this.salaryGross = salaryGross;
	}
	public double getInsurnce() {
		return insurnce;
	}
	public void setInsurnce(double insurnce) {
		this.insurnce = insurnce;
	}
	public double getSalaryTax() {
		return salaryTax;
	}
	public void setSalaryTax(double salaryTax) {
		this.salaryTax = salaryTax;
	}
	public double getSalaryFinal() {
		return salaryFinal;
	}
	public void setSalaryFinal(double salaryFinal) {
		this.salaryFinal = salaryFinal;
	}
	public boolean isSalaryStatus() {
		return salaryStatus;
	}
	public void setSalaryStatus(boolean salaryStatus) {
		this.salaryStatus = salaryStatus;
	}
	@Override
	public String toString() {
		return "Salary [salaryId=" + salaryId + ", sid=" + sid
				+ ", salaryLevelId=" + salaryLevel + ", presentDate="
				+ presentDate + ", absenceDays=" + absenceDays
				+ ", absenceDine=" + absenceFine + ", attendAwards="
				+ attendAwards + ", salaryGross=" + salaryGross + ", insurnce="
				+ insurnce + ", salaryTax=" + salaryTax + ", salaryFinal="
				+ salaryFinal + ", salaryStatus=" + salaryStatus + "]";
	}
	public Salary(int sid, int salaryLevelId, String presentDate,
			double absenceDays, double absenceDine, double attendAwards,
			double salaryGross, double insurnce, double salaryTax,
			double salaryFinal, boolean salaryStatus) {
		super();
		this.sid = sid;
		this.salaryLevel = salaryLevelId;
		this.presentDate = presentDate;
		this.absenceDays = absenceDays;
		this.absenceFine = absenceDine;
		this.attendAwards = attendAwards;
		this.salaryGross = salaryGross;
		this.insurnce = insurnce;
		this.salaryTax = salaryTax;
		this.salaryFinal = salaryFinal;
		this.salaryStatus = salaryStatus;
	}
	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
