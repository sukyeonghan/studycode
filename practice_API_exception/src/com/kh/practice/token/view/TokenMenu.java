package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	
	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("1. ���� ���ڿ�");
			System.out.println("2. �Է� ���ڿ�");
			System.out.println("3. ���α׷� ������");
			System.out.print("�޴� ��ȣ : ");
			int num = sc.nextInt();
			
			switch (num) {
			case 1 : tokenMenu(); break;
			case 2 : inputMenu(); break;
			case 3 : System.out.println("���α׷��� �����մϴ�."); return;
			}
		
		}
		
	}
	
	public void tokenMenu() {
		//��ū ó�� �� ����,���� ���
		//��ū ó�� �� ����, ����, ��� �빮�ڷ� ��ȯ �� �� ���
		
		String str ="J a v a P r o g r a m";
		System.out.println("��ū ó�� �� ���� : "+str);
		System.out.println("��ū ó�� �� ���� : "+str.length());
		System.out.println("��ū ó�� �� ���� : "+tc.afterToken(str));
		System.out.println("��ū ó�� �� ���� : "+tc.afterToken(str).length());
		System.out.println("��� �빮�ڷ� ��ȯ : "+tc.afterToken(str).toUpperCase());
	}
	
	public void inputMenu( ) {
		
		sc.nextLine();
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		System.out.println("ù ���� �빮�� : "+tc.firstCap(str));
		System.out.print("ã�� ���� �ϳ��� �Է��ϼ��� : ");
		char one = sc.nextLine().charAt(0);
		System.out.println(one+"���ڰ� ������ : "+tc.findChar(str,one));
	}
}
