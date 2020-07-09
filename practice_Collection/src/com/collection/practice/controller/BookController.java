package com.collection.practice.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.collection.model.vo.Sports;
import com.collection.practice.model.vo.Book;

public class BookController {
	
	List bookList = new ArrayList();


	public BookController() {
		
		bookList.add(new Book("�ڹ��� ����","���� ��","��Ÿ",20000));
		bookList.add(new Book("���� ���� �˰���","������","��Ÿ",15000));
		bookList.add(new Book("��ȭ�� ���","������","�ι�",17500));
		bookList.add(new Book("�� ������","�ڽſ�","�Ƿ�",21000));
	}
	
	public void insertBook(Book bk) {
		//���޹��� bk��  bookList�� �߰�
		bookList.add(bk);
	}
	
	public ArrayList selectList() {
		//�ش�  bookList�� �ּ� �� ��ȯ
		return (ArrayList) bookList;
	}
	
	public ArrayList searchBook(String keyword) {
		//�˻� ��� ����Ʈ�� ����� ����Ʈ ���� �� ����
		//�ݺ����� ���� list�� å �� å�̸��� ���� ���� keyword�� ���ԵǾ� �ִ� ���
		//serchList�� �ش� å �߰��ϰ� serchList��ȯ
		
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
		//������ ������ ���� book��ü ���� �� null�� �ʱ�ȭ
		//�ݺ����� ����bookList�� å �� åŸ��Ʋ���� ���޹��� title�� �����ϰ�
		//���� ���� ���� ���� author��� ������ ��� �ش� �ε��� ���� ���� �� ��������
		//�ش� �ε��� ������ removebook�� ���� �� ��ȯ
		
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
		//å �̸����� �������� �� 1��ȯ
		
		Collections.sort(bookList);
		return 1;
		
	}
	
	
}
