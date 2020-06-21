package com.oop.model.vo;

public class FinalTest {
	//멤버변수 final 사용하기
	//final 상수. 한 번 값을 대입하고 변경할 수 없는 변수.
	//생성되서 힙영역에 나오기 전에 무조건 초기화해줘야 함!
	
	//1.선언과 동시에 초기화
	public final int ID; //대문자로 씀.
	public static final int ID2;
	//private으로 해야하는데 public으로 설명함
	
	{//2. 초기화 블럭
		//ID=200;
	}
	
	//static 초기화 블럭으로 초기화
	static {
		ID2=200;
	}

	//3.생성자로 초기화
	public FinalTest() {
		ID=300;
		//ID2=200;
		//static은 이렇게 하면 에러남 ->선언과 동시에 초기화 또는 초기화블럭 사용
	}
}
