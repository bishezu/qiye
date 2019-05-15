package com.liandi.ems04.entity.salary;

import org.springframework.stereotype.Component;

@Component
public class SalaryLevel {
	
	private int salaryLevelId;
	
	private int salaryLevel;
	
	private double salaryBase;

	public int getSalaryLevelId() {
		return salaryLevelId;
	}

	public void setSalaryLevelId(int salaryLevelId) {
		this.salaryLevelId = salaryLevelId;
	}

	public int getSalaryLevel() {
		return salaryLevel;
	}

	public void setSalaryLevel(int salaryLevel) {
		this.salaryLevel = salaryLevel;
	}

	public double getSalaryBase() {
		return salaryBase;
	}

	public void setSalaryBase(double salaryBase) {
		this.salaryBase = salaryBase;
	}

	@Override
	public String toString() {
		return "SalaryLevel [salaryLevelId=" + salaryLevelId + ", salaryLevel="
				+ salaryLevel + ", salaryBase=" + salaryBase + "]";
	}

	public SalaryLevel(double salaryBase) {
		super();
		this.salaryBase = salaryBase;
	}

	public SalaryLevel() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
