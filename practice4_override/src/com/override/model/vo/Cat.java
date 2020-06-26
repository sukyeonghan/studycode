package com.override.model.vo;

public class Cat extends Animal{
	public Cat( String name, String category, int leg) {
		super(name,category,leg);
	}
	
	@Override
	public String action() {
		return "야옹 고양이~";
	}
}
