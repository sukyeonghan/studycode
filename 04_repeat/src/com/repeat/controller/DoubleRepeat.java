package com.repeat.controller;

import java.util.Scanner;

public class DoubleRepeat {
	
	public void doubleRepeatTest() {
		//��ø�ݺ���
		//�� �� �����ϰ� ������
		//��������, �ߺ��� ã��
		
		//������ ����ϱ�
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i+ "X" + j +"=" + (i*j));
			}
		}
		
		//������ ������ ����ϰ�
		//�ٸ� ������ �Ѿ�� ���ٿ� ����ϱ�
		for(int i=2; i<10; i++) {
			System.out.println(i + "��");
			for(int j=1; j<10; j++) {
				System.out.print(i+ "X" + j +"=" + (i*j) + " ");
			} //������ ���� �����Ѵ�
			System.out.println(); //�ܰ��� ���� �����Ѵ�
		}
		
		//1234
		//1234
		//1234 ó�� ����ϱ�
		for(int i=0; i<4; i++) {
			for(int j=1; j<=4; j++) {
				System.out.print(j +" ");
		}System.out.println();
	}
		
		//123
		//456
		//789 ó�� ����ϱ�
//		for(int i = 0; i<1; i++) {
//			for(int j= 1; j<=3; j++) {
//				System.out.print(j+" ");
//			} System.out.println();
//			for(int j= 4; j<=6; j++) {
//				System.out.print(j+" ");
//			} System.out.println();
//			for(int j= 7; j<=9; j++) {
//				System.out.print(j+" ");
//			} System.out.println();
//		}
//	
		int su=1;
		for(int i =0; i<3; i++) {
			for(int j=0;j<3;j++) {
				System.out.print((su++) +" ");
			}
			System.out.println();
		}
		
		//987
		//654
		//321
		int su1 = 9;
		for(int i =0; i<3; i++) { //3�� �ݺ� ���
			for(int j=0; j<3; j++) { //3�� �ݺ� ���
				System.out.print(su1-- + " ");//������ ���
			}
			System.out.println();//�Ʒ��� �ٹٲ�
		}
		
		//���߹ݺ����� �̿��Ͽ� �ߺ���ã��
		
	
		//a : 0
		//p : 1
		//p : 1
		//l : 0
		//e : 0
		
		String msg="apple";
	
		
		for(int i = 0; i<5; i++) {
			int count =0; //for���� ������ �� ���� count�� 0ó�� �ؾ���.
			//������ ���� ������ ���� ī��Ʈ�� ������ ��..
			//System.out.println(msg.charAt(i));//0,1,2,3,4 üũ
			for(int j=0;j<5;j++) {
				if (i!=j && msg.charAt(i) == msg.charAt(j)) {
					//true�� �Ȱ��� ���� �ִ�
					count++;//1����. �������� ��.count=count+1
				}
//				System.out.println(i+" : "+j);
//				System.out.println(msg.charAt(i)+" : "+msg.charAt(j));
			}
			
			System.out.println(msg.charAt(i)+" : "+count);
			//count =0; 
			}
			

		}
	
	public void breakTest() {
		//break�� Ȱ���ϱ�
		for(int i=0; ; i++) {
			System.out.println (i);
			if(i==200) {
				break;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		String msg="";
		//���� �ݺ��Ǵ� �޴��� �����ų ��
		while(true) {
			System.out.print("���Է� : ");
			String temp = sc.nextLine();
			if(temp.equals("��")) {
				break;
			} else {
				msg+=temp;
			}
		}
		
		//��ø�ݺ������� break�� ����ϱ�
		dinner:
		for(int i =2; i<9; i++) {
//			if(i%2==1) {
//			break;
//		}
		//���� ������ 2�ܱ��� ���
			for(int j=1; j<10; j++) {
				System.out.println(i+"X"+j+"="+i*j);
				if(i%2==1) {
					break dinner; //dinner(��)���̸� �ƿ� �����Ŵ
					//���� ������ ���� �����for���� ������..
					//Ȧ���� x1������ ����ϰ� break��
				}
			}
//			if(i%2==1) {
//				break;
			//���� ������ 3�ܱ��� ���
		}
		
		//continue��
		//�������� continue���� ������ continue�� �Ʒ��ִ� ������ �������� �ʰ�
		//���� �������� �ٷ� ���� ������. 
		
		for(int i =0; i<10; i++) {
			if(i%2==0) {
				continue; // �� ������ ��Ƽ����.¦���� ������ �ؿ� �����ϰ� ������������ �ö�
			}
			System.out.println(i);
		}
		
		
		
	}
	//�迭
	//heap������ �ּҰ� ����(new�� ����)
	//�����ϰ� �ݵ�� �Ҵ��� �ʿ�!!
	//�迭�� ������ 0�̴�! ����
	//int[] arr=new int[4]
	//4�� ������� ���ܼ� ��ȣ0~3 -> arr[0],arr[1],arr[2],arr[3]	
		
	}

