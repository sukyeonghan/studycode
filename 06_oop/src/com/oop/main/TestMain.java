package com.oop.main;

import com.oop.model.vo.CommunityMember;

public class TestMain {
	public static void main(String[] args) {
		
			//ȸ�� 3���� ������ �����ϴ� ��ü�� ����� ����ϱ�
			CommunityMember c = new CommunityMember();
			c.setComName("�Ѽ���");
			c.setComId("user01");
			c.setComPw("1234");
			c.setPoint(100.0);
			
			CommunityMember c1 = new CommunityMember("�Ѽ�","user02","1234");
			CommunityMember c2 = new CommunityMember("�̼���","user03","3444",10.2);
			
			System.out.println(c.getComName()+c.getComId()+c.getComPw()+c.getPoint());
			System.out.println(c1.getComName()+c1.getComId()+c1.getComPw()+c1.getPoint());
			System.out.println(c2.getComName()+c2.getComId()+c2.getComPw()+c2.getPoint());
		
	}
	
	
	

}