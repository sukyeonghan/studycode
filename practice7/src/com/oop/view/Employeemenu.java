package com.oop.view;

import java.util.Scanner;

import com.oop.controller.EmployeeController;

public class EmployeeMenu {
	
	Scanner  sc = new Scanner(System.in);
	EmployeeController ec = new EmployeeController();

	public void EmployeeMenu() {
		
		main:
		while(true) {	
		System.out.println("1. 사원 추가");
		System.out.println("2. 사원 수정");
		System.out.println("3. 사원 삭제");
		System.out.println("4. 사원 출력");
		System.out.println("9. 프로그램 종료");
		System.out.println("메뉴 번호를 누르세요 : ");
		
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1 : insertEmp(); break;
		case 2 : updateEmp(); break;
		case 3 : deleteEmp(); break;
		case 4 : printEmp(); break;
		case 9 : System.out.println("프로그램을 종료합니다."); break main; 
		default : System.out.println("번호를 잘못 입력했습니다."); continue;
		}
		}
	}
	
	public void insertEmp() {
		System.out.println("사원 번호 : ");
		int empNo = sc.nextInt();
		System.out.println("사원 이름 : ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("사원 성별 : ");
		char gender = sc.nextLine().charAt(0);
		System.out.println("전화 번호 : ");
		String phone = sc.nextLine();
		
		
		System.out.println("추가 정보를 더 입력하시겠습니다?(y/n) : ");
		
		char b = sc.nextLine().charAt(0);
		if(b =='y') {
			System.out.println("사원 부서 : ");
			String dept = sc.nextLine();
			System.out.println("사원 연봉 : ");
			int salary = sc.nextInt();
			System.out.println("보너스율 : ");
			double bonus = sc.nextDouble();
			ec.add(empNo, name, gender, phone, dept, salary, bonus);
		} else if(b =='n') {
			ec.add(empNo, name, gender, phone);
		}
		
	}
	
	public void updateEmp() {
		System.out.println("가장 최신의 사원 정보를 수정하게 됩니다. \n 사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화 번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스율");
		System.out.println("9. 돌아가기");
		
		System.out.println("메뉴 번호를 누르세요 : ");
		int menuNum = sc.nextInt();
		sc.nextLine();
		
		switch(menuNum) {
		case 1 : System.out.print("수정할 전화 번호 : ");
				String phone = sc.nextLine();
				ec.modify(phone); break;
		case 2 : System.out.print("수정할 사원 연봉 : ");
				int salary = sc.nextInt();
				ec.modify(salary);
		case 3 : System.out.print("수정할 보너스율 : ");
				double bonus = sc.nextDouble();
				ec.modify(bonus);
		case 9 :System.out.println("메인메뉴로 돌아갑니다."); return;
		default : System.out.println("잘못 입력하셨습니다."); return;
		}
		
	}
	
	public void deleteEmp() {
		System.out.println("정말 삭제하시겠습니까?(y/n)");
		sc.nextLine();
		char b = sc.nextLine().charAt(0);
		if(b=='y') {
			ec.remove();
			System.out.println("데이터 삭제에 성공하였습니다.");
		} else {
			System.out.println("데이터 삭제에 실패하였습니다.");
		}
		
		
	}
	
	public void printEmp() {
		
		
		if(ec.inform()==null) {
			System.out.println("사원 데이터가 없습니다.");
		} else {
			System.out.println(ec.inform());
		}
	}

}
