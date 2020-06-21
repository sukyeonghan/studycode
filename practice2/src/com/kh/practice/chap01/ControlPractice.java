package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		// 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 "00메뉴입니다"를.
		//종료 번호를 누르면 "프로그램이 종료됩니다"를 출력하세요
		//1. 입력
		//2. 수정
		//3. 조회
		//4. 삭제
		//7. 종료
		//메뉴 번호를 입력하세요 : 
		//조회 메뉴입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭게");
		System.out.println("7. 종료");

		System.out.print("메뉴 번호를 입력하세요 :");
		int su1 = sc.nextInt(); 
		switch (su1) {
		case 1: System.out.println("입력 메뉴입니다."); break;
		case 2: System.out.println("수정 메뉴입니다."); break;
		case 3: System.out.println("조회 메뉴입니다."); break;
		case 4: System.out.println("삭제 메뉴입니다."); break;
		case 7: System.out.println("프로그램이 종료됩니다."); 
		}
		
	}
		
	public void practice2() {
		//입력 받은 정수가 양수이면서 짝수일 때만 "짝수다"를 출력하고
		//짝수가 아니면 "홀수다"를 출력하세요
		//양수가 아니면 "양수만 입력해주세요."를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 :");
		int su2 = sc.nextInt();
		if (su2>0&&su2%2==0) { 
			System.out.println("짝수다");
		} else if (su2%2==1) {
			System.out.println("홀수다");
		} else {
			System.out.println("양수만 입력해주세요");
		}
			
	}

	public void practice3() {
		//국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계, 평군을 계산하고
		//합계와 평균을 이용하여 합격/불합격을 처리하는 기능을 구현하기
		//합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우
		//합격했을 경우 과목 별 점수화 합계, 평균,"축하합니다, 합격입니다!"를 출력하고
		//불합격인 경우에는 "불합격입니다."를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int su3 = sc.nextInt();
		System.out.print("영어 점수 : ");
		int su4 = sc.nextInt();
		System.out.print("수학 점수 : ");
		int su5 = sc.nextInt();
		int result1 = su3+su4+su5;
		double result2 = (su3+su4+su5)/3.0;
		if (su3>=40&&su4>=40&&su5>=40&&result2>=60) {
			System.out.println("국어 :" + su3);
			System.out.println("영어 :" + su4);
			System.out.println("수학 :" + su5);
			System.out.println("합계 :" + result1);
			System.out.println("평균 :" + result2);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		//if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch 문으로 바꾸기
		//예제1
		//1~12 사이의 정수 입력 : 8
		//8월은 여름입니다.
		//예제2
		//1~12 사이의 정수 입력 : 
		//99월은 잘못 입력된 달입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 :");
		int su6 = sc.nextInt();
		switch (su6) {
		case 3: case 4: case 5:
			System.out.println(su6 + "월은 봄입니다."); break;
		case 6: case 7: case 8:
			System.out.println(su6 + "월은 여름입니다."); break;
		case 9: case 10: case 11:
			System.out.println(su6 + "월은 가을입니다."); break;
		case 12: case 1: case 2:
			System.out.println(su6 + "월은 겨울입니다."); break;
		default : 
			System.out.println(su6 + "월은 잘못 입력된 달입니다.");
		}
		
	}
	
	public void practice5() {
		//아이디, 비밀번호를 정해두고 로그인 기능 작성하기
		//로그인 성공 시 "로그인 성공"
		//아이디가 틀렸을 경우 "아이디가 틀렸습니다."
		//비밀번호가 틀렸을 경우 "비밀번호가 틀렸습니다." 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 :");
		String id = sc.next();
		System.out.print("비밀번호 :");
		String pw = sc.next();
		if (id.equals("myId")) {
			if (pw.equals("myPassword12")) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("비밀번호가 틀렸습니다");
		}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
		
	}
	
	public void practice6() {
		//사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하기
		//단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능학
		//회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능
		//비회원은 게시글 조회만 가능함
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String str1 = sc.nextLine();
		switch (str1) {
		case "관리자": {
			System.out.println("회원관리, 게시글 관리, 게시글 작성,댓글 잣성, 게시글 조회"); break;
		} case "회원":{
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성"); break;
		} case "비회원":{
			System.out.println("게시글 조회"); 
		}
		
		}
	}
	
		public void practice7() {
			//키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
			//저체중/정상체중/과체중/비만을 출력하기
			//BMI = 몸무게/(키(m)*키(m))
			//BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
			//BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
			//BMI가 30이상일 경우 고도 비만
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("키(m)를 입력해 주세요 :");
			double m = sc.nextDouble();
			System.out.print("몸무게(kg)를 입력해 주세요 :");
			double kg = sc.nextDouble();
			double bmi = kg / ((m*m));
			System.out.println("BMI지수 : " + bmi);
			if (18.5>bmi) {
				System.out.println("저체중");
			} else if (23>bmi) {
				System.out.println("정상체중");
			} else if (25>bmi) {
				System.out.println("과체중");
			} else if (30>bmi) {
				System.out.println("비만");
			} else if (30>=bmi) {
					System.out.println("고도비만");
			
		}		
	}
		
		public void practice8() {
			//두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하기
			//단, 두개 의 정수 모두 양수일 때만 작동하여
			//없는 연산 기호를 입력했을 시 "잘못 입력하셨습니다. 프로그램을 종료합니다." 출력하기
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("피연산자1 입력 :");
			int su8 = sc.nextInt();
			System.out.print("피연산자2 입력 :");
			int su9 = sc.nextInt();
			System.out.print("연산자를 입력(+,-,*,/,%) :");
			char str8 = sc.next().charAt(0);
			if (su8>0 && su9 > 0) {
				if (str8 == '+') {
				System.out.println(su8 + "" + str8 + su9 + "=" + (su8+su9));
			}  if (str8 == '-') {
				System.out.println(su8 + "" + str8 + su9 + "=" + (su8-su9));
			} if (str8 == '*') {
				System.out.println(su8 + "" + str8 + su9 + "=" + su8*su9);
			} if (str8 == '/') {
				System.out.printf("%d %s %d = %.6f",su8,str8, su9, (float)su8/su9);
			} if (str8 == '%') {
				System.out.println(su8 + "" + str8 + su9 + "=" + su8%su9);
			} 
			
		} else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		}
		
		public void practice9() {
			//중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하기
			//평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
			//이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값을 계산하기
			//70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30%이상 결석 시 Fail 출력하기
			Scanner sc = new Scanner(System.in);
			
			System.out.print("중간 고사 점수 :");
			double mi1 = sc.nextDouble()*0.2;
			System.out.print("기말 고사 점수 :");
			double fi1 = sc.nextInt()*0.3;
			System.out.print("과제 점수 :");
			double hw1 = sc.nextInt()*0.3;
			System.out.print("출석 회수 :");
			double me1 = sc.nextDouble();
			System.out.println("=============== 결과 ===============");
			
			if(me1>14) { 
				System.out.println("중간 고사 점수(20) :" + mi1);
				System.out.println("기말 고사 점수(30) :" + fi1);
				System.out.println("과제 점수(30) :" + hw1);
				System.out.println("출석 점수(20) :" + me1);
				double result = mi1 + fi1 + hw1 + me1;
				System.out.println("총점 :"+ result);
				if(result<70) {
					System.out.println("Fail [점수 미달]");
				} else {
					System.out.println("PASS");
				}
			} else {
				System.out.println("Fail [출석 회수 부족 ("+(int)me1+"/20)]");
			
		}
	
		}
		
		public void practice10() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("실행할 기능을 선택하세요.");
			System.out.println("1. 메뉴 출력");
			System.out.println("2. 짝수/홀수");
			System.out.println("3. 합격/불합격");
			System.out.println("4. 계절");
			System.out.println("5. 로그인");
			System.out.println("6. 권한 확인");
			System.out.println("7. BMI");
			System.out.println("8. 계산기");
			System.out.println("9. P/F");
			
			System.out.print("선택 :");
			int a = sc.nextInt();
			switch(a) {
			case 1: practice1();  break;
			case 2: practice2();  break;
			case 3: practice3();  break;
			case 4: practice4();  break;
			case 5: practice5();  break;
			case 6: practice6();  break;
			case 7: practice7();  break;
			case 8: practice8();  break;
			case 9: practice9();  
			} //같은 클래스 안에 있으므로 practice1();처럼 메소드 이름 쓰면 실행함
		}
}
