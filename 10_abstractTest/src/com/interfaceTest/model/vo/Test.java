package com.interfaceTest.model.vo;

public class Test implements TestAble{
	private String name;
	private int age;
	
	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Test(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	//TestAble 선언한 모든 메소드 다 구현해야함
	
	@Override
	public void test() {
		System.out.println("구현된 테스트!");
	}

	@Override
	public String getStr(String a) {
		return a+"_ BS";
	}
	
	public void otherMethod() {
		System.out.println("난 달라!");
	}
	public void otheeMethod2() {
		System.out.println("나도 달라");
	}
}
