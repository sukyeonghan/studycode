package com.abstracttest.model.vo;

public abstract class IncludeAbstract {

	private int a;
	private int b;
	private int count;
	
	//추상클래스가 포함되어있으면 반드시
	//추상클래스로 선언한다.
	//추상메소드로 선언된 메소드를 자식객체에 강제시킴
	//추상메소드는 선언부만 선언하고 구현부가 없음!
	//접근제한자 abstract 반환형 메소드명 (매개변수);
	
	public abstract double calculator(int a,int b);

	//public abstract String combine(String a,String b);
	//메소드를 추가하면 자식객체에서 이 메소드를 구현해야함!
	//-> 여기서 선언한 추상 메소드는 자식 객체들이 무조건 가지고 있다는 것을 반증함
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}	

}
