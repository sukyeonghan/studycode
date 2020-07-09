package com.collection.practice.view;

import java.util.Scanner;

import com.collection.practice.controller.BookController;

public class BookMenu {
	
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();

	public void mainMenu() {
		
		System.out.println("== Welcome KH Library ==");
		
		while(true) {
			
			System.out.println("******* ���� �޴� *******");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻� ��ȸ");
			System.out.println("4. ���� ����");
			System.out.println("5. ���� �� �������� ����");
			System.out.println("9. ����");
			System.out.print("�޴� ��ȣ ���� : ");
			int menu = sc.nextInt();
			
			main:
			switch(menu) {
			case 1 : insertBook(); break;
			case 2 : selectList(); break;
			case 3 : searchBook(); break;
			case 4 : deleteBook(); break;
			case 5 : ascBook(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�"); break main;
			default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���."); continue; 
			
			}
		
		}
	}
	
	public void insertBook() {
		
		System.out.println("===== �� ���� �߰� =====");
		System.out.println("å ������ �Է����ּ���.");
		
		System.out.print("������ : ");
		String title = sc.nextLine();
		System.out.print("���ڸ� : ");
		String author = sc.nextLine();
		System.out.print("�帣(1. �ι� / 2. ���� / 3. �ܱ���/ 4. ��Ÿ) : ");
		int category = sc.nextInt();
		System.out.println("���� : ");
		int price = sc.nextInt();
		
		
		
		
	}
	
	public void selectList() {
		
	}
	
	public void searchBook() {
		
	}
	
	public void deleteBook() {
		
		
	}
	
	public void ascBook() {
		
		if(bc.ascBook()==1) {
			System.out.println("���������� ����Ͽ����ϴ�.");
		} else {
			System.out.println("���Ŀ� �����Ͽ����ϴ�.");
		}
		
		
	}
	
	
}
