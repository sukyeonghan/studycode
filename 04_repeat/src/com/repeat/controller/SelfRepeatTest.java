package com.repeat.controller;

import java.util.Scanner;

public class SelfRepeatTest {
	
	public void basicRepeat() {
		
		//for�� �����ϱ�
		
		System.out.println("i=1���� �����ؼ� 100���� ����");
		for(int i=1; i<=100; i++) {
			System.out.println(i);
		}
		
		System.out.println("i=0���� �����ؼ� 100���� ����");
		for(int i=0; i<100; i++) {
			System.out.println(i+1);
		}
		
		System.out.println("¦���� ����ϱ�");
		for(int i=2; i<=100; i++) {
			System.out.println(i++);
		}
		
		System.out.println("100���� 1���� �Ųٷ� ����");
		for(int i=100; i>0; i--) {
			System.out.println(i);
		}

		System.out.println("���� �����ؼ� �Ѵٸ�?");
		int su =100;
		for(int i=0; i<100; i++) {
			System.out.println(su--);
		}
		
		System.out.println("1���� 100���� Ȧ���� ����ϱ�");
		for(int i=1; i<100; i++) {
			System.out.println(i++);
		}
//		�Ǵ�
//		for(int i=1; i<100; i+=2) {
//			System.out.println(i);
//		}
//		�Ǵ� for�� �ȿ� if�� �ֱ�
//		for(int i=0; i<100; i++) {
//			if(i%2==1) {
//				System.out.println(i);
//			}
//		}
//		�Ǵ� (3���� ��µ�)
//		int su2 = 1;
//		for(int i =1; i<50; i++) {
//			System.out.println(su2+=2);
//		}
		
		System.out.println("1���� 100���� ��ü �� ���ϱ�");
		int sum = 0; 
		for(int i=1; i<=100; i++) {
			sum+=i; //sum = i + sum;
		} System.out.println("��ü �� :"+sum);
		
//		�Ǵ�
//		System.out.println("1���� 100���� ��ü �� ���ϱ�");
//		int sum = 0;
//		int i=0;
//		for(i=1; i<=100; i++) {
//			sum+=i; //sum = i + sum;
//		} System.out.println("1~" +(i-1)+"�� :" +sum);
//		//i�� 101�� �Ǹ鼭 ���������ϱ� 100�� ��Ÿ������ (i-1)�� ǥ��!
		
		System.out.println("1���� 100���� ¦���� ���ϱ�");
		int sum2 = 0;
		for(int i=1; i<=100; i++) {
			if (i%2==0) {
				sum2+=i;
			}
		} System.out.println("¦�� �� :"+sum2);
		
		//�Է¹��� Ƚ����ŭ "�ڵ��� ��ſ�" �ݺ� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ݺ��� Ƚ�� �Է� :");
		int su1 = sc.nextInt();
		for(int i=0; i<su1; i++) {
			System.out.println("�ڵ��� ��ſ�");
		}
		
		//���� 3���� �Է� �ް� �� �հ踦 �� ������ ����ϱ�
		int sum3 = 0; 
		for(int i=0; i<3; i++) {
			System.out.print("���� �Է� :");
			sum3+=sc.nextInt();
		} System.out.println("�� �հ� :"+sum3);
	}

	public void studentGrade() {
		
		//�л� ���� 
		//�̸�, ����, ����, ���� ������ �Է¹ް�
		//�� �հ�� ����� ���ϴ� ���α׷� �����
		//������ 100 100 100 �հ� 300 ��� 100
		//��   �� 90  90  90  �հ�270   ��� 90
		//�� ������ ������ �� ��, ��� ���뿡 ���� ���� �� ��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л� �� :");
		int a = sc.nextInt();
		sc.nextLine();
		String sum = "";
		for(int i=0; i<a; i++) {
			System.out.print("�̸� :");
			String name = sc.nextLine();
			System.out.print("���� :");
			int ko = sc.nextInt();
			System.out.print("���� :");
			int en = sc.nextInt();
			System.out.print("���� :");
			int ma = sc.nextInt();
			sc.nextLine();
			
			sum+=name+" "+ko+" "+en+" "+ma+
					" �հ�"+(ko+en+ma)+" ���"+((ko+en+ma)/3.0 + "\n");
			
		} System.out.println(sum);
	}
	
	public void whileTest() {
		
		//���� �� ���� �� 3�� ���
		int i=0;
		while(i<3) {
			System.out.println("���� �� ���� ��!");
			i++;
		}
		
		//1~30���� ����ϱ�
		int i2 = 1;
		while(i2<=30) {
			System.out.println(i2);
			i2++;
		}
		
		//����ڰ� �Է��ϴ� 3�� ���ڿ��� �� ���� ����ϴ� ���α׷� �ۼ�
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		String result = " ";
		while(a<3) {
			System.out.print("���ڿ� : ");
			result+= sc.nextLine();
			a++;
		} System.out.println(result);
	
		//do~while��
		do {
			System.out.println("do~while��");
			a++;
		} while(a<5);
		
		
		}
	}
	
