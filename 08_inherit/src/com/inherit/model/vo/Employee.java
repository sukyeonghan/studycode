package com.inherit.model.vo;

public class Employee extends Person {
	//이름, 나이, 주소, 전화번호,직책,부서,연봉
	
//	private String name;
//	private int age;
//	private String address;
//	private String phone;
	private String department;
	private String jod;
	private int salary;
	
	public Employee() {
		
	}
	

	public Employee(String name, int age, String address, String phone, 
			String department, String jod, int salary) {
		super();
//		if(name.length()>2) {
//		this.name = name;
//		this.age = age;
//		this.address = address;
//		this.phone = phone;
		this.department = department;
		this.jod = jod;
		this.salary = salary;
		
	}
	

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public String getPhone() {
//		return phone;
//	}
//
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJod() {
		return jod;
	}

	public void setJod(String jod) {
		this.jod = jod;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
