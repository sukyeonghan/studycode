package com.first.test;

public class Test {
	
	private String name="안녕"; //명시적 초기값
	
	{ 
		this.name="Rclass";
		System.out.println("초기화 블록 실행");
	} //초기화블록
	
	
	public Test() {
		// TODO Auto-generated constructor stub
	} //기본생성자 - JVM이 준비한 기본값으로 초기화 
	
	public void className(String name) {
		this.name=name; //매개변수 있는 생성자	- 매개변수가 전달받은 초기값으로 초기화
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	

	
	
}
