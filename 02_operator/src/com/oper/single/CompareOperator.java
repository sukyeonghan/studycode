package com.oper.single;

import java.util.Scanner;

public class CompareOperator {
	
	public static void main(String[] args) {
		
		//비교연산 활용하기
		//값에 대한 대소(숫자, 문자 한 개), 동등 비교(숫자, 문자) 가능함
		//비교 연산의 결과는 true/false가 나옴
		//비교 연산은 조건문에 많이 사용함
		
		//1. 동등비교 == (true, flase)
		int su=100;
		int su1=200;
		int su3=100;
		System.out.println(su==su1);
		System.out.println(su==su3);
		double dsu=180.5;
		double dsu1=190.5;
		double dsu2=180.5;
		System.out.println(dsu==dsu1);
		System.out.println(dsu==dsu2);
		char ch='A';
		char ch1='B';
		char ch2='A';
		System.out.println(ch==ch1);
		System.out.println(ch==ch2);
		
		String str="바보";
		String str1="몰라";
		String str2="바보";
		System.out.println(str==str1);
		System.out.println(str==str2); 
		//true 나옴
		//그러나, 문자열은 ==으로 비교하면 안 됨!
		String str3=new String("몰라");
		System.out.println(str1==str2);
		
		Scanner sc=new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name=sc.nextLine();
		System.out.println("str1 : "+str1+" name : "+name);
		System.out.println("==으로 비교 : "+ (str1==name));
		//여기선 false로 나옴
		//new~ 등을 쓰면 참조형 변수로 HEAP 주소값이 저장되어, 이 주소값을 비교하게 됨
		//리터럴(현재 str,str1 등)로 적으면 문자풀에 저장되어 같은 값으로 비교 됨
		//문자열은 객체로 동등비교를 하려면 equals()기능을 이용해야 함
		//문자열 변수명.equals(비교문자열);
		System.out.println("equals로 비교 : "+ str1.equals(str3));
		System.out.println("입력받은 값 비교 : "+str1.equals(name));
		System.out.println("몰라".equals(name));
		System.out.println(name.equals("몰라"));
		//위치 바꿔도 상관없다.
		
		//!= 일치하지 않는 것 비교
		System.out.println(su==su1);
		System.out.println(su!=su1);
		
		//문자열이 다르냐고 물어볼 때는??
		//부정연산 이용
		System.out.println(!str.equals(str1));
		
		//대소비교
		//>,<,>=,<=
		su=20;
		su1=30;
		su3=20;
		System.out.println(su>su1);
		System.out.println(su<su1);
		System.out.println(su>=su3);
		
		//char형은 대소비교가 가능한가?
		//가능함. char 실제값 = 정수/ 65 = A
		ch='A';
		ch1='B';
		System.out.println(ch>ch1);
		System.out.println(++ch);
		//연산되서 B 출력
		System.out.println(ch>'a');
		
		//비교연산의 결과는 boolean형이어서 이렇게도 된다.
		boolean flag=ch<'Z';
		
	}

}
