package com.collection.practice.view;

import java.util.Scanner;

import com.collection.practice.controller.BookController;

public class BookMenu {
	
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();

	public void mainMenu() {
		
		System.out.println("== Welcome KH Library ==");
		
		while(true) {
			
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			
			main:
			switch(menu) {
			case 1 : insertBook(); break;
			case 2 : selectList(); break;
			case 3 : searchBook(); break;
			case 4 : deleteBook(); break;
			case 5 : ascBook(); break;
			case 9 : System.out.println("프로그램을 종료합니다"); break main;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); continue; 
			
			}
		
		}
	}
	
	public void insertBook() {
		
		System.out.println("===== 새 도서 추가 =====");
		System.out.println("책 정보를 입력해주세요.");
		
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어/ 4. 기타) : ");
		int category = sc.nextInt();
		System.out.println("가격 : ");
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
			System.out.println("성공적으로 출력하였습니다.");
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}
		
		
	}
	
	
}
