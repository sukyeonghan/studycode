package com.kh.var.example;

import java.util.Scanner;

public class Example {
	
	Scanner sc=new Scanner(System.in); //여기에 써도 되나?? 다 포함되게
	
	public void example1() {
		//정수 2개를 입력받아, 두 수의 합, 차, 곱, 나누기한 몫, 나머지 출력하기
		System.out.print("첫 번째 정수 입력 : ");
		int su1=sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int su2=sc.nextInt();
		System.out.println("더하기 결과 : " + (su1+su2));
		System.out.println("빼기 결과 : " + (su1-su2));
		System.out.println("곱하기 결과 : " + su1*su2);
		System.out.println("나누기한 몫 : " + su1/su2);
		System.out.println("나누기한 나머지 : " + su1%su2); 
		
	}

	public void example2() {
		//(실수형)가로,세로 값을 입력받아 사각형의 면적(가로*세로)과 둘레((가로+세로)*2)를 계산하여 출력하기
		System.out.print("가로 : ");
		double su3=sc.nextDouble();
		System.out.print("세로 : ");
		double su4=sc.nextDouble();
		System.out.println("면적 : "+ su3*su4);
		System.out.println("둘레 : "+ (su3+su4)*2);
		
	}
	
	public void example3() {
//		영어 문자열을 입력받아 3자리까지 문자 출력하기
		System.out.print("문자열을 입력하시오 : ");
		String str = sc.nextLine();
		
		char su5=str.charAt(0);
		char su6=str.charAt(1);
		char su7=str.charAt(2);
		System.out.println("첫 번째 문자 : "+su5);
		System.out.println("두 번째 문자 : "+su6);
		System.out.println("세 번째 문자 : "+su7);
		
	}
}
