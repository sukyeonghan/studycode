package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	
	public void test1() {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.print("�̸��� �Է��ϼ��� : ");
	String name=sc.nextLine();
	System.out.print("������ �Է��ϼ���(��/��): ");
	char gender=sc.nextLine().charAt(0);
	System.out.print("���̸� �Է��ϼ��� : ");
	int age=sc.nextInt();
	System.out.print("Ű�� �Է��ϼ��� : ");
	double height=sc.nextDouble();
	System.out.printf("Ű %.1fcm�� %d�� %c�� %s�� �ݰ����ϴ�^^",height,age,gender,name);

}
	
}
