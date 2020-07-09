package com.collection.practice.model.vo;

import java.io.Serializable;

public class Employee3 implements Serializable{
	
	private int eld; //ป็น๘
	private String name;
	private String dept;
	private int salary;
	private double bonuspoint;
	
	public Employee3() {
		// TODO Auto-generated constructor stub
	}

	public Employee3(int eld, String name, String dept, int salary, double bonuspoint) {
		super();
		this.eld = eld;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.bonuspoint = bonuspoint;
	}

	public int getEld() {
		return eld;
	}

	public void setEld(int eld) {
		this.eld = eld;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonuspoint() {
		return bonuspoint;
	}

	public void setBonuspoint(double bonuspoint) {
		this.bonuspoint = bonuspoint;
	}

	@Override
	public String toString() {
		return "Employee3 [eld=" + eld + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", bonuspoint="
				+ bonuspoint + "]";
	}
	
	
	

}
