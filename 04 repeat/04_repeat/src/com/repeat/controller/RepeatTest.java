package com.repeat.controller;

import java.util.Scanner;
import java.util.*;
public class RepeatTest {

	public void basicRepeat() {
		//�⺻ for�� �ۼ��ϱ�
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
//		.
//		.	
//		.
		//10�а� �����ٰ�.. �غ��ڰ��!! 
		//for���� �̿��ϸ� �����ϰ� ó���� �� ����
		System.out.println("==== for������ ����ϱ� ====");
		for(int i=0;i<10;i++) {
			System.out.println(i);
			System.out.println("�ȳ��ϼ���!");
		}
		//1���� 100���� ���� ����غ�����!
		for(int i=0;i<100;i++) {
		//for(int i=1;i<=100;i++) {
			//System.out.println("i : "+(i+1));
			System.out.println("i : "+i++);
		}
		//100���� 1����
		int su=100;
		//for(int i=100;i>0;i--) {
		for(int i=0;i<100;i++) {
			//System.out.println(i);
			int sum=0;
			System.out.println(su--);
		}
		//sum+=i;
		//1~100���� Ȧ���� �������
		System.out.println(su);
		//for(int i=1;i<=100;i+=2) {
		int su2=1;
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
		//1���� 100���� ��ü ���� ���ϼ���
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
		
		//�Է¹��� ������ �ݺ��ϱ�
		Scanner sc=new Scanner(System.in);
		System.out.print("�����Է� : ");
		int count=sc.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("for���� �ʹ� ��̰� ���������!");
		}
		
		//���� ������ �Է¹ް� �� ������ �հ踦 ����ϼ���
		//�հ�� �ѹ��� ����� �Ǿ��մϴ�.
//		System.out.print("�����Է� : ");
//		int su3=sc.nextInt();
//		System.out.print("�����Է� : ");
//		int su4=sc.nextInt();
//		System.out.print("�����Է� : ");
//		int su5=sc.nextInt();
		int sum2=0;
		for(int i=0;i<3;i++) {
			System.out.print("�����Է� : ");
			sum2+=sc.nextInt();
		}
		System.out.println(sum2);
		
		
		//for���� �ٸ� ����
		//for(�ʱ��;���ǽ�;������){ ����   }
//		for(;;) {//���ѷ���
//			System.out.println("=== �޴��� ===");
//			System.out.println("1. ĳ���");
//			System.out.println("2. ��â");
//			System.out.println("3. �۷ι���");
//			System.out.println("0. ���α׷� ����");
//			System.out.print("�Է� : ");
//			int choice=sc.nextInt();
//			switch(choice) {
//				case 1 : System.out.println("��� ĳ���");break;
//				case 2 : System.out.println("��â�� ���ֿ�!!");break;
//				case 3 : System.out.println("�۷ι���....??..�����ؼ�.�Ф�");break;
//				case 0 : System.out.println("���α׷��� �����մϴ�,");return;
//			}
//		}
		//for���� ���ǽ��� ����??
		for(int i=0;;i++) {//���ѷ���
			System.out.println(i);
			if(i==10000) {
				break;
			}
		}
		int a=0;
		for(;a<10;a++) {
			System.out.println(a);
		}
		//���ǽĸ� for���� ���� �� �ִ�.
		for(;a<20;) {
			System.out.println(a++);
		}
		//�ʱ�� ������ �������� ����/�����ų���ִ�
		for(int i=0,j=10;i<10;i++,j+=20) {
			System.out.println(i+" "+j);
		}
		
		
	}
	//�Է��� �л����� �Է¹ް�,
	//�л��� ����, ����, ���� ������ �Է¹ް�
	//�� �հ�� ����� ���ϴ� ���α׷� �����
	//������ 100 100 100 �հ� 300 ��� 100
	//��  ��  90  90  90  �հ� 270 ��� 90
	//�� ������ ������ �Ѱ�.
	//��³��뿡 ���� ���� �Ѱ�
	
	public void studentGrade() {
		Scanner sc=new Scanner(System.in);
		System.out.println("===== �л����� ���� ���α׷� v01 =====");
		System.out.print("�Է��� �л��� : ");
		int studentSu=sc.nextInt();
		sc.nextLine();
		String result="";
		for(int i=0;i<studentSu;i++) {
			System.out.print("�̸� : ");
			String name=sc.nextLine();
			System.out.print("���� : ");
			int kor=sc.nextInt();
			System.out.print("���� : ");
			int math=sc.nextInt();
			System.out.print("���� : ");
			int eng=sc.nextInt();
			sc.nextLine();
			//System.out.println(
			System.out.println(name+" "+kor+" "+eng+" "+math
					+" �հ� : "+(kor+eng+math)
					+" ��� : "+((kor+eng+math)/3.0)+"\n");
			result+=name+" "+kor+" "+eng+" "+math
					+" �հ� : "+(kor+eng+math)
					+" ��� : "+((kor+eng+math)/3.0)+"\n";
		}
		System.out.println(result);
	}
	
	
	public void whileTest() {
		//���� �� ���� �������̿���!
		int i=0;//�ʱ��
		while(i<3) {//���ǽ�
			System.out.println("���� �� ���� ��!");
			//������
			i++;
		}
		//while���� �̿��Ͽ� 1���� 30���� ����ϱ�
		i=0;
		while(i<30) {
			System.out.println(i+1);
			i++;
		}
		
		//����ڰ� �Է��ϴ� 3�� ���ڿ��� �ѹ��� ����ϴ� ���α׷��ۼ�
		Scanner sc=new Scanner(System.in);
		int j=0;
		String msg="";
		while(j<3) {
			System.out.print("�����Է� : ");
			//msg=msg+sc.nextLine();
			msg+=sc.nextLine();
			//System.out.println(msg);
			//������
			j++;
		}
		System.out.println(msg);
	
		//do ~ while��!
		//do{ ���� ���� }while(���ǽ�);
		do {
			System.out.println("do while��!!");
			j++;
		}while(false);
		
		while(j<3) {
			System.out.println("while��!!");
		}
		
//		while(true) {
//			System.out.println("�������!! �����ϼ���!!");
//		}
		Set<Integer> test=new HashSet();
		test.add(2);
		test.add(3);
		test.add(1);
		Iterator iterator=test.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}
	
}








