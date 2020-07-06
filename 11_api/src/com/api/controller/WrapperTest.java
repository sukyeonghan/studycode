package com.api.controller;

public class WrapperTest {
	
	public static void main(String[] args) {
		//Wrapper 클래스 활용하기
		//Wrapper 클래스는 자동으로 형변환하여 기본자료형으로 변경되고
		//기본자료형도 필요에 따라 자동으로 Wrapper클래스로 변경됨
		int age = 19;
		Integer ageW = age; //오토박싱
		System.out.println(ageW);
		int su = ageW; //기본형 int는 원래 상속관계 될 수 없음
		printTest(su);
		
		double height = 180.5;
		Double dheight = height;
		System.out.println(dheight);
		printTest(height); //double을 integer로 바꿀 수 없음
		
		//wrapper클래스에는 유용한 메소드도 함께 가지고 있음
		//숫자형식의 문자값을 숫자형으로 변경하는 것      웹에서 문자열로 변환되어 오기때문에 많이씀!!
		//wrapper클래스명.parsewrapper클래스명(변경할문자);
		String test="2020";
		int year = Integer.parseInt(test);//문자열을 int로 형변환
		System.out.println(year); //숫자 2020으로 출력
		test="65.5";
		double weight = Double.parseDouble(test);
		System.out.println(weight);
		
		test="백팔십"; //이건 에러남
		
//		Integer.valueOf(); 얘도 비슷. 안됨
//		int a = Integer.valueOf(test);
//		System.out.println(a);
		
		//다른 자료형을 문자형으로 변경하려면?
		//String.valueOf()
		test = String.valueOf(age);
		System.out.println(test);
		test = String.valueOf(height);
		System.out.println(test);
		
	}
	
	public static void printTest(Object obj) { //상속관계 다형성 특징때문에 객체들이 들어갈 수 있음
		System.out.println(obj instanceof Integer);
	}

}
