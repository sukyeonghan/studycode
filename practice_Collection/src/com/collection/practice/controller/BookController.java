package com.collection.practice.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.collection.model.vo.Sports;
import com.collection.practice.model.vo.Book;

public class BookController {
	
	List bookList = new ArrayList();


	public BookController() {
		
		bookList.add(new Book("자바의 정석","남궁 성","기타",20000));
		bookList.add(new Book("쉽게 배우는 알고리즘","문병로","기타",15000));
		bookList.add(new Book("대화의 기술","강보람","인문",17500));
		bookList.add(new Book("암 정복기","박신우","의료",21000));
	}
	
	public void insertBook(Book bk) {
		//전달받은 bk를  bookList에 추가
		bookList.add(bk);
	}
	
	public ArrayList selectList() {
		//해당  bookList의 주소 값 반환
		return (ArrayList) bookList;
	}
	
	public ArrayList searchBook(String keyword) {
		//검색 결과 리스트를 담아줄 리스트 선언 및 생성
		//반복문을 통해 list의 책 중 책이름에 전달 받은 keyword가 포함되어 있는 경우
		//serchList에 해당 책 추가하고 serchList반환
		
		ArrayList searchList = new ArrayList();
		
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i) instanceof Book) {
				Book b = (Book)bookList.get(i);
				if(b.getTitle().equals(keyword)) {
					searchList.add(b);
				}
			}
		}
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		//삭제된 도서를 담을 book객체 선언 및 null로 초기화
		//반복문을 통해bookList의 책 중 책타이틀명이 전달받은 title과 동일하고
		//저자 명이 전달 받은 author명과 동일한 경우 해당 인덱스 도서 삭제 후 빠져나감
		//해당 인덱스 도서를 removebook에 대입 후 반환
		
		Book removeBook = new Book();
		removeBook=null;
		
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i) instanceof Book) {
				Book b = (Book)bookList.get(i);
				if(b.getTitle().equals(title)&&
						b.getAuthor().equals(author)) {
						bookList.remove(i); break;
				}
			}
			removeBook = new Book();
			for(Object o : )
		}
		
	}
	
	public int ascBook() {
		//책 이름으로 오름차순 후 1반환
		
		Collections.sort(bookList);
		return 1;
		
	}
	
	
}
