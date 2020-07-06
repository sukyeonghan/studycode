package co.kh.practice.chap01_poly.view;

import java.util.Scanner;

import co.kh.practice.chap01_poly.controller.LibraryController;
import co.kh.practice.chap01_poly.model.vo.AniBook;
import co.kh.practice.chap01_poly.model.vo.Book;
import co.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	
	LibraryController ic = new LibraryController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		
//		Member mem = new Member();
//		mem.setName(name);
//		mem.setAge(age);
//		mem.setGender(gender); 
//		ic.insertMember(mem);
		ic.insertMember(new Member(name,age,gender));
		System.out.println();
		
		main:
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조희");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1 : System.out.println(ic.myInfo()); break;
			case 2 : selectAll(); break;
			case 3 : searchBook(); break;
			case 4 : rentBook(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); break main;
			
			}
		}
		
	}
	
	public void selectAll() {
		//도서 전체 목록 출력 
		
		Book[] bList = ic.seletcAll();
		for(int i=0; i<bList.length; i++) {
				System.out.println(i+ "번 도서 : " +bList[i]);
			}
			
	}
	
	public void searchBook() {
		//검색할 제목 키워드를 입력받아 검색 결과를 출력
		sc.nextLine();
		
		System.out.print("검색할 제목 키워드: ");
		String keyword = sc.nextLine();
		
		Book[] bb = ic.searchBook(keyword);
		
		for(int i=0; i<bb.length; i++) {
			if(bb[i]==null) {
				continue;
			}
			System.out.println(bb[i]);
		}
		
		
	}
	
	public void rentBook() {
		//대여할 도서 인덱스를 입력받아 LibraryController의 rentBook메소드로 전달
		//결과값을 result로 받아 0일  경우,1일 경우,2일 경우 각각 해당하는 출력문 출력
		
		selectAll();
		
		System.out.print("대여할 도서 번호 입력 : ");
		int index = sc.nextInt();
		
		int result = ic.rentBook(index);
		
		if(result == 1) {
			System.out.println("나이 제한으로 대여 불가능합니다.");
		} else if (result==2) {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
		} else {
			System.out.println("성공적으로 대여되었습니다.");
		}
		
	}

}
