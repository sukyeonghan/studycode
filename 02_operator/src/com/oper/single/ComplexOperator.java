package com.oper.single;

import java.util.Scanner;

public class ComplexOperator {
	
	public static void main(String[] arsg ) {
	
	//���� ���� ������
    //��������, ���հ�, ������� ���� ��
	//���ϴ� ���� ������ ������ ������� �� �����ϴ� ������		
		int account=100000000;
		//1. �Ա�
		account+=10;//account=account+10;
		System.out.println(account);
        //2. ���� 500000
		account-=5000000;
		System.out.println(account);
		
		//�Է¹��� ���� �հ踦 ���ϴ� ���α׷��� ����ÿ�.
		Scanner sc=new Scanner(System.in); 
		System.out.print("�����Է� : ");
		int sum=sc.nextInt();
		System.out.print("�����Է� : ");
		sum+=sc.nextInt();
		System.out.print("�����Է� : ");
		sum+=sc.nextInt();
		System.out.println("�հ� : "+sum);
		
		//����ڿ��� ���ڸ� 3�� �Է��ϰ� �ϰ� �� ���� ��� ����ϴ� ���α׷�
		sc.nextLine();
		System.out.print("�޼��� �Է� : ");
		String write=sc.nextLine();
		System.out.print("�޼��� �Է�: ");
		write+=sc.nextLine();
		System.out.print("�޼��� �Է�: ");
		write+=sc.nextLine();
		System.out.println(write);
		
		//String msg=""; ó���� �̰� ������ �� �ں��� �ٷ�
		//write+=sc.nextLine(); ���� �� ����
		//������ �ʱⰪ�� ��� �ȵ�
		
		//����,����,����,�ڵ� ������ �Է¹޾� �հ�� ��� ���ϱ�
		//*�������� ���� ������ �ʿ� ����
		int score=0;
		int count=0;
		//���� ���� ���� �ʹٸ�!
		System.out.print("���� ���� �Է� : ");
		//int score=sc.nextInt(); //������ �ʿ������ �̷���!
		score+=sc.nextInt();
		count++;
		System.out.print("���� ���� �Է� : ");
		score+=sc.nextInt();
		count++;
		System.out.print("���� ���� �Է� : ");
		score+=sc.nextInt();
		count++;
		System.out.print("�ڵ� ���� �Է� : ");
		score+=sc.nextInt();
		count++;
		System.out.println("�հ� : "+score+"�� : "+(score/4.0));
		System.out.println("�հ� : "+score+"�� : "+((double)score/count));
		//����� �Ҽ����� ���� �� ������ ���������� �ٲ��ش�!!
	    System.out.printf("�հ� : %d ��� : %.1f" , score, (score/4.0));
	    //�̷��� ���� �Ҽ��� ù° �ڸ� ������ ���� �� ����
		
		
	}

}
