package com.oop.model.vo;

public class Member {
	
	private String name;
	private String id;
	private String password;
	private int age;
	
	public Member () {
		
	}
	
	public Member(String name, String id, String passwoerd, int age) {
		this.name=name;
		this.id=id;
		this.password=password;
		this.age=age;
	}
	
	public Member(String name, String id) {
		this(name, id," ",0);
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String id() {
		return id;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return password;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	

}
