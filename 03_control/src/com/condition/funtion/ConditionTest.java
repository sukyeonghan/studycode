package com.condition.funtion;

import java.util.Scanner;

public class ConditionTest {
	
	Scanner sc = new Scanner(System.in);
	//sc ��Ī��. ��Ī �ٲ� �� ����.
	
	public void basicTest() {
		//�⺻ if�� ����ϱ�
		//if(���ǽ�(��� : true/false)) {if���� �ش��ϴ� ����}
		//�Ϲ����� ���ǹ� ���� ��
		//(���ǽ��� true�� �Ǹ� {} �κ��� ����, �ƴϸ� if���� ������
		
		//�Է¹��� ���� ����� "����Դϴ�." ����ϱ�
		Scanner sc = new Scanner(System.in);
		//sc ��Ī��. ��Ī �ٲ� �� ����.
		System.out.print("�����Է� :");
		int su = sc.nextInt();
		//���ǿ� ���� ����Դϴ� ����� �������� ������ �� if���� ���
		if (su>0) {
			System.out.println("����Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}

		//Ƽ�Ϲ�ȣ�� �Է¹ް� Ƽ�Ϲ�ȣ�� 777�̸� �����Ǿ����ϴ�. �����ϼ��� ���� ���
		System.out.print("Ƽ�� ��ȣ :");
		int ticket1 = sc.nextInt();
		int count = 0;
		if (ticket1==777) {
			System.out.println("�����Ǿ����ϴ�.");
			System.out.println("�����ϼ���.");
			//�߰�ȣ �ȿ��� ��� ������, ���� ����/����� �� ������
			count++;
			int su1 = 100;
			int su2 = 200;
			int result = su1+su2;
			System.out.println(result);
			
		}
		//if(ticket1 != 777) {
		else {
			System.out.println("�������еǾ����ϴ�.");
			System.out.println("�� �� �����ϴ�.");
		}
		//if�� �� �� false�� ����
		//if~else �� �� ������ ������
		
		//System.out.println(su1+" "+su2+" "+result);
		//if �� �ȿ� ����� �������� ���ο����� ����.
		//�� ���� �������� ������ ���� �� ū �������� ������ �� ����
		System.out.println("���� �� : "+count);
		
		//if~else������ else�� ����� �� ������?
		//�� ��. else�� ���ǿ� ���� ����. if�� �� ����.
		boolean falg = true;
		if(falg) {
			
		}
		else {
			
		}
		
		//Ȧ���� Ȧ��, ¦���� ¦�� ����ϴ� ���α׷� �ۼ��ϱ�
		System.out.print("���� �Է� :");
		int su3=sc.nextInt();
		if (su3%2==1) {
			System.out.println("Ȧ��"); //Ȧ���� �� ���� ����.
		}
		else { System.out.println("¦��"); 
		}
		
	}//�޼ҵ� ���

	public void testA() {
		Scanner sc = new Scanner(System.in);
		
		//����, ����, ���� ������ �Է¹޾� �հ�, ����� ����ϰ�
		//�հ谡 250�� �̻��̸� "������Դϴ�." ���
		System.out.print("���� :");
		int su4 = sc.nextInt();
		System.out.print("���� :");
		int su5 = sc.nextInt();
		System.out.print("���� :");
		int su6 = sc.nextInt();
		int result1 = su4+su5+su6;
		System.out.println("�հ� :"+(result1));
		System.out.println("��� :"+(result1)/3);
		if (result1>=250) {
			System.out.println("������Դϴ�.");
		}
	
	}
	
	public void testB()	{	
		//A,B,C������ �Է¹ް� ������ 5000�̻��̸�
		//"00�� ��׿������Դϴ�." ��� 
		System.out.print("A��� ���� :");
		int su7 = sc.nextInt();
		System.out.print("B��� ���� :");
		int su8 = sc.nextInt();
		System.out.print("C��� ���� :");
		int su9 = sc.nextInt();
		if (su7>=5000) {
			System.out.println("A����� ��׿������Դϴ�.");
		}
		if (su8>=5000) {
			System.out.println("B����� ��׿������Դϴ�.");
		}
		if (su9>=5000) {
			System.out.println("C����� ��׿������Դϴ�.");
		}
		
	}
	
	public void testC() {
	//����,����,���� ������ ���������� �Է¹޾� 
	//������ ����� ������ �հݿ��θ� ó��.
	//3���� ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��̸� �հ�
	//�ƴϸ� ���հ� ����ϱ�
		System.out.print("���� :");
		int su10 = sc.nextInt(); 
		System.out.print("���� :");
		int su11 = sc.nextInt(); 
		System.out.print("���� :");
		int su12 = sc.nextInt(); 
		double result3 = (su10+su11+su12)/3.0;
		//����� �����!!
		if (su10>=40&&su11>=40&&su12>=40&&result3>=60) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}
			
	}
	
	public void ifElseIfTest() {
		//if ~ else if ~ else
		//���� ��� ���� ���α׷�
		//100~90�� �̻� A
		//89~80�� �̻� B
		//�Է� ���� ������ �������� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� :");
		int jumsu = sc.nextInt();
		char grade = ' ';
		//������ ���� ��޻���
		if (jumsu>=90) {
			grade = 'A';
		} else if (jumsu>=80) {//�� jumsu<90&& ������ ���յǾ��ִ�.
			grade ='B';
		} else if (jumsu>=70) {
			grade = 'C';
		} else if (jumsu>=60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println(jumsu + "�� �����" + grade + "�Դϴ�.");
		//���࿡ else���� if�����θ� �ۼ��Ѵٸ�???

		if (jumsu>=90) {
			grade = 'A';
		} if (jumsu<90&&jumsu>=80) {//�� ���� ���� �ȵǼ� �ٽ� ��� ��.
			grade ='B';
		} if (jumsu<80&&jumsu>=70) {
			grade = 'C';
		} if (jumsu<70&&jumsu>=60) {
			grade = 'D';
		} if (jumsu<60) {
			grade = 'F';
		}
		System.out.println(jumsu + "�� �����" + grade + "�Դϴ�.");
	}
	
	
	public void test5() {
		//���� �����
		//���� 2���� �Է¹ް� ������(*,+,-,/)�Է¹޾�
		//����� ����ϱ�
		/*��) �Է� :5
			�Է� : 6
			������ : +
		    5+6=11 */
	
	System.out.print("���� �Է� : ");
	int su14 = sc.nextInt();
	System.out.print("���� �Է� : ");
	int su15 = sc.nextInt();
	sc.nextLine();
	System.out.print("������ �Է�(*,+,-,/) : ");
	char su16 = sc.nextLine().charAt(0);
	if (su16=='*') {
		System.out.println(su14 + "" + su16 + su15 + "=" + (su14*su15));
	} else if (su16=='+') {
		System.out.println(su14 + "" + su16 + su15 + "=" + (su14+su15));
	} else if (su16==-'-') {
		System.out.println(su14 + "" + su16 + su15 + "=" + (su14-su15));
	} else if (su16=='/') {
	    System.out.println(su14 + "" + su16 + su15 + "=" + (double)(su14/su15));
	} //���⼭ su16�� char������ �������� "" �߰��ؾ���! 	
	
	//�������� �� ��
	int su = sc.nextInt();
	System.out.print("���� �Է� : ");
	int su2 = sc.nextInt();
	sc.nextLine();
	System.out.print("������ �Է�(*,+,-,/) : ");
	char op = sc.nextLine().charAt(0);
	double result = 0;
	if (op=='*') {
		result  = su*su2;
	} else if (op=='+') {
		result  = su+su2;
	} else if (op==-'-') {
		result  = su-su2;
	} else if (op=='/') {
	    result  = (double)su/su2;
	} //������ ���������� �ޱ�!!!! 	
	System.out.println((op=='/'?""+su+op+su2+"="+result:""+su+op+su2+"="+(int)result));
		
	}
	
	//���θ� ������ �� �ִ� Ŭ��
	//�����̸� �޴��� ����Ͽ� �����ϰ� �ƴϸ� ����������! ��� ����ϱ�
	//1. ����, 2. ����, 3. ���ɸ�
	//1 ���� "���ִ� ���"
	//2 ���� "���ִ�  ��"
	//3 ���� "���ɸ��� �Ӹ�����"
	
	public void test6() {
	//��ø if
	System.out.print("���� :");
	int age = sc.nextInt();
	if (age>19) {
	System.out.println("========= �޴� =========");
	System.out.println("1.���� " + "2.���� " + "3.���ɸ� ");
	System.out.println("��ȣ�� ������");
		int sul = sc.nextInt();	
		if (sul==1) { 
			System.out.println("���ִ� ���");
		} else if (sul==2) {
			System.out.println("���ִ� ��");
		} else if (sul==3){
			System.out.println("���ɸ��� �Ӹ�����");
		}
	} else {
		System.out.println("���� ������!");
		}
	}
	
}
	
	
	
	
	

