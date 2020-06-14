package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	Scanner sc=new Scanner(System.in);
	
	public void practice1() {
		//입력받은 하나의 정수가 양수면 "양수다", 아니면 "양수가 아니다" 출력하기
		System.out.print("정수 : ");
		int su1=sc.nextInt();
		System.out.println(su1>0?"양수다":"양수가 아니다");
	}

	public void practice2() {
		//입력받은 하나의 정수가 양수면"양수다",
		//양수가 아닌 경우 중에서 0이면"0이다", 0이 아니면 "음수다" 출력하기
		System.out.print("정수 : ");
		int su2=sc.nextInt();
		System.out.println(su2>0?"양수다":(su2==0?"0이다":"음수다"));
	}
	
	public void practice3() {
		//입력받은 하나의 정수가 짝수이면 "짝수다", 아니면 "홀수다" 출력하기
		System.out.print("정수 : ");
		int su3=sc.nextInt();
		System.out.println(su3%2==0?"짝수다":"홀수다");
		
	}
	
	public void practice4() {
		//인원 수와 사탕 개수를 입력받고 1인당 동일하게 나눠가진 사탕 개수와 
		//나눠주고 남은 사탕 개수 출력하기
		System.out.print("인원 수 : ");
		int su4=sc.nextInt();
		System.out.print("사탕 개수 : ");
		int su5=sc.nextInt();	
		System.out.println("1인당 사탕 개수 :"+su5/su4);
		System.out.println("남는 사탕 개수 :"+su5%su4);
	}
	
	public void practice5() {
		//입력받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하기
		//성별이 'M'이면 남학생, 아니면 여학생으로 출력하기
		System.out.print("이름 : ");
		String name1=sc.nextLine();
		
		System.out.print("학년(숫자만) :");
		int grade1=sc.nextInt();
		
		System.out.print("반(숫자만) :");
		int class1=sc.nextInt();
		
		System.out.print("번호(숫자만) :");
		int su6=sc.nextInt();
		
		sc.nextLine();
		System.out.print("성별(M/F) :");
		char gender1 = sc.nextLine().charAt(0)=='M'?'남':'여';
		
		System.out.print("성적 :");
		double su7=sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다.", 
				grade1, class1, su6, name1, gender1, su7);
		
	}
	
	public void practice6() {
		//나이를 입력받아 어린이(13세 이하),청소년(13세 초과~19세 이하),성인(19세 초과)인지 출력하기
		
		System.out.print("나이 : ");
		int age2 = sc.nextInt();
		System.out.println(age2<=13?"어린이":(age2>19?"성인":"청소년"));
		
	}
	
	public void practice7() {
		//국어,영어,수학 점수를 입력받고 세 과목에 대한 합계와 평균(합계/3.0) 구하기
		//세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니면 불학격 출력하기
		
		System.out.print("국어 :");
		int su8 = sc.nextInt();
		System.out.print("영어 :");
		int su9 = sc.nextInt();
		System.out.print("수학 :");
		int su10 = sc.nextInt();
		int result1=su8+su9+su10;
		double result2=result1/3.0;
		System.out.println("합계 :"+result1);
		System.out.println("평균 :"+result2);
		System.out.println(su8>=40&&su9>=40&&su10>=40&&result1>=60?"합격":"불합격");
		
	}
	
	public void practice8() {
		//주민번호를 이용하여 남자인지 여자인지 구분하여 출력하기
		
		System.out.print("주민번호를 입력하세요(-포함) :");
		char su11 = sc.nextLine().charAt(7);
		System.out.println(su11==1?"남자":"여자");
		
	}
	
	public void practice9() {
		//정수 두개를 입력받아 각각 변수(num1,num2)에 저장
		//그리고 또 다른 정수를 입력 받아 그 수가 num1이하거나 unm2초과이면 true를 출력하고 아니면 false를 출력하기
		//단, num1은 num2보다 작아야 함
		
		System.out.print("정수1 :");
		int num1 = sc.nextInt();
		System.out.print("정수2 :");
		int num2 = sc.nextInt();
		System.out.print("입력 :");
		int num3 = sc.nextInt();
		System.out.println(num2>num1&&(num1>=num3||num2<num3)?"true":"false");
	}
	
	public void practice10() {
		//3개의 수를 입력 받아 모두 같으면 true,아니면 false를 출력하기
		
		System.out.print("입력1 :");
		int su12=sc.nextInt();
		System.out.print("입력2 :");
		int su13=sc.nextInt();
		System.out.print("입력3 :");
		int su14=sc.nextInt();
		System.out.println(su12==su13&&su13==su14?"true":"false");
	}
	
	public void practice11() {
		//A,B,C 사원의 연봉을 입력받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하기
		//인센티브 포함 급여가 3000만원 이상이면 "3000이상", 미만이면 "3000미만" 출력하기
		//A사원의 인센티브는 0.4, B사원의 인센티브는 없으며, C사원의 인센티브는 0.15
		
		System.out.print("A사원의 연봉 :");
		int su15 = sc.nextInt();
		System.out.print("B사원의 연봉 :");
		int su16 = sc.nextInt();
		System.out.print("C사원의 연봉 :");
		int su17 = sc.nextInt();
		System.out.println("A사원의 연봉/연봉+a :"+su15+"/"+su15*1.4);
		System.out.println(su15*0.4>3000?"3000이상":"3000미만");
		System.out.println("B사원의 연봉/연봉+a :"+su16+"/"+su16*1.0);
		System.out.println(su16*0.4>3000?"3000이상":"3000미만");
		System.out.println("C사원의 연봉/연봉+a :"+su17+"/"+su17*1.15);
		System.out.println(su17*0.4>3000?"3000이상":"3000미만");
	
	}
}
