package com.condition.funtion;

import java.util.Scanner;

public class SwitchTest {
	
	public void basicSwitch() {
		//switch�� ����ϱ�
		//switch(����) { case �� : ó�� ���� break; case �� : ó������; ..... )
		//������ ����, Ư���� ���� ������ ���� ��, �޴��� �� ���
		//����񱳸� ��
		//������ ���� if���� switch �� �����ؼ� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ������(10��,20��,30��?)");
		int choice = sc.nextInt();
		switch(choice) {
		case 10 : System.out.println("����ռ��� 10��!"); break; 
			//���ͷ��� �����ش�-�ڷ����� �����ش�  
		case 20 : System.out.println("���� 20��!"); break;
		case 30 : System.out.println("���� �̷�� 30��"); break;
		}
		//���α׷� �޴� �����
		System.out.println("===== ���α׷� v0.1 =====");
		System.out.println("��. ����ȭ��");
		System.out.println("��. ȸ������");
		System.out.println("��. �α���");
		System.out.print("�Է� : ");
		char cho=sc.next().charAt(0);
		switch (cho) {
			case '��' : System.out.println("����ȭ������ �̵�...."); break;
			case '��' : System.out.println("==== ȸ������ ȭ�� ====");
					sc.hasNextLine();
					System.out.println("id :");
					String id=sc.nextLine();
					System.out.println("password :");
					String password=sc.nextLine(); break;
			case '��' : System.out.println("==== �α��� ====");
					sc.nextLine();
					System.out.print("id :");
					String id1=sc.nextLine();
					System.out.println("pw :");
					String pw1=sc.nextLine(); 
					if(id1.equals("admin")&&pw1.equals("1234")) {
					 System.out.println("�α��� ����");
					} else {
					 System.out.println("�α��� ����");
					}
					break;
					}
					
		
		//switch���� ���ڿ��� ������
		System.out.println("�����ϴ� ���� ����");
		sc.nextLine();
		String fruit = sc.nextLine();
		switch(fruit) {
		case "����" : System.out.println("�ÿ��� ���� ����"); break;
		case "���" : System.out.println("�� �Ծ� ��"); break;
		case "�θ���" : System.out.println("�̰� ��¥???"); break;
		case "������" : System.out.println("������ ������!!"); break;
		default : System.out.println("�ش��ϴ� ������ �����ϴ�!");
			//default�� ���� ����. �ش� �ȵǸ� �̰� ���
			//break ������ �ؿ� �͵� �� ����ع��� 
			//�������� break �Ƚᵵ ��
		}

		// switch������ �� 31��,30��,28��
		// �� ���� ���ڸ� ����ϴ� ���� �����ϱ�
		
		System.out.print("�� ��?(����) :");
		int month = sc.nextInt();
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31��"); break;
		case 4 : case 6 : case 9 : case 11 :
			System.out.println("30��"); break;
		case 2 : System.out.println("29��"); break;
		default : System.out.println("���� ���Դϴ�!");
		
		}
		
	}
}