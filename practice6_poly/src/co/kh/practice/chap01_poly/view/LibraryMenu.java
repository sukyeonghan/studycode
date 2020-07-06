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
		
		System.out.print("�̸� : ");
		String name = sc.next();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print("���� : ");
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
			System.out.println("==== �޴� ====");
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ����");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1 : System.out.println(ic.myInfo()); break;
			case 2 : selectAll(); break;
			case 3 : searchBook(); break;
			case 4 : rentBook(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); break main;
			
			}
		}
		
	}
	
	public void selectAll() {
		//���� ��ü ��� ��� 
		
		Book[] bList = ic.seletcAll();
		for(int i=0; i<bList.length; i++) {
				System.out.println(i+ "�� ���� : " +bList[i]);
			}
			
	}
	
	public void searchBook() {
		//�˻��� ���� Ű���带 �Է¹޾� �˻� ����� ���
		sc.nextLine();
		
		System.out.print("�˻��� ���� Ű����: ");
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
		//�뿩�� ���� �ε����� �Է¹޾� LibraryController�� rentBook�޼ҵ�� ����
		//������� result�� �޾� 0��  ���,1�� ���,2�� ��� ���� �ش��ϴ� ��¹� ���
		
		selectAll();
		
		System.out.print("�뿩�� ���� ��ȣ �Է� : ");
		int index = sc.nextInt();
		
		int result = ic.rentBook(index);
		
		if(result == 1) {
			System.out.println("���� �������� �뿩 �Ұ����մϴ�.");
		} else if (result==2) {
			System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���.");
		} else {
			System.out.println("���������� �뿩�Ǿ����ϴ�.");
		}
		
	}

}
