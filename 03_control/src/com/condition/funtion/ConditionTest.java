package com.condition.funtion;

import java.util.Scanner;

public class ConditionTest {
	
	Scanner sc = new Scanner(System.in);
	//sc 명칭임. 명칭 바꿀 수 있음.
	
	public void basicTest() {
		//기본 if문 사용하기
		//if(조건식(결과 : true/false)) {if문에 해당하는 지역}
		//일반적인 조건문 세울 때
		//(조건식이 true가 되면 {} 부분을 실행, 아니면 if문을 무시함
		
		//입력받은 값이 양수면 "양수입니다." 출력하기
		Scanner sc = new Scanner(System.in);
		//sc 명칭임. 명칭 바꿀 수 있음.
		System.out.print("정수입력 :");
		int su = sc.nextInt();
		//조건에 따라 양수입니다 출력을 할지말지 결정할 때 if문을 사용
		if (su>0) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("음수입니다.");
		}

		//티켓번호를 입력받고 티켓번호가 777이면 인증되었습니다. 입장하세요 문구 출력
		System.out.print("티켓 번호 :");
		int ticket1 = sc.nextInt();
		int count = 0;
		if (ticket1==777) {
			System.out.println("인증되었습니다.");
			System.out.println("입장하세요.");
			//중괄호 안에서 모든 연산자, 변수 선언/사용이 다 가능함
			count++;
			int su1 = 100;
			int su2 = 200;
			int result = su1+su2;
			System.out.println(result);
			
		}
		//if(ticket1 != 777) {
		else {
			System.out.println("인증실패되었습니다.");
			System.out.println("들어갈 수 없습니다.");
		}
		//if만 쓸 때 false면 무시
		//if~else 둘 중 무조건 실행함
		
		//System.out.println(su1+" "+su2+" "+result);
		//if 문 안에 선언된 변수들은 내부에서만 가능.
		//더 작은 범위에서 선언한 것은 더 큰 범위에서 접근할 수 없다
		System.out.println("입장 수 : "+count);
		
		//if~else문에서 else만 사용할 수 있을까?
		//안 됨. else는 조건에 대한 반전. if와 한 묶음.
		boolean falg = true;
		if(falg) {
			
		}
		else {
			
		}
		
