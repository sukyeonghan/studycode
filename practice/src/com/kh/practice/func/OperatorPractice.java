package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	Scanner sc=new Scanner(System.in);
	
	public void practice1() {
		//�Է¹��� �ϳ��� ������ ����� "�����", �ƴϸ� "����� �ƴϴ�" ����ϱ�
		System.out.print("���� : ");
		int su1=sc.nextInt();
		System.out.println(su1>0?"�����":"����� �ƴϴ�");
	}

	public void practice2() {
		//�Է¹��� �ϳ��� ������ �����"�����",
		//����� �ƴ� ��� �߿��� 0�̸�"0�̴�", 0�� �ƴϸ� "������" ����ϱ�
		System.out.print("���� : ");
		int su2=sc.nextInt();
		System.out.println(su2>0?"�����":(su2==0?"0�̴�":"������"));
	}
	
	public void practice3() {
		//�Է¹��� �ϳ��� ������ ¦���̸� "¦����", �ƴϸ� "Ȧ����" ����ϱ�
		System.out.print("���� : ");
		int su3=sc.nextInt();
		System.out.println(su3%2==0?"¦����":"Ȧ����");
		
	}
	
	public void practice4() {
		//�ο� ���� ���� ������ �Է¹ް� 1�δ� �����ϰ� �������� ���� ������ 
		//�����ְ� ���� ���� ���� ����ϱ�
		System.out.print("�ο� �� : ");
		int su4=sc.nextInt();
		System.out.print("���� ���� : ");
		int su5=sc.nextInt();	
		System.out.println("1�δ� ���� ���� :"+su5/su4);
		System.out.println("���� ���� ���� :"+su5%su4);
	}
	
	public void practice5() {
		//�Է¹��� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϱ�
		//������ 'M'�̸� ���л�, �ƴϸ� ���л����� ����ϱ�
		System.out.print("�̸� : ");
		String name1=sc.nextLine();
		
		System.out.print("�г�(���ڸ�) :");
		int grade1=sc.nextInt();
		
		System.out.print("��(���ڸ�) :");
		int class1=sc.nextInt();
		
		System.out.print("��ȣ(���ڸ�) :");
		int su6=sc.nextInt();
		
		sc.nextLine();
		System.out.print("����(M/F) :");
		char gender1 = sc.nextLine().charAt(0)=='M'?'��':'��';
		
		System.out.print("���� :");
		double su7=sc.nextDouble();
		
		System.out.printf("%d�г� %d�� %d�� %s %s�л��� ������ %.2f�̴�.", 
				grade1, class1, su6, name1, gender1, su7);
		
	}
	
	public void practice6() {
		//���̸� �Է¹޾� ���(13�� ����),û�ҳ�(13�� �ʰ�~19�� ����),����(19�� �ʰ�)���� ����ϱ�
		
		System.out.print("���� : ");
		int age2 = sc.nextInt();
		System.out.println(age2<=13?"���":(age2>19?"����":"û�ҳ�"));
		
	}
	
	public void practice7() {
		//����,����,���� ������ �Է¹ް� �� ���� ���� �հ�� ���(�հ�/3.0) ���ϱ�
		//�� ���� ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� �� �հ�, �ƴϸ� ���а� ����ϱ�
		
		System.out.print("���� :");
		int su8 = sc.nextInt();
		System.out.print("���� :");
		int su9 = sc.nextInt();
		System.out.print("���� :");
		int su10 = sc.nextInt();
		int result1=su8+su9+su10;
		double result2=result1/3.0;
		System.out.println("�հ� :"+result1);
		System.out.println("��� :"+result2);
		System.out.println(su8>=40&&su9>=40&&su10>=40&&result1>=60?"�հ�":"���հ�");
		
	}
	
	public void practice8() {
		//�ֹι�ȣ�� �̿��Ͽ� �������� �������� �����Ͽ� ����ϱ�
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(-����) :");
		char su11 = sc.nextLine().charAt(7);
		System.out.println(su11==1?"����":"����");
		
	}
	
	public void practice9() {
		//���� �ΰ��� �Է¹޾� ���� ����(num1,num2)�� ����
		//�׸��� �� �ٸ� ������ �Է� �޾� �� ���� num1���ϰų� unm2�ʰ��̸� true�� ����ϰ� �ƴϸ� false�� ����ϱ�
		//��, num1�� num2���� �۾ƾ� ��
		
		System.out.print("����1 :");
		int num1 = sc.nextInt();
		System.out.print("����2 :");
		int num2 = sc.nextInt();
		System.out.print("�Է� :");
		int num3 = sc.nextInt();
		System.out.println(num2>num1&&(num1>=num3||num2<num3)?"true":"false");
	}
	
	public void practice10() {
		//3���� ���� �Է� �޾� ��� ������ true,�ƴϸ� false�� ����ϱ�
		
		System.out.print("�Է�1 :");
		int su12=sc.nextInt();
		System.out.print("�Է�2 :");
		int su13=sc.nextInt();
		System.out.print("�Է�3 :");
		int su14=sc.nextInt();
		System.out.println(su12==su13&&su13==su14?"true":"false");
	}
	
	public void practice11() {
		//A,B,C ����� ������ �Է¹ް� �� ����� ������ �μ�Ƽ�긦 ������ ������ ����Ͽ� ����ϱ�
		//�μ�Ƽ�� ���� �޿��� 3000���� �̻��̸� "3000�̻�", �̸��̸� "3000�̸�" ����ϱ�
		//A����� �μ�Ƽ��� 0.4, B����� �μ�Ƽ��� ������, C����� �μ�Ƽ��� 0.15
		
		System.out.print("A����� ���� :");
		int su15 = sc.nextInt();
		System.out.print("B����� ���� :");
		int su16 = sc.nextInt();
		System.out.print("C����� ���� :");
		int su17 = sc.nextInt();
		System.out.println("A����� ����/����+a :"+su15+"/"+su15*1.4);
		System.out.println(su15*0.4>3000?"3000�̻�":"3000�̸�");
		System.out.println("B����� ����/����+a :"+su16+"/"+su16*1.0);
		System.out.println(su16*0.4>3000?"3000�̻�":"3000�̸�");
		System.out.println("C����� ����/����+a :"+su17+"/"+su17*1.15);
		System.out.println(su17*0.4>3000?"3000�̻�":"3000�̸�");
	
	}
}
