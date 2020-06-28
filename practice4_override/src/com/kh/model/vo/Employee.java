package com.kh.model.vo;

public class Employee extends Person {
	
	private String departmaent;
	private String job;
	private int money;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String departmaent, String job, int money) {
		super();
		this.departmaent = departmaent;
		this.job = job;
		this.money = money;
	}
	
	

	public Employee(String name, int age, char gender, String departmaent, String job, int money) {
		super(name, age, gender);
		this.departmaent = departmaent;
		this.job = job;
		this.money = money;
	}

	public String getDepartmaent() {
		return departmaent;
	}

	public void setDepartmaent(String departmaent) {
		this.departmaent = departmaent;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	

}