		//홀수면 홀수, 짝수면 짝수 출력하는 프로그램 작성하기
		System.out.print("정수 입력 :");
		int su3=sc.nextInt();
		if (su3%2==1) {
			System.out.println("홀수"); //홀수면 이 먼저 나옴.
		}
		else { System.out.println("짝수"); 
		}
		
	}//메소드 기능

	public void testA() {
		Scanner sc = new Scanner(System.in);
		
		//국어, 영어, 수학 점수를 입력받아 합계, 평균을 계산하고
		//합계가 250점 이상이면 "우수생입니다." 출력
		System.out.print("국어 :");
		int su4 = sc.nextInt();
		System.out.print("영어 :");
		int su5 = sc.nextInt();
		System.out.print("수학 :");
		int su6 = sc.nextInt();
		int result1 = su4+su5+su6;
		System.out.println("합계 :"+(result1));
		System.out.println("평균 :"+(result1)/3);
		if (result1>=250) {
			System.out.println("우수생입니다.");
		}
	
	}
	
	public void testB()	{	
		//A,B,C연봉을 입력받고 연봉이 5000이상이면
		//"00은 고액연봉자입니다." 출력 
		System.out.print("A사원 연봉 :");
		int su7 = sc.nextInt();
		System.out.print("B사원 연봉 :");
		int su8 = sc.nextInt();
		System.out.print("C사원 연봉 :");
		int su9 = sc.nextInt();
		if (su7>=5000) {
			System.out.println("A사원은 고액연봉자입니다.");
		}
		if (su8>=5000) {
			System.out.println("B사원은 고액연봉자입니다.");
		}
		if (su9>=5000) {
			System.out.println("C사원은 고액연봉자입니다.");
		}
		
	}
	
	public void testC() {
	//국어,영어,수학 점수를 정수형으로 입력받아 
	//총점과 평균을 가지고 합격여부를 처리.
	//3과목 점수가 각각 40점 이상이면서 평균이 60점 이상이면 합격
	//아니면 불합격 출력하기
		System.out.print("국어 :");
		int su10 = sc.nextInt(); 
		System.out.print("영어 :");
		int su11 = sc.nextInt(); 
		System.out.print("수학 :");
		int su12 = sc.nextInt(); 
		double result3 = (su10+su11+su12)/3.0;
		//평균은 더블로!!
		if (su10>=40&&su11>=40&&su12>=40&&result3>=60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
			
	}
	
	public void ifElseIfTest() {
		//if ~ else if ~ else
		//성적 등급 산출 프로그램
		//100~90점 이상 A
		//89~80점 이상 B
		//입력 받은 점수를 기준으로 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 :");
		int jumsu = sc.nextInt();
		char grade = ' ';
		//성적에 대한 등급산출
		if (jumsu>=90) {
			grade = 'A';
		} else if (jumsu>=80) {//위 jumsu<90&& 조건이 포합되어있다.
			grade ='B';
		} else if (jumsu>=70) {
			grade = 'C';
		} else if (jumsu>=60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println(jumsu + "의 등급은" + grade + "입니다.");
		//만약에 else없이 if문으로만 작성한다면???

		if (jumsu>=90) {
			grade = 'A';
		} if (jumsu<90&&jumsu>=80) {//위 조건 포함 안되서 다시 써야 함.
			grade ='B';
		} if (jumsu<80&&jumsu>=70) {
			grade = 'C';
		} if (jumsu<70&&jumsu>=60) {
			grade = 'D';
		} if (jumsu<60) {
			grade = 'F';
		}
		System.out.println(jumsu + "의 등급은" + grade + "입니다.");
	}
	
	
	public void test5() {
		//계산기 만들기
		//정수 2개를 입력받고 연산자(*,+,-,/)입력받아
		//계산결과 출력하기
		/*예) 입력 :5
			입력 : 6
			연산자 : +
		    5+6=11 */
	
	System.out.print("정수 입력 : ");
	int su14 = sc.nextInt();
	System.out.print("정수 입력 : ");
	int su15 = sc.nextInt();
	sc.nextLine();
	System.out.print("연산자 입력(*,+,-,/) : ");
	char su16 = sc.nextLine().charAt(0);
	if (su16=='*') {
		System.out.println(su14 + "" + su16 + su15 + "=" + (su14*su15));
	} else if (su16=='+') {
		System.out.println(su14 + "" + su16 + su15 + "=" + (su14+su15));
	} else if (su16==-'-') {
		System.out.println(su14 + "" + su16 + su15 + "=" + (su14-su15));
	} else if (su16=='/') {
	    System.out.println(su14 + "" + su16 + su15 + "=" + (double)(su14/su15));
	} //여기서 su16을 char형으로 받으려면 "" 추가해야함! 	
	
	//선생님이 한 것
	int su = sc.nextInt();
	System.out.print("정수 입력 : ");
	int su2 = sc.nextInt();
	sc.nextLine();
	System.out.print("연산자 입력(*,+,-,/) : ");
	char op = sc.nextLine().charAt(0);
	double result = 0;
	if (op=='*') {
		result  = su*su2;
	} else if (op=='+') {
		result  = su+su2;
	} else if (op==-'-') {
		result  = su-su2;
	} else if (op=='/') {
	    result  = (double)su/su2;
	} //나누면 더블형으로 받기!!!! 	
	System.out.println((op=='/'?""+su+op+su2+"="+result:""+su+op+su2+"="+(int)result));
		
	}
	
	//성인만 입장할 수 있는 클럽
	//성인이면 메뉴를 출력하여 고르게하고 아니면 집에가세요! 라고 출력하기
	//1. 양주, 2. 소주, 3. 막걸리
	//1 고르면 "양주는 비싸"
	//2 고르면 "소주는  써"
	//3 고르면 "막걸리는 머리아파"
	
	public void test6() {
	//중첩 if
	System.out.print("나이 :");
	int age = sc.nextInt();
	if (age>19) {
	System.out.println("========= 메뉴 =========");
	System.out.println("1.양주 " + "2.소주 " + "3.막걸리 ");
	System.out.println("번호를 고르세요");
		int sul = sc.nextInt();	
		if (sul==1) { 
			System.out.println("양주는 비싸");
		} else if (sul==2) {
			System.out.println("소주는 써");
		} else if (sul==3){
			System.out.println("막걸리는 머리아파");
		}
	} else {
		System.out.println("집에 가세요!");
		}
	}
	
}
	
	
	
	
	

