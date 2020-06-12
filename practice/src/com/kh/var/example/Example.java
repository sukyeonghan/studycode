package com.kh.var.example;

import java.util.Scanner;

public class Example {
	
	Scanner sc=new Scanner(System.in); //여기에 써도 되나?? 다 포함되게
	
	public void example1() {
		
		System.out.print("첫 번째 정수 입력 : ");
		int su1=sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int su2=sc.nextInt();
		System.out.println("더하기 결과 : " + su1+su2);
		System.out.println("빼기 결과 : " + (su1-su2));
		System.out.println("곱하기 결과 : " + su1*su2);
		System.out.println("나누기한 몫 : " + su1/su2);
		System.out.println("나누기한 나머지 : " + su1%su2); 
		//printf 써야하나?
		
	}

	public void example2() {
		
		System.out.print("가로 : ");
		double su3=sc.nextDouble();
		System.out.print("세로 : ");
		double su4=sc.nextDouble();
		System.out.println("면적 : "+ su3*su4);
		System.out.println("둘레 : "+ (su3+su4)*2);
		
	}
	
	public void example3() {
		
		sc.nextLine();
		System.out.print("문자열을 입력하시오 : ");
		char su5=sc.nextLine().charAt(0);
		System.out.println("첫 번째 문자 : "+su5);
		char su6=sc.nextLine().charAt(1);
		System.out.println("두 번째 문자 : "+su6);
		char su7=sc.nextLine().charAt(2);
		System.out.println("두 번째 문자 : "+su7);
		///오류남.. 왜?
	}
}
