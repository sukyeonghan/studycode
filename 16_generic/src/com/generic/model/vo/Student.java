package com.generic.model.vo;

public class Student {
	
	private String name;
	private int grade;
	private int classRoom;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int grade, int classRoom) {
		super();
		this.name = name;
		this.grade = grade;
		this.classRoom = classRoom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", classRoom=" + classRoom + "]";
	}
	
	

}
