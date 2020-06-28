package com.poly.model.vo;

public class Employee extends Person{
	
	private String department;
	private String job;
	private int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	

	public Employee(String name, int age, String address, String department, String job, int salary) {
		super(name, age, address);
		this.department = department;
		this.job = job;
		this.salary = salary;
	} //부모생성자까지 추가해서 호출함//단축키 alt+s+a하고 밑으로 내리기


	public Employee(String department, String job, int salary) {
		super();
		this.department = department;
		this.job = job;
		this.salary = salary;
	}

	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
