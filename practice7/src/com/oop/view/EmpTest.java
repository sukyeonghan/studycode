package com.oop.view;

import java.util.Scanner;

import com.oop.model.vo.DtoEmployee;

public class EmpTest {
	
	static DtoEmployee emp = new DtoEmployee();
	static Scanner sc = new Scanner(System.in);
	
	public static void mainMenu() {
	
		main:
		while(true) {
		System.out.println("****** ��� ���� ���� ���α׷� ******");
		System.out.println("1. �� ��� ���� �Է�");
		System.out.println("2. ��� ���� ����");
		System.out.println("3. ��� ���� ����");
		System.out.println("4. ��� ���� ���");
		System.out.println("9. ������");
		System.out.print("��ȣ �Է� : ");
		int menuNum = sc.nextInt();
				
		switch(menuNum) {
		case 1 : emp.empInput(); break;
		case 2 : modifyMenu(emp); break;
		case 3 : emp.delete(); break;
		case 4 : emp.empOutput(); break;
		case 9 : System.out.println("���α׷��� �����մϴ�."); break main;
			}
		}
	}
	
	public static void modifyMenu(DtoEmployee e) {
		
		System.out.println("**** ��� ���� ���� �޴� ****");
		System.out.println("1. �̸� ����");
		System.out.println("2. �޿� ����");
		System.out.println("3. �μ� ����");
		System.out.println("4. ���� ����");
		System.out.println("5. ���� �޴��� �̵�"); 
		
		System.out.print("��ȣ �Է� : ");
		int menuNum = sc.nextInt();		
		
		switch(menuNum) {
		case 1 : System.out.print("���ο� �̸� : ");
				String newName = sc.nextLine(); 
				emp.setNewName(newName); break;
		case 2 : System.out.print("���ο� �޿� : ");
				int newSalary = sc.nextInt();  
				emp.setSalary(newSalary);break;
		case 3 : System.out.print("���ο� �μ� : ");
				String newDept = sc.nextLine();  
				emp.setDept(newDept); break;
		case 4 : System.out.print("���ο� ���� : ");
				String newJob = sc.nextLine();  
				emp.setJob(newJob); break;
		case 5 : return; 
		}
		
	}
}
