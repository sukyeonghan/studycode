package com.override.model.vo;

public class Animal {
	//�̸�, ����, �ٸ� �� 
	//action() �޼ҵ� ���� - ���� �����̴�!
	
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
		return "���� �����̴�!";
	}

}