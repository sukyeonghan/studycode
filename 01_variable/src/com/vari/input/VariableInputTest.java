package com.vari.input;

public class VariableInputTest {
	
	public static void main(String[] args) {
		//변수 선언하고 값넣기
		
		int age;
		age=27;//변수대입
		double height;
		height=180.5;
		String name;
		name="한수경"; //String type은 ""표시!
		char gender;
		gender='여'; //char type은 ''표시!

		byte bnum;
		bnum=100;
		//bnum=128; 안됨.int범위가 ~127까지만 됨
		
		//long lnum=10000000000; int범위를 넘어섬
		long lnum=1000000000L; //long type은 L표시!(소문자로 하면 숫자1과 혼동되니까)
		
		float fnum=3.14f; //float type은 f표시!
		//선언과 동시에 초기화
		//변수의 값을 처음 대입하는 것 : 초기화
		//지역변수는 반드시 초기화를 하고 사용해야함.
		
		//로컬변수(main 안에서 실행) 안에서 변수명이 종복되면 안된다.
		
		int a=0;double dnum2=0.0;
		char ch=' ';String str="";
		
		System.out.println(a);
		
		//변수에 저장된 데이터(값) 가져오려면 변수명을 이용하면 됨.
		
		System.out.println("안녕하세요!");
		System.out.println(name);
		name="한수경";
		System.out.println(name); //순차적으로 출력됨.
		//변수에 값을 대입. 리터럴이 아닌 변수를 이용할 수 있다.
		String name2=name;
		System.out.println(name2);
		//변수명을 코드에 넣으면 변수에 있는 값을 그 위치로 불러온다.
		//위에서 선언한 name-한수경이 나옴
		
		//상수 활용하기
		//한 번만 저장할 수 있는 저장 공간
		final int NUM_FINAL=19;
		//NUM_FINAL=30; 안됨.
		//이 때 보통 변수명을 대문자로 표기하고 두 개 이상 단어시_사용함.
		
		System.out.println(NUM_FINAL);
		
		
		//문자열 활용하기. 기본 선언 및 대입하기
		String str1="기차";
		String str2=new String("기차");
		System.out.println(str1);
		System.out.println(str2);
		
		str1="기차"+"칙칙폭폭";
		str2=new String("기차"+"칙칙폭폭");
		System.out.println(str1);
		System.out.println(str2);
		str1="기차"+123+45+"칙칙폭폭";
		System.out.println(str1);
		str2=123+45+"기차"+"칙칙폭폭";
		System.out.println(str2);
		str2=""+123+45+"기차"+"칙칙폭폭";//중간 숫자가 문자열 처리 됨.
		System.out.println(str2);
		
		//+연산 응용
		System.out.println("이름 : "+ name+",나이 : "+age+",키 : " + height+ ",성별 : "+ gender);
		
		int aa=100; long bb=10000L;
		float cc=234.567f; double dd=567.12356;
		char ee='A'; String ff="Hello world";
		boolean gg=true;
		
		System.out.println(""+aa+", "+bb+", "+cc+", "+dd+", "+ee+", "+ff+", "+gg+"");

		
	}

}
