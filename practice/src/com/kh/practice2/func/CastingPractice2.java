package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� :");
		double su1 = sc.nextDouble();
		System.out.print("���� :");
		double su2 = sc.nextDouble();
		System.out.print("���� :");
		double su3 = sc.nextDouble();
		System.out.println("���� :"+(int)(su1+su2+su3));
		System.out.println("��� : "+(int)(su1+su2+su3)/3);
	}
	
}
