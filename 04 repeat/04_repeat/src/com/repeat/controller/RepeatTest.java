package com.repeat.controller;

import java.util.Scanner;
import java.util.*;
public class RepeatTest {

	public void basicRepeat() {
		//기본 for문 작성하기
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
//		.
//		.	
//		.
		//10분간 쉬었다가.. 해보자고요!! 
		//for문을 이용하면 간단하게 처리할 수 있음
		System.out.println("==== for문으로 출력하기 ====");
		for(int i=0;i<10;i++) {
			System.out.println(i);
			System.out.println("안녕하세요!");
		}
		//1부터 100까지 수를 출력해보세요!
		for(int i=0;i<100;i++) {
		//for(int i=1;i<=100;i++) {
			//System.out.println("i : "+(i+1));
			System.out.println("i : "+i++);
		}
		//100부터 1까지
		int su=100;
		//for(int i=100;i>0;i--) {
		for(int i=0;i<100;i++) {
			//System.out.println(i);
			int sum=0;
			System.out.println(su--);
		}
		//sum+=i;
		//1~100까지 홀수만 출력하자
		System.out.println(su);
		//for(int i=1;i<=100;i+=2) {
		int su2=1;
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
		//1부터 100까지 전체 합을 구하세요
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
		
		//입력받은 수까지 반복하기
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력 : ");
		int count=sc.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("for문은 너무 즐겁고 사랑스러워!");
		}
		
		//정수 세개를 입력받고 그 정수의 합계를 출력하세요
		//합계는 한번만 출력이 되야합니다.
//		System.out.print("정수입력 : ");
//		int su3=sc.nextInt();
//		System.out.print("정수입력 : ");
//		int su4=sc.nextInt();
//		System.out.print("정수입력 : ");
//		int su5=sc.nextInt();
		int sum2=0;
		for(int i=0;i<3;i++) {
			System.out.print("정수입력 : ");
			sum2+=sc.nextInt();
		}
		System.out.println(sum2);
		
		
		//for문의 다른 사용법
		//for(초기식;조건식;증감식){ 로직   }
//		for(;;) {//무한루프
//			System.out.println("=== 메뉴판 ===");
//			System.out.println("1. 캐비어");
//			System.out.println("2. 곱창");
//			System.out.println("3. 송로버섯");
//			System.out.println("0. 프로그램 종료");
//			System.out.print("입력 : ");
//			int choice=sc.nextInt();
//			switch(choice) {
//				case 1 : System.out.println("비싼 캐비어");break;
//				case 2 : System.out.println("곱창은 소주와!!");break;
//				case 3 : System.out.println("송로버섯....??..무식해서.ㅠㅠ");break;
//				case 0 : System.out.println("프로그램을 종료합니다,");return;
//			}
//		}
		//for문에 조건식을 빼면??
		for(int i=0;;i++) {//무한루프
			System.out.println(i);
			if(i==10000) {
				break;
			}
		}
		int a=0;
		for(;a<10;a++) {
			System.out.println(a);
		}
		//조건식만 for문에 넣을 수 있다.
		for(;a<20;) {
			System.out.println(a++);
		}
		//초기식 증감식 여러값을 선언/변경시킬수있다
		for(int i=0,j=10;i<10;i++,j+=20) {
			System.out.println(i+" "+j);
		}
		
		
	}
	//입력할 학생수를 입력받고,
	//학생의 영어, 수학, 국어 점수를 입력받고
	//그 합계와 평균을 구하는 프로그램 만들기
	//유병승 100 100 100 합계 300 평균 100
	//조  현  90  90  90  합계 270 평균 90
	//각 과목의 변수는 한개.
	//출력내용에 대한 변수 한개
	
	public void studentGrade() {
		Scanner sc=new Scanner(System.in);
		System.out.println("===== 학생성적 관리 프로그램 v01 =====");
		System.out.print("입력할 학생수 : ");
		int studentSu=sc.nextInt();
		sc.nextLine();
		String result="";
		for(int i=0;i<studentSu;i++) {
			System.out.print("이름 : ");
			String name=sc.nextLine();
			System.out.print("국어 : ");
			int kor=sc.nextInt();
			System.out.print("수학 : ");
			int math=sc.nextInt();
			System.out.print("영어 : ");
			int eng=sc.nextInt();
			sc.nextLine();
			//System.out.println(
			System.out.println(name+" "+kor+" "+eng+" "+math
					+" 합계 : "+(kor+eng+math)
					+" 평균 : "+((kor+eng+math)/3.0)+"\n");
			result+=name+" "+kor+" "+eng+" "+math
					+" 합계 : "+(kor+eng+math)
					+" 평균 : "+((kor+eng+math)/3.0)+"\n";
		}
		System.out.println(result);
	}
	
	
	public void whileTest() {
		//이제 곧 오늘 수업끝이에요!
		int i=0;//초기식
		while(i<3) {//조건식
			System.out.println("이제 곧 수업 끝!");
			//증감식
			i++;
		}
		//while문을 이용하여 1부터 30까지 출력하기
		i=0;
		while(i<30) {
			System.out.println(i+1);
			i++;
		}
		
		//사용자가 입력하는 3개 문자열을 한번에 출력하는 프로그램작성
		Scanner sc=new Scanner(System.in);
		int j=0;
		String msg="";
		while(j<3) {
			System.out.print("문자입력 : ");
			//msg=msg+sc.nextLine();
			msg+=sc.nextLine();
			//System.out.println(msg);
			//증감식
			j++;
		}
		System.out.println(msg);
	
		//do ~ while문!
		//do{ 수행 로직 }while(조건식);
		do {
			System.out.println("do while문!!");
			j++;
		}while(false);
		
		while(j<3) {
			System.out.println("while문!!");
		}
		
//		while(true) {
//			System.out.println("여기까지!! 정리하세요!!");
//		}
		Set<Integer> test=new HashSet();
		test.add(2);
		test.add(3);
		test.add(1);
		Iterator iterator=test.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}
	
}








