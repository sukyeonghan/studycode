package com.override.model.vo;

public class Animal {
	//이름, 종류, 다리 수 
	//action() 메소드 생성 - 나는 동물이다!
	
	private String name;
	private String category;
	private int leg;
	
	public Animal() {
		
	}

	public Animal(String name, String category, int leg) {
		super();
		this.name = name;
		this.category = category;
		this.leg = leg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}
	
	public String action() {
		return "나는 동물이다!";
	}

}
