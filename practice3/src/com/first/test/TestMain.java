package com.first.test;

import java.util.Calendar;
import java.util.Scanner;

public class TestMain {
	
	public static void main(String[] args) {
		
		Test test = new Test();
		System.out.println(test.getName());
	
		
	
		//���������� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== ����, ����, �� ����! ===");
		
		while(true) {
			
			System.out.println("��ȣ�� �Է��ϼ���. \n 1.���� 2.����  3.�� ");
			int user = sc.nextInt();
			
			int com = (int)(Math.random()*3)+1;  
			//���� �� ���. MathŬ������ random() �޼ҵ尡 ����
			//�� �� ������ ������ �Ǽ� ������ ��(0.0~1.0����) ����
			//�׳� int�� �ٲٸ� 0�� ����..()�ļ� ���� ��� �ؾ���. ����ȯ�� �켱��������
			//1~10������ *10+1, �����ִ� �� n-1 ����, +1�� ���ϸ� 1~n������ ��
			
			
			int game = user-com;
			
			if(game==-2||game==1) {
				System.out.println("����ڰ� �̰���ϴ�.");
				break;
			} else if(game==2||game==-1) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				break;
			} else {
				System.out.println("�����ϴ�. �ٽ� �� ��,\n");
			}
		
		} 		

		//�̸��� �Է¹ް� ��� ���α׷� �����
		//1.��� �̸��� �Է����� �Է¹ް�
		//2.�� �� ��ŭ �迭�� ����� �̸��� �Է¹޾� �����ϰ�
		//3.�迭�� ����ϱ�
							
		Scanner sc1 = new Scanner(System.in);
							
		System.out.print("�ο� �� :");
		int pe = sc.nextInt();
							
		String[] pe2 = new String[pe];
							
		for(int i=0; i<pe2.length; i++) {
			System.out.print("�̸� �Է� : ");
			pe2[i]=sc.next();
		}
		for(int i=0; i<pe2.length; i++) {
			System.out.println(pe2[i]);	 	
		}
	
	
		
//		//��ü �迭 �����ϱ�
//		Nation[] nations;
//		//�迭 �Ҵ� -> �������Ȯ���ϱ�
//		nations=new Nation[3];
//		//����!
//		//System.out.println(nations[0].getName());//������
//		//�ʱⰪ null. �ּҰ� ����. ���� ����ֱ� ���� �����ؼ�
//		
//		//index �̿��Ͽ� �迭�� ��ü �ֱ�
//		//Nation�̶�� �ڷ����� ���� �ּҸ� �־�� ��
//		//nations[0] �ϳ��� �������̶�� ���� ��
//		nations[0]=new Nation("�ѱ�",6000,"�ѱ���",100,"����ȭ");
//		//Nation n = new Nation("�ѱ�",6000,"�ѱ���",100,"����ȭ"); ����
//		//n.getName(); �ؼ� �ҷ��Ծ���
//		nations[1]=new Nation("�̱�",30000,"����",10000,"���");
//		nations[2]=new Nation("�߱�",150000,"�߱���",10000,"��ȭ");
//		
//		//�迭�� ����� ��ü �ҷ�����
//		System.out.println(nations[0].getName());
//		
//		//for�� �̿��� �ʱ�ȭ ���
//		Nation[] nations2 = new Nation[10];
//		
//		for(int i=0; i<nations2.length; i++) {
//			nations2[i] = new Nation(); //default�� �ʱ�ȭ ��
//		}
//		for(int i=0; i<nations2.length; i++) {
//			System.out.println(nations2[i]);
//		}
//		
//		//��ü �迭�� for each�� ����� �����Ѱ�??
//		for(Nation n : nations) {
//			System.out.println(n.getName());
//		}
//		
	
	
	}
	
		
		public void test7() {
			//���ڿ� ������ �ʱ�ȭ�� �� 
			//����,����,����,������ ���� ���� �и� �����ϱ� - substring() ���
			//java.util.Date ���� ����ؼ� ������ ������� ������ ��¥ ������ �����
			//������ ������ ���� �����̾����� �����Ǵ� �޼ҵ带 ����ؼ� ����ϱ�
			//�������� 1�̸� ����, 2�� ���ڶ�� ����ϱ�
			//��¥ �����ͷ� �ٲ� ������ ���� ��¥�� �⵵�� ���� ���� ����ϱ�
			
			String personID = "881225-1234567";
			int myYear = Integer.parseInt(personID.substring(0,2))+1900;
			int myMonth = Integer.parseInt(personID.substring(2,4));
			int myDate = Integer.parseInt(personID.substring(4,6));
			int gender = Integer.parseInt(personID.substring(7,8));
			
			Calendar cal = Calendar.getInstance();
			int year = cal.get(Calendar.YEAR);
			
			int age = year-myYear;
			System.out.println(age+1);
		}

	
		
		private static String name; //Ŭ���� ����
		
		private int su; //�������
		
		public void setSu(int su) { 
			this.su=su;
		}
		public int getSu() {
			return this.su;
		}
		
		
		//Ŭ���������� ��������� ����
		//Ŭ���������� ���α׷� ���۰� ���ÿ� static���� �޸𸮰����� �Ҵ�(���� Ȯ��)��
		//��������� Ŭ������ new�����ڸ� ���� ��üȭ(����) ���� �� �Ҵ��-�� �� this ��� ����.
		
		//static ������ �����ϱ� ���� getter/setter
		//static���� �������� �̷��� �ٲ������
//		public static String getName() {
//			return StaticVariableTest.name; //Ŭ������������ -> Ŭ������.������
//		}
//		public static void setName(String name) {
//			StaticVariableTest.name=name;
			//Ŭ���������� new ���� ���� ������
			//this�� new�� ������ ����� ��ü�� �ּҰ��� ��Ÿ��. �ڱ� �ڽ��� �����ϰ� ���� �� ���� �����		
//		}
		
//		public void setName(String name) {
//			this.name=name; //�̰� ����޼ҵ�. new�� ����
//		}
		
		
		
//		public CommunityMember() { //framework���� �̿��� �⺻�����ڷ� ������ �� �ٸ� setter�� ���� ������.
//			//this()
//			//������ ������ �ڽ��� ������ �ִ� �ٸ� ������ ȣ���� �� ��
//			//����!this �����ڴ� �ݵ�� ������ �� ���� ����Ǿ� �Ѵ�!!
//			//�̷��� �⺻ ���õ� ����
//				this("userId","1111","print");
//				this.point=100.10;
		//�����ε�
//		public CommunityMember (String comName, String comId, String comPw, double point) {
//			//�ܺο��� �ִ� ������ ���ο� �����Ѵ�..
//				this.comName=comName;
//				this.comId=comId;
//				this.comPw=comPw;
//				this.point=point;
//			}
//			//point�ʱⰪ �����ϱ�..���� ����
//			public CommunityMember (String comName, String comId, String comPw) {
//				this(comName,comId,comPw,0);
//			}
	}

