package com.override.model.vo;

//vo는 ValueObject / DTO DataTransfer Object

public class Animal {

	private String category;
	private String name;
	private char gender;
	private String diet;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Animal(String category, String name, char gender, String diet) {
		super();
		this.category = category;
		this.name = name;
		this.gender = gender;
		this.diet = diet;
	}



	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}
	
	public String bark() {
		return "뭔줄 알고 짖어!"; //그냥 이거 받으면 다 같은 값이 떠버림. 오버라이딩 필요
	}
	
	//메소드의 final예약어는 Override를 불허한다
//	public final String bark() {
//		return "뭔줄 알고 짖어!"; //그냥 이거 받으면 다 같은 값이 떠버림. 오버라이딩 필요
//	}
	
	protected String info() {
		return category+" "+name+" "+gender+" "+diet;
	}
	
	public double calculator(int a, int b) {
		return a+b;
	}
}

//다형성
//상속 관계와 관련
//객체 간 상속관계에 있을 때 부모의 타입이 여러 자식 타입의 객체를 담을 수 있음
//부모변수에 자식을 대입할 수 있다
