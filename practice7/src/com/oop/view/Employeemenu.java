package com.oop.view;

import java.util.Scanner;

import com.oop.controller.EmployeeController;

public class EmployeeMenu {
	
	Scanner  sc = new Scanner(System.in);
	EmployeeController ec = new EmployeeController();

	public void EmployeeMenu() {
		
		main:
		while(true) {	
		System.out.println("1. ��� �߰�");
		System.out.println("2. ��� ����");
		System.out.println("3. ��� ����");
		System.out.println("4. ��� ���");
		System.out.println("9. ���α׷� ����");
		System.out.println("�޴� ��ȣ�� �������� : ");
		
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1 : insertEmp(); break;
		case 2 : updateEmp(); break;
		case 3 : deleteEmp(); break;
		case 4 : printEmp(); break;
		case 9 : System.out.println("���α׷��� �����մϴ�."); break main; 
		default : System.out.println("��ȣ�� �߸� �Է��߽��ϴ�."); continue;
		}
		}
	}
	
	public void insertEmp() {
		System.out.println("��� ��ȣ : ");
		int empNo = sc.nextInt();
		System.out.println("��� �̸� : ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("��� ���� : ");
		char gender = sc.nextLine().charAt(0);
		System.out.println("��ȭ ��ȣ : ");
		String phone = sc.nextLine();
		
		
		System.out.println("�߰� ������ �� �Է��Ͻðڽ��ϴ�?(y/n) : ");
		
		char b = sc.nextLine().charAt(0);
		if(b =='y') {
			System.out.println("��� �μ� : ");
			String dept = sc.nextLine();
			System.out.println("��� ���� : ");
			int salary = sc.nextInt();
			System.out.println("���ʽ��� : ");
			double bonus = sc.nextDouble();
			ec.add(empNo, name, gender, phone, dept, salary, bonus);
		} else if(b =='n') {
			ec.add(empNo, name, gender, phone);
		}
		
	}
	
	public void updateEmp() {
		System.out.println("���� �ֽ��� ��� ������ �����ϰ� �˴ϴ�. \n ����� � ������ �����Ͻðڽ��ϱ�?");
		System.out.println("1. ��ȭ ��ȣ");
		System.out.println("2. ��� ����");
		System.out.println("3. ���ʽ���");
		System.out.println("9. ���ư���");
		
		System.out.println("�޴� ��ȣ�� �������� : ");
		int menuNum = sc.nextInt();
		sc.nextLine();
		
		switch(menuNum) {
		case 1 : System.out.print("������ ��ȭ ��ȣ : ");
				String phone = sc.nextLine();
				ec.modify(phone); break;
		case 2 : System.out.print("������ ��� ���� : ");
				int salary = sc.nextInt();
				ec.modify(salary);
		case 3 : System.out.print("������ ���ʽ��� : ");
				double bonus = sc.nextDouble();
				ec.modify(bonus);
		case 9 :System.out.println("���θ޴��� ���ư��ϴ�."); return;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); return;
		}
		
	}
	
	public void deleteEmp() {
		System.out.println("���� �����Ͻðڽ��ϱ�?(y/n)");
		sc.nextLine();
		char b = sc.nextLine().charAt(0);
		if(b=='y') {
			ec.remove();
			System.out.println("������ ������ �����Ͽ����ϴ�.");
		} else {
			System.out.println("������ ������ �����Ͽ����ϴ�.");
		}
		
		
	}
	
	public void printEmp() {
		
		
		if(ec.inform()==null) {
			System.out.println("��� �����Ͱ� �����ϴ�.");
		} else {
			System.out.println(ec.inform());
		}
	}

}
