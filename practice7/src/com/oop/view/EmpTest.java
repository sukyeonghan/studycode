package com.oop.view;

import java.util.Scanner;

import com.oop.model.vo.DtoEmployee;

public class EmpTest {
	
	static DtoEmployee emp = new DtoEmployee();
	static Scanner sc = new Scanner(System.in);
	
	public static void mainMenu() {
	
		main:
		while(true) {
		System.out.println("****** 사원 정보 관리 프로그램 ******");
		System.out.println("1. 새 사원 정보 입력");
		System.out.println("2. 사원 정보 수정");
		System.out.println("3. 사원 정보 삭제");
		System.out.println("4. 사원 정보 출력");
		System.out.println("9. 끝내기");
		System.out.print("번호 입력 : ");
		int menuNum = sc.nextInt();
				
		switch(menuNum) {
		case 1 : emp.empInput(); break;
		case 2 : modifyMenu(emp); break;
		case 3 : emp.delete(); break;
		case 4 : emp.empOutput(); break;
		case 9 : System.out.println("프로그램을 종료합니다."); break main;
			}
		}
	}
	
	public static void modifyMenu(DtoEmployee e) {
		
		System.out.println("**** 사원 정보 수정 메뉴 ****");
		System.out.println("1. 이름 변경");
		System.out.println("2. 급여 변경");
		System.out.println("3. 부서 변경");
		System.out.println("4. 직급 변경");
		System.out.println("5. 이전 메뉴로 이동"); 
		
		System.out.print("번호 입력 : ");
		int menuNum = sc.nextInt();		
		
		switch(menuNum) {
		case 1 : System.out.print("새로운 이름 : ");
				String newName = sc.nextLine(); 
				emp.setNewName(newName); break;
		case 2 : System.out.print("새로운 급여 : ");
				int newSalary = sc.nextInt();  
				emp.setSalary(newSalary);break;
		case 3 : System.out.print("새로운 부서 : ");
				String newDept = sc.nextLine();  
				emp.setDept(newDept); break;
		case 4 : System.out.print("새로운 직급 : ");
				String newJob = sc.nextLine();  
				emp.setJob(newJob); break;
		case 5 : return; 
		}
		
	}
}
