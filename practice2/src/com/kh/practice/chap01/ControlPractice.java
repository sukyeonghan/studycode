package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		// ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ "00�޴��Դϴ�"��.
		//���� ��ȣ�� ������ "���α׷��� ����˴ϴ�"�� ����ϼ���
		//1. �Է�
		//2. ����
		//3. ��ȸ
		//4. ����
		//7. ����
		//�޴� ��ȣ�� �Է��ϼ��� : 
		//��ȸ �޴��Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ���");
		System.out.println("7. ����");

		System.out.print("�޴� ��ȣ�� �Է��ϼ��� :");
		int su1 = sc.nextInt(); 
		switch (su1) {
		case 1: System.out.println("�Է� �޴��Դϴ�."); break;
		case 2: System.out.println("���� �޴��Դϴ�."); break;
		case 3: System.out.println("��ȸ �޴��Դϴ�."); break;
		case 4: System.out.println("���� �޴��Դϴ�."); break;
		case 7: System.out.println("���α׷��� ����˴ϴ�."); 
		}
		
	}
		
	public void practice2() {
		//�Է� ���� ������ ����̸鼭 ¦���� ���� "¦����"�� ����ϰ�
		//¦���� �ƴϸ� "Ȧ����"�� ����ϼ���
		//����� �ƴϸ� "����� �Է����ּ���."�� ����ϼ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� :");
		int su2 = sc.nextInt();
		if (su2>0&&su2%2==0) { 
			System.out.println("¦����");
		} else if (su2%2==1) {
			System.out.println("Ȧ����");
		} else {
			System.out.println("����� �Է����ּ���");
		}
			
	}

	public void practice3() {
		//����, ����, ���� �� ������ ������ Ű����� �Է� �ް� �հ�, ���� ����ϰ�
		//�հ�� ����� �̿��Ͽ� �հ�/���հ��� ó���ϴ� ����� �����ϱ�
		//�հ� ���� : �� ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� ���
		//�հ����� ��� ���� �� ����ȭ �հ�, ���,"�����մϴ�, �հ��Դϴ�!"�� ����ϰ�
		//���հ��� ��쿡�� "���հ��Դϴ�."�� ����ϼ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int su3 = sc.nextInt();
		System.out.print("���� ���� : ");
		int su4 = sc.nextInt();
		System.out.print("���� ���� : ");
		int su5 = sc.nextInt();
		int result1 = su3+su4+su5;
		double result2 = (su3+su4+su5)/3.0;
		if (su3>=40&&su4>=40&&su5>=40&&result2>=60) {
			System.out.println("���� :" + su3);
			System.out.println("���� :" + su4);
			System.out.println("���� :" + su5);
			System.out.println("�հ� :" + result1);
			System.out.println("��� :" + result2);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	
	public void practice4() {
		//if������ �Ǿ��ִ� ��, ����, ����, �ܿ� ������ switch ������ �ٲٱ�
		//����1
		//1~12 ������ ���� �Է� : 8
		//8���� �����Դϴ�.
		//����2
		//1~12 ������ ���� �Է� : 
		//99���� �߸� �Էµ� ���Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 ������ ���� �Է� :");
		int su6 = sc.nextInt();
		switch (su6) {
		case 3: case 4: case 5:
			System.out.println(su6 + "���� ���Դϴ�."); break;
		case 6: case 7: case 8:
			System.out.println(su6 + "���� �����Դϴ�."); break;
		case 9: case 10: case 11:
			System.out.println(su6 + "���� �����Դϴ�."); break;
		case 12: case 1: case 2:
			System.out.println(su6 + "���� �ܿ��Դϴ�."); break;
		default : 
			System.out.println(su6 + "���� �߸� �Էµ� ���Դϴ�.");
		}
		
	}
	
	public void practice5() {
		//���̵�, ��й�ȣ�� ���صΰ� �α��� ��� �ۼ��ϱ�
		//�α��� ���� �� "�α��� ����"
		//���̵� Ʋ���� ��� "���̵� Ʋ�Ƚ��ϴ�."
		//��й�ȣ�� Ʋ���� ��� "��й�ȣ�� Ʋ�Ƚ��ϴ�." ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵� :");
		String id = sc.next();
		System.out.print("��й�ȣ :");
		String pw = sc.next();
		if (id.equals("myId")) {
			if (pw.equals("myPassword12")) {
			System.out.println("�α��� ����");
		} else {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�");
		}
		} else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
		
	}
	
	public void practice6() {
		//����ڿ��� ������, ȸ��, ��ȸ�� �� �ϳ��� �Է� �޾� �� ����� ���� �� �ִ� ������ ����ϱ�
		//��, �����ڴ� ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� ������
		//ȸ���� �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� ����
		//��ȸ���� �Խñ� ��ȸ�� ������
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String str1 = sc.nextLine();
		switch (str1) {
		case "������": {
			System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�,��� �㼺, �Խñ� ��ȸ"); break;
		} case "ȸ��":{
			System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�"); break;
		} case "��ȸ��":{
			System.out.println("�Խñ� ��ȸ"); 
		}
		
		}
	}
	
		public void practice7() {
			//Ű, �����Ը� double�� �Է� �ް� BMI������ ����Ͽ� ��� ����� ����
			//��ü��/����ü��/��ü��/���� ����ϱ�
			//BMI = ������/(Ű(m)*Ű(m))
			//BMI�� 18.5�̸��� ��� ��ü�� / 18.5�̻� 23�̸��� ��� ����ü��
			//BMI�� 23�̻� 25�̸��� ��� ��ü�� / 25�̻� 30�̸��� ��� ��
			//BMI�� 30�̻��� ��� �� ��
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Ű(m)�� �Է��� �ּ��� :");
			double m = sc.nextDouble();
			System.out.print("������(kg)�� �Է��� �ּ��� :");
			double kg = sc.nextDouble();
			double bmi = kg / ((m*m));
			System.out.println("BMI���� : " + bmi);
			if (18.5>bmi) {
				System.out.println("��ü��");
			} else if (23>bmi) {
				System.out.println("����ü��");
			} else if (25>bmi) {
				System.out.println("��ü��");
			} else if (30>bmi) {
				System.out.println("��");
			} else if (30>=bmi) {
					System.out.println("����");
			
		}		
	}
		
		public void practice8() {
			//�� ���� ������ ���� ��ȣ�� �Է� �޾� ���� ��ȣ�� ���� ���� ����� ����ϱ�
			//��, �ΰ� �� ���� ��� ����� ���� �۵��Ͽ�
			//���� ���� ��ȣ�� �Է����� �� "�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�." ����ϱ�
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�ǿ�����1 �Է� :");
			int su8 = sc.nextInt();
			System.out.print("�ǿ�����2 �Է� :");
			int su9 = sc.nextInt();
			System.out.print("�����ڸ� �Է�(+,-,*,/,%) :");
			char str8 = sc.next().charAt(0);
			if (su8>0 && su9 > 0) {
				if (str8 == '+') {
				System.out.println(su8 + "" + str8 + su9 + "=" + (su8+su9));
			}  if (str8 == '-') {
				System.out.println(su8 + "" + str8 + su9 + "=" + (su8-su9));
			} if (str8 == '*') {
				System.out.println(su8 + "" + str8 + su9 + "=" + su8*su9);
			} if (str8 == '/') {
				System.out.printf("%d %s %d = %.6f",su8,str8, su9, (float)su8/su9);
			} if (str8 == '%') {
				System.out.println(su8 + "" + str8 + su9 + "=" + su8%su9);
			} 
			
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}
		}
		
		public void practice9() {
			//�߰����, �⸻���, ��������, �⼮ȸ���� �Է��ϰ� Pass �Ǵ� Fail�� ����ϱ�
			//�� ������ �߰���� 20%, �⸻��� 30%, ���� 30%, �⼮ 20%�� �̷���� �ְ�
			//�� ��, �⼮ ������ �⼮ ȸ���� �� ���� ȸ�� 20ȸ �߿��� �⼮�� ���� ���� ���� ����ϱ�
			//70�� �̻��� ��� Pass, 70�� �̸��̰ų� ��ü ���ǿ� 30%�̻� �Ἦ �� Fail ����ϱ�
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�߰� ��� ���� :");
			double mi1 = sc.nextDouble()*0.2;
			System.out.print("�⸻ ��� ���� :");
			double fi1 = sc.nextInt()*0.3;
			System.out.print("���� ���� :");
			double hw1 = sc.nextInt()*0.3;
			System.out.print("�⼮ ȸ�� :");
			double me1 = sc.nextDouble();
			System.out.println("=============== ��� ===============");
			
			if(me1>14) { 
				System.out.println("�߰� ��� ����(20) :" + mi1);
				System.out.println("�⸻ ��� ����(30) :" + fi1);
				System.out.println("���� ����(30) :" + hw1);
				System.out.println("�⼮ ����(20) :" + me1);
				double result = mi1 + fi1 + hw1 + me1;
				System.out.println("���� :"+ result);
				if(result<70) {
					System.out.println("Fail [���� �̴�]");
				} else {
					System.out.println("PASS");
				}
			} else {
				System.out.println("Fail [�⼮ ȸ�� ���� ("+(int)me1+"/20)]");
			
		}
	
		}
		
		public void practice10() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("������ ����� �����ϼ���.");
			System.out.println("1. �޴� ���");
			System.out.println("2. ¦��/Ȧ��");
			System.out.println("3. �հ�/���հ�");
			System.out.println("4. ����");
			System.out.println("5. �α���");
			System.out.println("6. ���� Ȯ��");
			System.out.println("7. BMI");
			System.out.println("8. ����");
			System.out.println("9. P/F");
			
			System.out.print("���� :");
			int a = sc.nextInt();
			switch(a) {
			case 1: practice1();  break;
			case 2: practice2();  break;
			case 3: practice3();  break;
			case 4: practice4();  break;
			case 5: practice5();  break;
			case 6: practice6();  break;
			case 7: practice7();  break;
			case 8: practice8();  break;
			case 9: practice9();  
			} //���� Ŭ���� �ȿ� �����Ƿ� practice1();ó�� �޼ҵ� �̸� ���� ������
		}
}
