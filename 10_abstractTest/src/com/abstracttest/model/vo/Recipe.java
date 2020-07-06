package com.abstracttest.model.vo;

public class Recipe extends Food{
	
	public Recipe() {
		// TODO Auto-generated constructor stub
	}

	public Recipe(String kind, String name, String nation, int portion, int calory) {
		super(kind, name, nation, portion, calory);
		// TODO Auto-generated constructor stub
	}

	
	public void cooking() {
		System.out.println("요리중...지지고 볶고...");
	}
	

}
