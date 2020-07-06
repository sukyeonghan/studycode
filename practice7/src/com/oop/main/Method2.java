package com.oop.main;

import java.util.Scanner;

import com.oop.method.NonstaticSample2;

public class Method2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		NonstaticSample2 nt = new NonstaticSample2();
		
		System.out.print("정수 한 개를 입력하세요 : ");
		int a = sc.nextInt();
		int[] intArr = nt.intArrayAllocation(a);
		
		nt.display(intArr);
		
		System.out.println("인덱스 범위 안 정수를 하나 입력하세요 : ");
		int in1 = sc.nextInt();
		System.out.println("인덱스 범위 안 정수를 하나 더 입력하세요 : ");
		int in2 = sc.nextInt();
		nt.swap(intArr, in1, in2);
		//int[] arr = intArr.clone();
		
		System.out.println("내림차순");
		nt.sortDescending(intArr);
		
		System.out.println("오름차순");
		nt.sortAscending(intArr);
		
		
//		System.out.print("문자열 입력 : ");
//		String str = sc.nextLine();
//		System.out.print("문자 입력 : ");
//		char ch = sc.nextLine().charAt(0);
//		nt.countChar(str, ch);
//		System.out.println();
//		
//		System.out.println("정수 한 개 입력 : ");
//		int su = sc.nextInt();
//		System.out.println("정수 한 개 더 입력 : ");
//		int su1 = sc.nextInt();
//		nt.totalValue(su, su1);
//		System.out.println();
//		sc.nextLine();
		
//		System.out.print("문자열 입력 : ");
//		String str3 = sc.nextLine();
//		System.out.print("인덱스 번호 입력 : ");
//		int su3 = sc.nextInt();
//		String ch3 = nt.pCharAt(str3,su3);
//		System.out.println(ch3);
//		sc.nextLine();
		
//		System.out.print("문자열 입력 : ");
//		String str4 = sc.nextLine();
//		System.out.print("문자열 입력 : ");
//		String str5 = sc.nextLine();
//		String sumStr = nt.pConcat(str4, str5);
//		System.out.println(sumStr);
	
	}
}
