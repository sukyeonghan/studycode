package com.condition.funtion;

import java.util.Scanner;

public class SwitchTest {
	
	public void basicSwitch() {
		//switch문 사용하기
		//switch(변수) { case 값 : 처리 로직 break; case 값 : 처리로직; ..... )
		//정해진 범위, 특정한 값이 정해져 있을 때, 메뉴문 때 사용
		//동등비교만 됨
		//로직에 따라서 if문과 switch 중 선택해서 쓰기
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 연령은(10대,20대,30대?)");
		int choice = sc.nextInt();
		switch(choice) {
		case 10 : System.out.println("혈기왕성한 10대!"); break; 
			//리터럴로 적어준다-자료형을 맞춰준다  
		case 20 : System.out.println("멋진 20대!"); break;
		case 30 : System.out.println("꿈을 이루는 30대"); break;
		}
		//프로그램 메뉴 만들기
		System.out.println("===== 프로그램 v0.1 =====");
		System.out.println("가. 메인화면");
		System.out.println("나. 회원가입");
		System.out.println("다. 로그인");
		System.out.print("입력 : ");
		char cho=sc.next().charAt(0);
		switch (cho) {
			case '가' : System.out.println("메인화면으로 이동...."); break;
			case '나' : System.out.println("==== 회원가입 화면 ====");
					sc.hasNextLine();
					System.out.println("id :");
					String id=sc.nextLine();
					System.out.println("password :");
					String password=sc.nextLine(); break;
			case '다' : System.out.println("==== 로그인 ====");
					sc.nextLine();
					System.out.print("id :");
					String id1=sc.nextLine();
					System.out.println("pw :");
					String pw1=sc.nextLine(); 
					if(id1.equals("admin")&&pw1.equals("1234")) {
					 System.out.println("로그인 성공");
					} else {
					 System.out.println("로그인 실패");
					}
					break;
					}
					
		
		//switch문은 문자열도 가능함
		System.out.println("좋아하는 과일 선택");
		sc.nextLine();
		String fruit = sc.nextLine();
		switch(fruit) {
		case "수박" : System.out.println("시원한 수박 쩝쩝"); break;
		case "용과" : System.out.println("안 먹어 봄"); break;
		case "두리안" : System.out.println("이거 진짜???"); break;
		case "복숭아" : System.out.println("달콤한 복숭아!!"); break;
		default : System.out.println("해당하는 과일이 없습니다!");
			//default는 조건 없음. 해당 안되면 이거 출력
			//break 없으면 밑에 것도 다 출력해버림 
			//마지막은 break 안써도 됨
		}

		// switch문으로 월 31일,30일,28일
		// 각 월에 일자를 출력하는 로직 구성하기
		
		System.out.print("몇 월?(숫자) :");
		int month = sc.nextInt();
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31일"); break;
		case 4 : case 6 : case 9 : case 11 :
			System.out.println("30일"); break;
		case 2 : System.out.println("29일"); break;
		default : System.out.println("없는 달입니다!");
		
		}
		
	}
}