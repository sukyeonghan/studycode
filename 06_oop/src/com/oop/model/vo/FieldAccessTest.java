package com.oop.model.vo;

public class FieldAccessTest {
	
	//멤버변수의 접근테스트
	//[접근제한자] [예약어] 자료형 변수명[=값];
	//생략 가능하나 자료형 변수명은 생략불가능
	

	//선언과 동시에 초기화도 가능!!
	public int publicInt=20;;
	protected char protectedChar='A';
	String defaultString="오호~";
	private double privateDouble=180.5; //default : 0.0
	//이거 있다고 지금 쓸 수 있는 것이 아님
	//new로 할당해서 주소값 생성해야 함. ->>main으로 가기
	
//	private int publicInt;  //default : 0
//	private char protectedChar; //default : 
//	private String defaultString; //default : null
//	private로 다 바꾸면 같은 클래스 빼고는 다 에러남.
	
	
	
//	캡슐화하는 이유
//	public int age;
	private int age=180;
//	선언과 동시에 초기화 
	
	//필드의 자료형은 자바에서 사용하는 모든 자료형을 사용할 수 있음
	private int[] intArr=new int[10];
	//private DefaultTest test=new DefaultTest();
	//객체들도 변수로 받을 수 있다
	
	{
		publicInt = 200;
		protectedChar='중';
		defaultString="이거!";
		privateDouble=180.5;
		//private도 해당 클래스 내부여서 접근 가능.
				
	}
	//private는 외부에서 접근이 불가능!
	//변수에 접근해서 데이터를 가져가고, 변수의 값을 수정할 수 있는 메소드를 따로 작성!
	//변수와 1:2로 만들어져야 함. getter(가져가는 것)/setter(데이터 대입)
	//접근제한자 변수자료형(반환형)|| void get변수명(){  } || set변수명(변수자료형 변수명){   }
	
	//getter : 변수값을 가져오는 기능
	public int getAge() { //get+변수명 대문자
		return this.age; //멤버변수 호출
	}
	//setter : 변수에 값을 넣는 기능
	//지우면 수정 불가능. 출력만 가능
	public void setAge(int age) { //매개변수.  fct.setAge(); 괄호 안에 값이 age에 들어감
		if(age>0) {
			this.age=age;
		}
	}
	

}

//객체 : 자신의 속성을 가지고 있고 다른 것과 식별 가능한 것	

//클래스명도 자료형이 된다.
//메소드를 쓸 때도 객체를 생성해야한다.
//new ArrayTest().doubleArray();
//이것도 마찬가지임! 클래스명().메소드명()
//클래스는 기능가지고 있는 클래스/데이터 담을 수 있는 클래스로 나눌 수 있음


//클래스 설계- 객체 생성 방법
//클래스-설계도면 역할
//인스턴스화 : 코드를,변수와 변수의 자료공간을 실질적으로 쓸 수 있게 만든 것.설계도대로 만들었다.

//클래스 3대 특징
//1.캡슐화 :  지정한 데이터만 받을 수 있게 차단. 숨겨놓는 것. 
//특정 메소드를 호출해서 수정하게 함.프라이빗으로 가려놓고 1대1로 메소드 설정.
//ex)나이 음수로 안 받게, 계좌 수정
//2.상속 : 객체 간 관계를 맺어줘서 필드, 메소드를 쓸 수 있게 허용 
//3.다형성 : 자료형이 다른 여러 명 자식객체를 부모객체한테 넣고 이용할 수 있음

//클래스 선언 : [접근제한자][예약어]class 클래스명 {}
//예약어는 상속과 관련되어있어서 지금은 패스
//클래스 중괄호 안에서 변수 선언 =>필드, 멤버 변수
//생성자명()[] ->생성 시 실행되는 것
//메소드(기능)-> 클래스에 부여되는 역할에 따라 설계됨

//public(접근 제한자) class 클래스 이름
//public : 클래스 내 있는 모든 패키지에서 사용가능
//default : 같은 폴더, 패키지 내에서만 가능. 다른 패키지 에서 import해서 쓸 수 없음

//필드 - 멤버변수. 생성해야지만 사용이가능
//필드 - 저장공간=변수
//[접근제한자-public,default,private(우리가 쓰는 거)...][예약어-final,static..]자료형 변수명(-변수 선언)
//접근연산자 -'.'
//직접 접근 : public일 때  -> 주소값.a(-변수명)
//protected는 자식이 됐을 때 직접접근이 가능
//default는 같은 패키지 안에서만 접근 가능
//private는 클래스 {}안에서만 접근 가능