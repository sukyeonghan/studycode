package com.oop.model.vo;

public class Student {
	//클래스 범위 안에 if문 불가능 - 메소드 안에서만 가능!
	//클래스 안엔 멤버변수, 생성자, 메소드 포함
	
	//student 객체를 만들고 이름,학년,반,번호,키,몸무게 
	//기본으로 자신의 정보로 세팅하고
	//studentUpdate매소드를 만들어 입력받은 값으로 수정한 뒤 출력하기
	private String name="한수경";
	private int grade = 3;
	private int rclass = 2;
	private int number = 20;
	private double height = 160;
	private double weight = 45;
	
	public Student() {}
	
	public Student(String name, int grade, int rclass,
			int number, double height, double weight) {
		this.name=name;
		this.grade=grade;
		this.rclass=rclass;
		this.number=number;
		this.height=height;
		this.weight=weight;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public int getGrade() {
		return grade;
	}
	public void setRclass(int rclass) {
		this.rclass=rclass;
	}
	public int getRclass() {
		return rclass;
	}
	public void setNumber(int number) {
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public double getWeight() {
		return weight;
	}
	
	
}
