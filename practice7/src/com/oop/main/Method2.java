package com.oop.main;

import java.util.Scanner;

import com.oop.method.NonstaticSample2;

public class Method2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		NonstaticSample2 nt = new NonstaticSample2();
		
		System.out.print("���� �� ���� �Է��ϼ��� : ");
		int a = sc.nextInt();
		int[] intArr = nt.intArrayAllocation(a);
		
		nt.display(intArr);
		
		System.out.println("�ε��� ���� �� ������ �ϳ� �Է��ϼ��� : ");
		int in1 = sc.nextInt();
		System.out.println("�ε��� ���� �� ������ �ϳ� �� �Է��ϼ��� : ");
		int in2 = sc.nextInt();
		nt.swap(intArr, in1, in2);
		//int[] arr = intArr.clone();
		
		System.out.println("��������");
		nt.sortDescending(intArr);
		
		System.out.println("��������");
		nt.sortAscending(intArr);
		
		
//		System.out.print("���ڿ� �Է� : ");
//		String str = sc.nextLine();
//		System.out.print("���� �Է� : ");
//		char ch = sc.nextLine().charAt(0);
//		nt.countChar(str, ch);
//		System.out.println();
//		
//		System.out.println("���� �� �� �Է� : ");
//		int su = sc.nextInt();
//		System.out.println("���� �� �� �� �Է� : ");
//		int su1 = sc.nextInt();
//		nt.totalValue(su, su1);
//		System.out.println();
//		sc.nextLine();
		
//		System.out.print("���ڿ� �Է� : ");
//		String str3 = sc.nextLine();
//		System.out.print("�ε��� ��ȣ �Է� : ");
//		int su3 = sc.nextInt();
//		String ch3 = nt.pCharAt(str3,su3);
//		System.out.println(ch3);
//		sc.nextLine();
		
//		System.out.print("���ڿ� �Է� : ");
//		String str4 = sc.nextLine();
//		System.out.print("���ڿ� �Է� : ");
//		String str5 = sc.nextLine();
//		String sumStr = nt.pConcat(str4, str5);
//		System.out.println(sumStr);
	
	}
}
