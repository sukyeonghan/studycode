package co.kh.practice.chap01_poly.controller;

import co.kh.practice.chap01_poly.model.vo.AniBook;
import co.kh.practice.chap01_poly.model.vo.Book;
import co.kh.practice.chap01_poly.model.vo.CookBook;
import co.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	
	private Member mem=null;
	private Book[] bList=new Book[5];
	
	{
		bList[0] = new CookBook("�������� ����","������","tvn",true);
		bList[1] = new AniBook("�ѹ� �� �ؿ�","��Ƽ","�����",19);
		bList[2] = new AniBook("������ ���ǽ�","����","japan",12);
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�","������","����",false);
		bList[4] = new CookBook("������ �� �����غ�","������","�ұ�å",true);
	}
	
	public void insertMember(Member mem2) {
		//���޹��� mem�� �ּҰ��� ���� LibraryController�� mem�� ����
		mem=mem2;
	}
	
	public Member myInfo() {
		//ȸ�� ���۷���(mem) �ּҰ� ����
		return mem;
		
	}
	
	public Book[] seletcAll() {
		//���� ��ü ���(bList) �ּҰ� ����
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		//���޹��� Ű���尡 ���Ե� ������ ���� �� ������ �� ������ 
		//�˻��� ������ ����� Book ��ü �迭�� ���� �����ϰ�
		//for���� ���� bList ���� ������� ���޹��� Ű���带 ���Ͽ�
		//�����ϰ� �ִ� ��� ���ο� �迭�� �������� ��� - �� �迭 �ּҰ� ����
		
		Book[] searchList = new Book[5];
		int count = 0;
		
		for(int i=0; i<bList.length; i++) {
			if(bList[i].getTitle().contains(keyword)) {
				searchList[count]=bList[i];
				count++;
			}
		} return searchList;	
	}
	
	public int rentBook(int index) {
		//result�� 0���� �ʱ�ȭ �� �� 
		//���޹��� �ε����� ������ ��ȭå�� ��� 
		//ȸ���� ���̿� �ش� ��ȭå�� ���� ���̸� ���Ͽ� ȸ�� ���̰� �� ������� result1�� �ʱ�ȭ
		//���޹��� �ε����� ������ �丮å�� ���
		//�ش� �丮å�� ���� ������ �� �� ��� ȸ���� couponCount�� 1���� ��Ų �� result�� 2�� �ʱ�ȭ
		//result����
		
		int result = 0;
		
		if(bList[index] instanceof AniBook) {
			if (mem.getAge()<((AniBook)bList[index]).getAcessAge()) {
				result = 1;
			} 
			
		} else if (bList[index] instanceof CookBook) {
				if(((CookBook)bList[index]).isCoupon()==true) {
					mem.setCouponCount(mem.getCouponCount()+1);
					result = 2;
			}
		}
		return result;
	}

}
