package com.io.main;

import java.util.Scanner;

import com.io.test.StreamTest;

public class Run {
	//����ڿ��� �޼����� �Է¹ް� (0 ���� ������) 
	//�� �޼����� ����޼ҵ忡 �����Ͽ� �����ϱ�
	public static void main(String[] args) {
		//ȭ�� ���, �� �Է�
		StreamTest st = new StreamTest();
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("������ �޼��� �Է� : ");
		String msg ="";
		while(true) {
			String temp = sc.nextLine();
			if(temp.equals("0")) {
				break;
			}
			msg+=temp;
		}
		//���� RAM���� ������. �̰� file�� ������! -> OutputStream,Writer
		//�Է¹��� ���� msg�� ������ ��
		//�̰� Writer ����
		
		//���ϸ� ���������� ������ֱ� ���� ���� ��
		//String result ="";
		System.out.print("���ϸ� : ");
		String fname = sc.nextLine();
		String result = new StreamTest().saveMsgData(msg,fname);
		System.out.println("������ : "+result);
		
		//����� ������ �ҷ�����
		System.out.print("�ҷ��� ���ϸ� : ");
		//result = new StreamTest().loadMsgData();
		result = new StreamTest().loadMsgData(sc.nextLine());
		System.out.println(result);
		
		
	}
}
