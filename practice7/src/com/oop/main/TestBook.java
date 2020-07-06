package com.oop.main;

import com.oop.model.vo.Book;

public class TestBook {
	
	public static void main(String[] args) {
		
		Book book1 = new Book();
		Book book2 = new Book("뇌를 자극하는 JAVA",20000,0.2,"김윤영");
		
		book1.bookInformation();
		book2.bookInformation();
		
		book1.setTitle("자바의 정석");
		book1.setPrice(35000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("윤상섭");
		book1.bookInformation();
		System.out.println();
		
		System.out.println("도서명 : "+book1.getTitle());
		System.out.println("할인 가격 : "+sale(book1.getPrice(),book1.getDiscountRate()));
		System.out.println("도서명 : "+book2.getTitle());
		System.out.println("할인 가격 : "+sale(book2.getPrice(),book2.getDiscountRate()));
	}

	public static int sale(int a, double b) {
		int result = a-(int)(a*b);
		return result;
	}
}
