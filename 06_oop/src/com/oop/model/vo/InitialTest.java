package com.oop.model.vo;

public class InitialTest {
	//초기화 블록
	private String name="안녕"; //null
	private int size=180; //0
	private int id;//1부터 순차적으로 1더해서 부여
	//외부에서 수정이 불가능하게!
	
	private static int count;
	//하나씩 증가하게 하려면? static으로 저장공간 살아있게
	//접근 못하게 getter,setter안 만듦. 특정값 내부{ }에서만 접근 가능
	
	//고정값 넣을 때 
	//선언과 동시에도 되고 초기화블록도 되고
	//순서는 선언과 동시에 초기화 먼저 실행 후 초기화블록으로 가서 값이 변경됨
	//->변수에는 하나의 값만 보관할 수 있기 떄문
	
	//초기화 블록을 설정하여 초기값을 변경하기
	{
		//객체를 new연산자로 생성을 할 때마다 실행되는 로직
		this.name+="Rclass";//+=해서 전에 값과 더해보자
		this.size+=100;
		//this.id++; //계속 0에서 1씩만 증가
		this.id=++count;
		//1부터 나오게 전위연산
		System.out.println("초기화 블록 실행");
	}
	
	public int getId() {
		return id; //set안씀.수정 불가능
	}
	
	public void setName(String name ) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSize(int size ) {
		this.size=size;
	}
	public int getSize() {
		return size;
	}

	//static 초기화 블록
	static {
		//위에 썼던 일반 초기화 블록이랑 다름!!
		//프로그램이 런타임 될 때! 딱 한 번만 실행됨!!
		//멤버변수, 멤버메소드의 호출이 불가능
		//this.name="하하"; 안됨. this는 new있어야 함
		//여기선 static변수를초기화
		InitialTest.count=100;
		System.out.println("static초기화 블럭 실행");
		
	}

}
