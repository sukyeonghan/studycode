package com.collection.practice.model.vo;

import java.util.Objects;

public class Employee {
	
	private String name;
	private int age;
	private String job;
	private int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, String job, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", job=" + job + ", salary=" + salary + "]";
	}


	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Employee) {
			Employee em = (Employee)obj;
			if(this.name.equals(em.name) && this.age==em.age) {
				return true;
			}
				
		}
		return false;
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name,age);
	}
	

}
