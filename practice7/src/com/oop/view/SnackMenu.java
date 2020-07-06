package com.oop.view;

import java.util.Scanner;

import com.oop.controller.SnackController;

public class SnackMenu {
	
	Scanner sc = new Scanner(System.in);
	SnackController scr = new SnackController(); 

	
	public void menu() {
		System.out.println("�������� �Է��ϼ���.");
		System.out.print("���� : ");
		String kind = sc.next();
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("�� : ");
		String flavor = sc.next();
		System.out.print("���� : ");
		int numOf = sc.nextInt();
		System.out.print("���� : ");
		int price = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println(scr.saveData(kind, name, flavor, numOf, price));
		
		System.out.print("������ ������ Ȯ���Ͻðڽ��ϱ�?(y/n) : ");
		char choice = sc.nextLine().charAt(0);
		if(choice == 'y') {
			System.out.println(scr.confirmData());
		} 
		
		
	}
}
