package com.oper.single;

import java.util.Scanner;

public class LogicOperator {
	
	public static void main(String[] args) {
		//�� ������ Ȱ���ϱ�
		//�� ������ �� ���� ���� �豳�ϴ� ������
		//�ַ� �񱳿����ڸ� �����Ͽ� �����
		//������� ��(true,false);
		//1<10<20�̴�? ���� ��Ÿ�� �� ������ �� &&�������� ��
		int su=10;
		System.out.println(1<su&&su<20);
		//System.out.println(1<su||su<20);
		//�̷��� �Ǹ� ���� ���� ����. �� true
		System.out.println(1>su||su>20);
		//Ư�� ���� ������ �� ���
		
		
		//1. Ƽ�� �ְ� Ű 140cm �̻�
	    boolean ticket=true;
	    double height=130.9;
		System.out.println(ticket&&height>=140);
		
		//2. id�� admin�̰� �н����尡 1234�� ���. �Է¹޾Ƽ� ���ϱ�
		Scanner sc=new Scanner(System.in);
		
		System.out.print("id : ");
		String id=sc.nextLine();
		System.out.print("password : ");
		String password=sc.nextLine();
		System.out.println(id+" "+password);
		System.out.println(id.contentEquals("admin")
				&&password.contentEquals("1234"));
		
		//3. Ƽ���̳� �ʴ����� ������ ����, �ƴϸ� ����Ұ�
		//Ƽ���� 1234, �ʴ����� 4444
		
		String ti="1234";
		String cho="4444";
		System.out.println(ti.contentEquals("1234")
				||cho.contentEquals("4444"));
		
		int ticket1=1234;
		int invate=0000;
		System.out.println(ticket1==1234||invate==4444);
		
		//�������� �������� ����� �����Ѱ�?? ������.
		//Ƽ���̳� �ʴ����� �ְ� 19�� �̻��� ���
		int age=18;
		System.out.println((ticket1==1234||invate==4444)&&age>19);
		
		
		
		
		
	}

}
