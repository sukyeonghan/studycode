package com.oper.single;

import java.util.Scanner;

public class CompareOperator {
	
	public static void main(String[] args) {
		
		//�񱳿��� Ȱ���ϱ�
		//���� ���� ���(����, ���� �� ��), ���� ��(����, ����) ������
		//�� ������ ����� true/false�� ����
		//�� ������ ���ǹ��� ���� �����
		
		//1. ����� == (true, flase)
		int su=100;
		int su1=200;
		int su3=100;
		System.out.println(su==su1);
		System.out.println(su==su3);
		double dsu=180.5;
		double dsu1=190.5;
		double dsu2=180.5;
		System.out.println(dsu==dsu1);
		System.out.println(dsu==dsu2);
		char ch='A';
		char ch1='B';
		char ch2='A';
		System.out.println(ch==ch1);
		System.out.println(ch==ch2);
		
		String str="�ٺ�";
		String str1="����";
		String str2="�ٺ�";
		System.out.println(str==str1);
		System.out.println(str==str2); 
		//true ����
		//�׷���, ���ڿ��� ==���� ���ϸ� �� ��!
		String str3=new String("����");
		System.out.println(str1==str2);
		
		Scanner sc=new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		String name=sc.nextLine();
		System.out.println("str1 : "+str1+" name : "+name);
		System.out.println("==���� �� : "+ (str1==name));
		//���⼱ false�� ����
		//new~ ���� ���� ������ ������ HEAP �ּҰ��� ����Ǿ�, �� �ּҰ��� ���ϰ� ��
		//���ͷ�(���� str,str1 ��)�� ������ ����Ǯ�� ����Ǿ� ���� ������ �� ��
		//���ڿ��� ��ü�� ����񱳸� �Ϸ��� equals()����� �̿��ؾ� ��
		//���ڿ� ������.equals(�񱳹��ڿ�);
		System.out.println("equals�� �� : "+ str1.equals(str3));
		System.out.println("�Է¹��� �� �� : "+str1.equals(name));
		System.out.println("����".equals(name));
		System.out.println(name.equals("����"));
		//��ġ �ٲ㵵 �������.
		
		//!= ��ġ���� �ʴ� �� ��
		System.out.println(su==su1);
		System.out.println(su!=su1);
		
		//���ڿ��� �ٸ��İ� ��� ����??
		//�������� �̿�
		System.out.println(!str.equals(str1));
		
		//��Һ�
		//>,<,>=,<=
		su=20;
		su1=30;
		su3=20;
		System.out.println(su>su1);
		System.out.println(su<su1);
		System.out.println(su>=su3);
		
		//char���� ��Һ񱳰� �����Ѱ�?
		//������. char ������ = ����/ 65 = A
		ch='A';
		ch1='B';
		System.out.println(ch>ch1);
		System.out.println(++ch);
		//����Ǽ� B ���
		System.out.println(ch>'a');
		
		//�񱳿����� ����� boolean���̾ �̷��Ե� �ȴ�.
		boolean flag=ch<'Z';
		
	}

}
