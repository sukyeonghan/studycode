package com.vari.scanner;

import java.util.Scanner;

public class SignThis {
	
	public static void main(String[] args) {
		//client �̸�,����,�ּ�,��ȭ��ȣ,Ű
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("����� �̸� : ");
		String name=sc.next();
		//���⼭ nextLine();���� �޾Ƶ� ��.���� �ȳ�.
		System.out.println("�̸� : " + name);
		
		System.out.print("����� ���� : ");
		int age=sc.nextInt();
		System.out.println("���� : " + age);
		
		//nextLine���� ���� �ޱ����� nextInt(),next(), nextDouble() ������ ������ ���� �޾ƿ�����
		//�Է¹��۸� sc.nextLine();���� ����ְ� ����ؾ� ��!
		//���� ���� ���� �����ؾ���!
		sc.nextLine();
		System.out.print("����� �ּ� : ");
		String address=sc.nextLine();
		System.out.println("�ּ� : " + address);
		
		System.out.print("����� ��ȭ��ȣ : ");
		String phone=sc.next();
		System.out.println("��ȭ��ȣ : " + phone);
		
		System.out.print("����� Ű : ");
		double height=sc.nextDouble();
		System.out.println("Ű : " + height + "cm");
		
		//System.out.println(name+" "+age+" "+phone+" "+) ���� �� ���� ���� �� ����
	}

}
