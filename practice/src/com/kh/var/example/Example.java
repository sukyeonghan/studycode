package com.kh.var.example;

import java.util.Scanner;

public class Example {
	
	Scanner sc=new Scanner(System.in); //���⿡ �ᵵ �ǳ�?? �� ���Եǰ�
	
	public void example1() {
		//���� 2���� �Է¹޾�, �� ���� ��, ��, ��, �������� ��, ������ ����ϱ�
		System.out.print("ù ��° ���� �Է� : ");
		int su1=sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int su2=sc.nextInt();
		System.out.println("���ϱ� ��� : " + (su1+su2));
		System.out.println("���� ��� : " + (su1-su2));
		System.out.println("���ϱ� ��� : " + su1*su2);
		System.out.println("�������� �� : " + su1/su2);
		System.out.println("�������� ������ : " + su1%su2); 
		
	}

	public void example2() {
		//(�Ǽ���)����,���� ���� �Է¹޾� �簢���� ����(����*����)�� �ѷ�((����+����)*2)�� ����Ͽ� ����ϱ�
		System.out.print("���� : ");
		double su3=sc.nextDouble();
		System.out.print("���� : ");
		double su4=sc.nextDouble();
		System.out.println("���� : "+ su3*su4);
		System.out.println("�ѷ� : "+ (su3+su4)*2);
		
	}
	
	public void example3() {
//		���� ���ڿ��� �Է¹޾� 3�ڸ����� ���� ����ϱ�
		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		String str = sc.nextLine();
		
		char su5=str.charAt(0);
		char su6=str.charAt(1);
		char su7=str.charAt(2);
		System.out.println("ù ��° ���� : "+su5);
		System.out.println("�� ��° ���� : "+su6);
		System.out.println("�� ��° ���� : "+su7);
		
	}
}
