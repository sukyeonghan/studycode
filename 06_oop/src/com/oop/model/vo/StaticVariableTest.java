package com.oop.model.vo;

public class StaticVariableTest {
	//멤버변수에 static예약어를 사용하면
	//static변수, 즉 클래스변수로 활용이 됨
	//public static String name; //클래스 변수
	private static String name;
	//멤버변수 추가하기 - 그럼 지금 클래스변수, 멤버변수 둘 다 있음
	private int su;
	
	public void setSu(int su) {
		this.su=su;
	}
	public int getSu() {
		return this.su;
	}
	
	
	//클래스변수와 멤버변수의 차이
	//클래스변수는 프로그램 시작과 동시에 static영역 메모리공간에 할당(공간 확보)됨
	//		변수접근 - 클래스명.변수명
	//멤버변수는는 클래스가 new연산자를 통해 객체화(생성) 됐을 때 할당됨-이 때 this 사용 가능.
	
	//static 변수에 접근하기 위한 getter/setter
	//static으로 받으려면 이렇게 바꿔줘야함
	public static String getName() {
		return StaticVariableTest.name;
	}
	public static void setName(String name) {
		StaticVariableTest.name=name;
		//new 하기 전에 벌써 생성됨..
		//this는 new할 때마다 생기는 객체의 주소값을 나타냄. 자기 자신을 참조하고 싶을 때 쓰는 예약어		
	}
//	public void setName(String name) {
//		this.name=name; //멤버메소드...
	// 이것도 사실 StaticVariableTest.name=name; 이렇게 써야함..
//	}
	
	//static 변수는 공용으로 쓸 때(값을 바꾸면 다같이 바뀜..), 멤버변수는 각각 만들 때(따로따로 공간이 생성)
}
