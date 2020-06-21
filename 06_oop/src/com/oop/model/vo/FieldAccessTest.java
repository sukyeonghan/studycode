package com.oop.model.vo;

public class FieldAccessTest {
	
	//멤버변수의 접근테스트
	//접근제한자 예약어 자료형 변수명[=값];
	//생략 가능하나 자료형 변수명은 생략불가능
	
	////public static String name;
	//static은 하나의 클래스에서만 생성 가능??? 선언되는 것마다 다르게 저장공간이 생성된다는 건가??
	
	public int publicInt=20;;
	protected char protectedChar='A';
	String defaultString="오호~";
//	private int publicInt;  default : 0
//	private char protectedChar; //default : ' '
//	private String defaultString; //default : null
//	로 다 바꾸면 여기 빼고 다 에러남.
	private double privateDouble=180.5; //default : 0.0
	//선언과 동시에 초기화도 가능!!
	//이거 있다고 지금 쓸 수 있는 것이 아님
	//new로 할당해서 주소값 생성해야 함. ->>main으로 가기
	
	//캡슐화할 때 private로 쓴다.
//	public int age;
	private int age=180;
	
	//필드의 자료형은 자바에서 사용하는 모든 자료형을 사용할 수 있음
	private int[] intArr=new int[10];
	//private DefaultTest test=new DefaultTest();
	//객체들도 변수로 받을 수 있다
	
	{
		publicInt = 200;
		protectedChar='중';
		defaultString="이거!";
		privateDouble=180.5;
		//해당 클래스 내부여서 접근 가능.
				
	}
	
	//변수에 접근해서 데이터를 가져가고, 변수의 값을 수정할 수 있는 메소드를 따로 작성
	//변수와 1:2로 만들어져야 함. getter(가져가는 것)/setter(데이터 대입)
	//접근제한자 변수자료형(반환형) ||void get변수명(){  } || set변수명(변수자료형 변수명){   }
	
	//getter : 변수값을 가져오는 기능
	public int getAge() { //get+변수명 대문자
		return this.age; //멤버변수 호출
	}
	//setter : 변수에 값을 넣는 기능
	public void setAge(int age) {
		if(age>0) {
			this.age=age;
		}
	}
	

}
