package com.repeat.controller;

import java.util.Scanner;
import java.util.*; //util 안에 있는 거 전체 쓰겠다

public class RepeatTest {

	public void basicRepeat() {
		//반복문
		//프로그램 수행 흐름을 바꾸는 역할을 하는 제어문 중 하나로
		//특정 문장들을 반복해서 수행한다.
		
		//기본 for문 작성하기
		//for(초기식; 조건식; 증감식) {수행될 문장;}
		//동일한 것을 지속적으로 반복할 때,반복 횟수를 알고 있을 때 
		
		//안녕하세요 10번 찍기
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
		//.
		//.
		System.out.println("===for문으로 출력하기===");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			System.out.println("안녕하세요!");
		}
		
		//1부터 100까지 출력하기
		System.out.println("1부터 100까지 출력하기");
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			// for (int i = 0; i <100; i++) {
			// System.out.println("i : "+ (i+1));
			// 이렇게도 됨
			// System.out.println("i : " + i++);
			//이렇게 하면 i 값이 짝수만 나옴!! i값을 여기서 +1을 또 시킴
		}
		
		//100부터 1까지
		System.out.println("100부터 1까지 거꾸로 출력하기");
		for (int i = 100; i > 0; i--) {
			System.out.println("i :" + i);
			//int su = 100;
			//for(int i = 0; i <100; i++) {
			//	System.out.println(su--);
			//이렇게도 됨. 꼭 초기값을 사용하지 않아도 됨.
			//if문 처럼 for문 안에서 선언한 변수는 밖 중괄호에서 사용 못 함.
			//초기식 변수도 마찬가지임. - 그래서 같은 i였어도 오류가 나지 않았음!
			}
		
		//1부터 100까지 홀수만 출력하기
		System.out.println("1부터 100까지 홀수만 출력하기");
		for (int i = 1; i < 100; i+=2) {
			System.out.println("i :"+i);
		}
		//for (int i = 1; i <= 100; i++) {
		//if(i%2==1) {  for문 안에 if문이 들어갈 수 있다!
		//또는
		//int su2 = 1; 선언하고
		//for(int i=1; i<50, i++)
		//System.out.println("i :"+(i+2));
		
		//1부터 100까지 전체 합을 구하기
		System.out.println("1부터 100까지 전체 합 구하기");
		//이전에 더한 값을 선언해서 유지해놓기
		int sum=0;
		for (int i = 1; i<=100; i++) {
			//if(i%2==0) { 짝수 합만 구할 때
			sum+=i;  //sum=sum+1;
		//} 짝수 합만 구할 때
	}
			System.out.println("전체 합 :" + sum);
		

		//System.out.println("1부터 100까지 짝수만 합하기");
		//int sum2=0;
		//for (int i = 1; i<=100; i++) {
		//	if(i%2==0) {
		//	sum2+=i;
		//}
		//System.out.println("짝수 합 :" + sum2);
		
		//입력받은 횟수만큼 "코딩이 즐거워" 반복 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반복할 횟수 입력 :");
		int su1 = sc.nextInt();
		for (int i = 0; i < su1; i++) {
			//범위는 반복할 횟수까지 출력한다!! 
			//시작을 0부터 했으니까 범위에 '='을 붙이면 한 번 더 출력된다!!
			System.out.println("코딩이 즐거워");
		}
		
		//정수 3개를 입력 받고 총 합계를 한 번으로 출력하기
		
		int sum2 = 0;
		for (int i = 0; i <3; i++) {
			System.out.print("정수 :");
			sum2+=sc.nextInt();
		}
		System.out.println(sum2);
	
		//for문의 다른 사용법
		//for(초기식;조건식;증감식) {로직}
