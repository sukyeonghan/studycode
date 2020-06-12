package com.vari.casting;

public class CastingTest {
	
	public static void main(String[] args) {
		//자동형변환 확인하기
		int age=19;
		double height=180.5;
		
		height=age;
		
		System.out.println(height);
		
		//산술 연산시 자동형변환
		int su=30;
		double weight=3.44;
		System.out.println(su+weight);
		//double로 자동형변환
		//형변환은 변수(저장공간)자체가 변경되는 것이 아니라
		//변수에 있는 값(리터럴)의 자료형을 변경하는 것임
		
		String name;
		char ch='A';
		//name=ch; int sul1=name; 하면 안됨.
		int su1=ch; //이건 가능
		//문자열로는 자동형 변환이 불가능. 변환하려면 기능(메서드)이용.
		//name=String.String.valueOf(ch);
		
		double dnum=28.5;
		//강제 형변환 하기
		//데이터의 손실이 있어도 감안한다.
		System.out.println("원본값 : "+dnum);
		su1=(int)dnum;
		System.out.println("dunm을 넣은 변수 : " +su1);
		//0.5만큼 손실
		
		int chTest=97;
		char ch1=(char)chTest;
		System.out.println(ch1);
		System.out.println((char)chTest);
		
		//작은 자료형으로 형변환하면 데이터 손실이 발생함.
		//표현할 수 있는 범위에 값만 표현하고 나머지는 버림(앞의 자료 손실).
		char t;
		t=290;
		byte b=(byte)t;
		System.out.println(b);
		
		
		
		
		
	}

}


