package com.oop.main;

import com.oop.model.vo.AccessTest;
import com.oop.model.vo.InitialTest;

import com.oop.model.vo.FieldAccessTest;
import com.oop.model.vo.FinalTest;
//import com.oop.model.vo.DefaultTest; 
	//not visible -> 접근제한자에 의해서 접근이 제한되었을 때 나오는 에러
//import com.oop.model.vo.ABCTest; 
	//be resolved -> 없는 객체
	//경로를 고정해 놓는 것임. 사실 한 번 쓸 거면 굳이 임포트 안해도 되지만 하는게 알아보기도 용이함.
import com.oop.model.vo.StaticVariableTest;


public class Main {

	public static void main(String[] args) {
		
		//객체 접근 가능 여부 확인하기 -> 생성가능한가 확인해보기
		new AccessTest(); //객체 생성 구문. heap 영역에 엑세스테스트 객체가 생김. 주소값이 생김.
		//new com.oop.model.vo.AccessTest();
		//import는 경로를 지정해 놓는 것. 한 번만 쓸거면 이렇게 쓸 수도 있음.
		//여러 번 쓸 때 불편하고 가독성도 떨어져서 잘 안쓴다
		//new DefaultTest(); //접근제한자가 default인 클래스 생성
		
		//필드 접근테스트(*FieldAccessTest)
		new FieldAccessTest();
		//FieldAccessTest를 객체화 -> heap공간에 저장공간을 확보 ->확보한 공간의 주소를 반환
		FieldAccessTest fct = new FieldAccessTest();
//		FieldAccessTest fct2 = new FieldAccessTest();
//		FieldAccessTest fct3 = new FieldAccessTest();
		//클래스명은 자료형이 될 수 있다. fct는 객체를 저장하는 변수가 됨.
		//메인 영역 안에서 fct 저장공간 생김
		//fct. 하면 주소값으로 접근해라(heap에 접근) 
		//fct.publicInt 하면 heap영역의 publicInt 필드값에 접근
		
		fct.publicInt=100; //public은 다른 패키지에서 직접 접근이 가능함.
		//fct.protectedChar='남';->자손객체, 같은패키지, 같은 클래스일 때만 접근 가능
		//fct.defaultString="이건접근?"; -> 같은 패키지, 같은 클래스
		//fct.privateDouble=180.5; -> 같은 클래스
		
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
//		FieldAccessTest에 있는 setAge {  }안을  실행시키는 메소드
		
//		public void setAge(int age) {
//			this.age=age;
//		} ->이걸 실행했을 때와 같다. 19와 -19가 age에 들어감. 그걸 호출하는 것.
//		여기에 조건을 걸면 제한 걸 수 있다!

		
		//static변수 , 클래스 변수는
//		System.out.println(StaticVariableTest.name);
//		StaticVariableTest.name="유병승"; //대입도 가능
//		System.out.println(StaticVariableTest.name);
		
		//private으로 선언되어있을 때 클래스변수도 getter,setter해서 해야 함
		System.out.println(StaticVariableTest.getName());
		StaticVariableTest.setName("유병승");
		System.out.println(StaticVariableTest.getName());
		
		
		StaticVariableTest svt=new StaticVariableTest();
		StaticVariableTest svt2=new StaticVariableTest();
		StaticVariableTest svt3=new StaticVariableTest();
		
		//static변수
		svt.setName("static");
		System.out.println(svt.getName());
		System.out.println(svt2.getName()); //같은 값이 출력됨
		svt2.setName("svt2변경!");
		System.out.println(svt.getName()); 
		System.out.println(svt2.getName());
		System.out.println(StaticVariableTest.getName());
		//하나의 같은 저장공간을 참조하니까 다 같은 값이 출력
		
		//매개변수
		svt.setSu(100);
		System.out.println(svt.getSu());//100
		System.out.println(svt2.getSu());//0 //얘는 별도 공간.주소 변수 각각
		
		
		
		//final 상수 이용하기
		FinalTest ft = new FinalTest();
		System.out.println(ft.ID);
		//ft.ID=200; 수정할 수 없음
		
		//초기화 블록 설정하기
		System.out.println("== 초기화 블록 ==");
		InitialTest it = new InitialTest();
		System.out.println("it id :"+it.getId());
		System.out.println(it.getName());
		System.out.println(it.getSize());
		
		InitialTest it2 = new InitialTest();
		System.out.println("it2 id :"+it2.getId());
		//new하는 순간 새로 만드니까 다시 0부터 시작해서 값이 1이 나옴
		System.out.println(it2.getName());
		System.out.println(it2.getSize());
		//같은 값이 나오지만 다른 객체다
		//주소도 다르고 다른 저장공간! 수정시 연동 안됨
		//객체를 만들 때 마다 반드시 한 번씩 실행
		
		for(int i=0; i<10; i++) {
			System.out.println("for문 id : "+new InitialTest().getId());
		} //1만 10개 나옴! 각각 저장공간이 생기기 때문에
	}
}
