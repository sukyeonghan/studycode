package com.abstracttest.model.vo;

public class Test extends Food{
	
	public Test() {
		// TODO Auto-generated constructor stub
	}

	//alt+s+c - 부모생성자 호출
	public Test(String kind, String name, String nation, int portion, int calory) {
		super(kind, name, nation, portion, calory);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
