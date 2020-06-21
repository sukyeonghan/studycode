package com.oop.main;

import com.oop.model.vo.AccessTest;
import com.oop.model.vo.FieldAccessTest;
import com.oop.model.vo.FinalTest;
//import com.oop.model.vo.DefaultTest; //not visible -> 접근제한자에 의해서 접근이 제한되었을 때 나오는 에러
//import com.oop.model.vo.ABCTest; //be resolved -> 없는 객체
//경로를 고정해 놓는 것임. 사실 한 번 쓸 거면 굳이 임포트 안해도 되지만 하는게 알아보기도 용이함.
import com.oop.model.vo.StaticVariableTest;

public class Main {

	public static void main(String[] args) {
		
		//객체 접근 가능 여부 확인하기 -> 생성가능한가 확인해보기
		new AccessTest(); //객체 생성 구문. heap 영역에 엑세스테스트 객체가 생김. 주소값이 생김.
		//new com.oop.model.vo.AccessTest();
		//new DefaultTest(); //접근제한자가 default인 클래스 생성
		
		//필드 접근테스트
		FieldAccessTest fct = new FieldAccessTest();
		FieldAccessTest fct2 = new FieldAccessTest();
		FieldAccessTest fct3 = new FieldAccessTest();
		fct.publicInt=100; //public은 다른 패키지에서 직접 접근이 가능함.
		//fct.protectedChar='남';->자손객체, 같은패키지, 같은 클래스일 때만 접근 가능
		//fct.defaultString="이건접근?"; -> 같은 패키기, 같은 클래스
		//fct.privateDouble=180.5; -> 같은 클래스
		
		//클래스명은 자료형이 될 수 있다. 자료형 fct=new 클래스 이름. 객체를 저장하는 변수가 됨.
		//메인 영역 안에서 fct 저장공간 생김
		//fct. 하면 주소값으로 접근해라(heap에 접근) - fct.publicInt 하면 거기로 접근
		//heap영역에 publicInt,protectedChar...저장공간 생김
		//FieldAccessTest를 객체화 -> heap공간에 저장공간을 확보 ->확보한 공간의 주소를 반환
		//ctrl+shift+o ->import자동생성
		
		//캡슐화하는 이유
//		fct.age=19; //음수가 있으면 될까??
//		System.out.println(fct.age);
//		fct.age=-19;
//		System.out.println(fct.age);
		
//		fct.setAge(19); //메소드 호출 -> 메소드 실행   fct에 있는 age변수에 19 대입
//		System.out.println(fct.getAge()); //fct에 있는 age변수 값 가져오기  fct.age랑 똑같은 의미임
		fct.setAge(-19); //위 19안쓰면 디폴트값인 0(힙영역에 생겼으니까 기본값)만 출력됨.
		System.out.println(fct.getAge());
		
//		public void setAge(int age) {
//			this.age=age;
//		} ->이걸 실행했을 때와 같다. 19와 -19가 age에 들어감. 그걸 호출하는 것
//		여기에 조건을 걸면 제한 걸 수 있다!
//		수정할 수 없다고 만들거면 set 안쓰면 됨. 주민번호 같은 것
		
		//static변수 , 클래스 변수는
//		System.out.println(StaticVariableTest.name);
//		StaticVariableTest.name="유병승"; //대입도 가능
//		System.out.println(StaticVariableTest.name);
		
		//이것도 getter,setter해서 해야 함
		System.out.println(StaticVariableTest.getName());
		StaticVariableTest.setName("유병승");
		System.out.println(StaticVariableTest.getName());
		
		
		StaticVariableTest svt=new StaticVariableTest();
		StaticVariableTest svt2=new StaticVariableTest();
		StaticVariableTest svt3=new StaticVariableTest();
		
		svt.setName("static");
		System.out.println(svt.getName());
		System.out.println(svt2.getName()); //같은 값을 띈다
		svt2.setName("svt2변경!");
		System.out.println(svt.getName()); //저장공간은 하나
		System.out.println(svt2.getName());
		System.out.println(StaticVariableTest.getName());
		
		svt.setSu(100);
		System.out.println(svt.getSu());//100
		System.out.println(svt2.getSu());//0 //얘는 별도 공간.주소 변수 각각
		
		
		
		//상수 이용하기
		FinalTest ft = new FinalTest();
		System.out.println(ft.ID);
		//ft.ID=200;
	}
}