//		(;;)만 쓴다면?
//		for(;;) { //무한 루프 ex)회원 등록하고 메인 화면가고...윈도우 운영체제도 같은 방식.종료가 필요함
//			System.out.println("=== 메뉴판 ===");
//			System.out.println("1. 캐비어");
//			System.out.println("2. 곱창");
//			System.out.println("3. 송로버섯");
//			System.out.println("0. 프로그램 종료");
//			System.out.print("입력 : ");
//			int choice=sc.nextInt();
//			switch(choice) {
//			case 1 : System.out.println("비싼 캐비어"); break;
//			case 2 : System.out.println("곱창은 소주와!"); break;
//			case 3 : System.out.println("송로버섯??"); break;
//			case 0 : System.out.println("프로그램을 종료합니다."); return; 
//			} //return은 무한루프 끝냄.밑 코드 안 읽음.메소드 자체를 끝냄.
//			
//		}
		//for문에 조건식을 빼면???
		for (int i = 0;;i++) { //무한루프. 조건식없으니까 무조건 true
			System.out.println(i);
			if (i==10000) {
				break; //10000되면 종료함
			}
		}
		
		int a = 0; //이게 초기식이 된다.
		for (; a<10; a++) {
			System.out.println(a);
		}
		
		for(; a<20; ) {//조건식만 써도 됨. 
			//System.out.println(a); //false를 못 받으니까 계속 10이 찍힘
			System.out.println(a++); //하면 19까지 찍히고 종료됨
		}
		//초기식, 증감식에는 여러 값을 선언/변경 시킬 수 있다.
		for(int i=0,j=10;i<10;i++,j+=20) {
			System.out.println(i+" "+j);
		} //i가 10될 때까지 i는 1씩, j는 20씩 증가
	}
		
	public void studentGrade() {
		//학생 수와
		//학생의 영어, 수학, 국어 점수를 입력받고
		//그 합계와 평균을 구하는 프로그램 만들기
		//유병승 100 100 100 합계 300 평균 100
		//조   현 90  90  90  합계270   평균 90
		//각 과목의 변수는 한 개, 출력 내용에 대한 변수 한 개
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수 :");
		int stu = sc.nextInt();
		sc.nextLine();
		String result=""; 
		//전체 계산값 string 이니까..공백이처음이니까 저 결과값이 처음 입력됨.그 다음 결과값이 누적되서 출력된다!!
		for(int i = 0; i < stu; i++) {
			
			
			System.out.print("이름 :");
			String name = sc.nextLine();
			System.out.print("영어 점수 :");
			int en = sc.nextInt();
			System.out.print("수학 점수 :");
			int ma = sc.nextInt();
			System.out.print("국어 점수 :");
			int ko = sc.nextInt();	
			sc.nextLine(); //다시 위로 올라가서 받으니까
			//int result1 = en+ma+ko;
			//double result2 = result1/3.0;
			//System.out.printf("%s %d %d %d 합계 %d 평균 %f \n", 
			//		name, en, ma, ko, result1, result2);
			//이렇게 쓰면 한 번 돌 때마다 출력 됨.
			result+=name+" "+ko+" "+en+" "+ma+
					" 합계 : "+(en+ko+ma)+" 평균 :"+ ((ko+en+ma)/3.0) + "\n";

		} 
		System.out.println(result);
	//이렇게 하면  다 돌고 나서 밑에 한꺼번에 출력됨.
	
	}
	
	public void whileTest() {
		//while(조건식) {수행될 문장; [증감식or분기문]; }
		//증감식은 {} 주로 맨 밑에 씀(위치에 따라 값이 달라질 수 있음)
		//주로 무한루프 돌 때, 분기문을 만나서 끝나게 할 때, 
		//돌아가다가 자동으로 false가 되는 메소드들을 쓸 때, 조건식만 가지고 true/false 만들 수 있을 때 사용
		
		//이제 곧 오늘 수업 끝이에요
		int i = 0; //초기식
		while(i<3) { //조건식 
			System.out.println("이제 곧 수업 끝!");
			i++; //증감식
					
		}
		
		//1~30까지 출력하기
		int i2 =1;
		while(i2<=30) {
			System.out.println(i2);
			i2++;
		//i=0;
		//while(i<30) {
		//System.out.println(i+1);
		//i++;
		}
		
		//사용자가 입력하는 3개 문자열을 한 번에 출력하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		
		int ii = 0;
		String result="";
		while(ii<3) {
			System.out.print("문자열 입력 : ");
			result+= sc.nextLine(); //result+=해야한다는 거!!
			//문자열은 +연산만 된다
			ii++; //여기에 증가할 것이  뭔지 잘 확인하고 넣기!! str넣었더니 무한루프 나옴..
		}  //증감식 빠지면 무한루프..
		System.out.println(result);
		
		//do ~ while문
		//do {수행 로직} while (조건식);
		//while문은 true면 실행, f면 실행안함
		//do~while문은 무조건 do뒤 1번은 실행! 뒤 조건이 t/f상관없이. false면 종료.
		do {
			System.out.println("do~while문");
			ii++; //조건을 벗어나게 할 연산(증감식,분기문)필요
		} while (ii<5); //while(false); 로 쓸 수 있음
		
		while (ii<3) { //while(true) 하면 무한루프 됨
			System.out.println("while문");
		}
		
		//while은 이렇게 많이 쓴다 정도만 알아둬라. 뒤에서 배움
		Set<String> test = new HashSet();
		test.add("하나");
		test.add("둘");
		test.add("셋");
		Iterator it=test.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
	
}


