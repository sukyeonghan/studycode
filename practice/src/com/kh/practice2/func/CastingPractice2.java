package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("±¹¾î :");
		double su1 = sc.nextDouble();
		System.out.print("¿µ¾î :");
		double su2 = sc.nextDouble();
		System.out.print("¼öÇÐ :");
		double su3 = sc.nextDouble();
		System.out.println("ÃÑÁ¡ :"+(int)(su1+su2+su3));
		System.out.println("Æò±Õ : "+(int)(su1+su2+su3)/3);
	}
	
}
