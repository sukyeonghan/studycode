package com.kh.var.example;

import java.util.Scanner;

public class Example {
	
	Scanner sc=new Scanner(System.in); //���⿡ �ᵵ �ǳ�?? �� ���Եǰ�
	
	public void example1() {
		
		System.out.print("ù ��° ���� �Է� : ");
		int su1=sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int su2=sc.nextInt();
		System.out.println("���ϱ� ��� : " + su1+su2);
		System.out.println("���� ��� : " + (su1-su2));
		System.out.println("���ϱ� ��� : " + su1*su2);
		System.out.println("�������� �� : " + su1/su2);
		System.out.println("�������� ������ : " + su1%su2); 
		//printf ����ϳ�?
		
	}

	public void example2() {
		
		System.out.print("���� : ");
		double su3=sc.nextDouble();
		System.out.print("���� : ");
		double su4=sc.nextDouble();
		System.out.println("���� : "+ su3*su4);
		System.out.println("�ѷ� : "+ (su3+su4)*2);
		
	}
	
	public void example3() {
		
		sc.nextLine();
		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		char su5=sc.nextLine().charAt(0);
		System.out.println("ù ��° ���� : "+su5);
		char su6=sc.nextLine().charAt(1);
		System.out.println("�� ��° ���� : "+su6);
		char su7=sc.nextLine().charAt(2);
		System.out.println("�� ��° ���� : "+su7);
		///������.. ��?
	}
}
