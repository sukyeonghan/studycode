package com.oper.single;

import java.util.Scanner;

public class SingleOperator {
	
	public static void main(String[] args) {
		//���׿����� Ȱ���ϱ�
		//���������� Ȱ���ϱ�
		boolean flag=true;
		System.out.println(flag);
		System.out.println(!flag);
		//!!�ϸ� �ٽ� true�� ��
		//���������� �������� �幰�� ����ϰ�  �񱳿���, ������� �Բ� ���� ���
		
		//����,���� ����
		//++, --
		int su=19;
		su++; //su=su+1
		System.out.println(su);
		su--;
		su--;
		System.out.println(su);
		
		//����-���� �տ� ������ �ۼ�(++a), ���� ����(a++)
		//�ٸ� �����ڿ� ������ �� ���̰� �߻���. �ܵ����� ����ϸ� ������� ���Ծ���.
		//���� : ���� ��/���ϰ� �ٸ� ����ó��
		//���� : �ٸ� ���� ���� ó���ϰ� ��/��

		int su1=29;
		int su2=0;
		int su3=0;
		su2=++su1;
		su1=29;
		su3=su1++;
		System.out.println("su2 : "+su2);
		System.out.println("su3 : "+su3);
		
		//�ַ� ���� ���?
		//1. �ݺ����� ���� ���
		//2. Ư���� ���� ���� �� ��
		//count++;
		
		int su4=30;
		int su5=0;
		//su5=++su4+20; //51
		//su5=su4+++20; //50
		
		
		//��� ������ Ȱ���ϱ�
		//�⺻���� ���ϱ�,����,������, ���ϱ�, �������� ���ϱ�
		//���� ������ �ϴ� ��. ���ϱ�� ���ڿ��굵 ���� ex) ���� ĢĢ����
		
		//���ϱ�
		int su6=7;
		int su7=10;
		System.out.println(su6+su7); //������ ����, ����ؾ� ��
		System.out.println(su6+20); //���ͳΰ��� ���� ����
		System.out.println(20+15);
		
		//���� ����� ������ ����
		int result=su6+su7;
		//byte result2=su6+su7; �ڷ��� �޶� �ȵ�.
		System.out.println(result);
		
		//����
		System.out.println(su6-su7);
		result=su6-su7;
		System.out.println(result);
		
		//���ϱ�
		System.out.println(su6*su7);
		result=su6*su7;
		System.out.println(result);
		
		//������ *�ڷ����� ���� �ϱ�
		System.out.println(su6/su7);
		// 0.7�� �ƴ� ���� 0�� ���� (int����)
		System.out.println((double)su6/su7);
		//������ ����ȯ 
		//�Ҽ������� ���� ���
		//result=(double)su6/su7; result�� int���̶� �ȵ�
		double result2=(double)su6/su7;
		System.out.println(result);
		
		//������
		System.out.println(su6%su7);
		System.out.println(5%3);
		//¦��(2�� ������ �� 0), Ȧ��, ���, �ִ����� ��� ���� �� ����
		
		//�� �Է¹޴� ���α׷� ���� �� ¦������ Ȧ������ Ȯ���ϱ�
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�����Է� : ");
		int su8=sc.nextInt();
		System.out.println(su8%2);
		
		
		}

}
