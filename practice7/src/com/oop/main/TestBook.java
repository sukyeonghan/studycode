package com.oop.main;

import com.oop.model.vo.Book;

public class TestBook {
	
	public static void main(String[] args) {
		
		Book book1 = new Book();
		Book book2 = new Book("���� �ڱ��ϴ� JAVA",20000,0.2,"������");
		
		book1.bookInformation();
		book2.bookInformation();
		
		book1.setTitle("�ڹ��� ����");
		book1.setPrice(35000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("����");
		book1.bookInformation();
		System.out.println();
		
		System.out.println("������ : "+book1.getTitle());
		System.out.println("���� ���� : "+sale(book1.getPrice(),book1.getDiscountRate()));
		System.out.println("������ : "+book2.getTitle());
		System.out.println("���� ���� : "+sale(book2.getPrice(),book2.getDiscountRate()));
	}

	public static int sale(int a, double b) {
		int result = a-(int)(a*b);
		return result;
	}
}
