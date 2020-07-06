package com.interfaceTest.controller;

import com.interfaceTest.model.vo.Test;
import com.interfaceTest.model.vo.TestAble;

public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println(TestAble.age);
		System.out.println(TestAble.name);
		//TestAble.age=20; cannot be assigned 오류
		//TestAble.name="이거는?";
		//인터페이스에서 선언한 것은 상수로 다른 값이 대입이 안됨.
		
		Test t = new Test();
		t.test();
		System.out.println(t.getStr("오늘 수업 거의 끝"));
		
		//인터페이스는 참조형 자료형으로 사용이 가능
		TestAble test;
		test = new Test("유병승",19);
		//필수적인 기능만 보이도록 설정됨.
		//인터페이스가 강제한 메스드만 보임!
		//부모클래스로 넘어가면 부모것만 보이는 것과 비슷한 맥락
		System.out.println(test.getStr("곧 정리시간"));
		//getStr 원래 TestAble건데
		//Test거 실행됨  - 동적바인딩
		((Test)test).getAge(); //원래 안보였던 것 형변환하면 접근할 수 있음
		
		
		
		
	}

}
