package com.oop.main;

import com.oop.model.vo.CommunityBoard;
import com.oop.model.vo.CommunityMember;
import com.oop.model.vo.Member;

public class ConstructorMain {

	public static void main(String[] args) { //main+ctrl+space+enter
		//��ü ����
		Member m =new Member();//�⺻�����Ͱ� ���� ���� -> �⺻�����ڸ� ȣ��(����)
		
		m.setMemberId("admin");
		m.setMemberPw("1234");
		m.setName("������");
		m.setPhone("01036446259");
		m.setPersonNo("010224-1234567");
		System.out.println(m.getMemberNo()+" "+m.getMemberId()+" "+
		m.getMemberPw()+" " + m.getName()+" "+m.getPhone()+ " "+m.getPersonNo());
	
		//�Ű����� �ִ� ������ �̿�
		//������� MemberŬ������ (String 5����) ���� ��
		//������ ���ÿ� �ʱ�ȭ
		Member m2 = new Member("user01","4444","�̼���",
				"01012341234","94042612341");
	
		System.out.println(m2.getMemberNo()+" "+m2.getMemberId()+" "+
				m2.getMemberPw()+" " + m2.getName()+" "+m2.getPhone()+ 
				" "+m2.getPersonNo());
		
		//�Ϻθ� �ʱ�ȭ�ϴ� ������ �̿�
		Member m3=new Member("user02", "0987");
		System.out.println(m3.getMemberNo()+" "+m3.getMemberId()+" "+
				m3.getMemberPw()+" " + m3.getName()+" "+m3.getPhone()+ 
				" "+m3.getPersonNo());
		
		
		CommunityMember com1 = new CommunityMember("�Ѽ���","tnrud","1234");
		CommunityMember com2 = new CommunityMember("�輼��","tpals","2345");
		CommunityMember com3 = new CommunityMember("������","wlgns","3456");
		
		CommunityBoard board1 = new CommunityBoard("��ý","�ȳ��ϼ���","�����ϼ���");
		CommunityBoard board2 = new CommunityBoard("üũ","����","������ ���ϴ�");
		CommunityBoard board3 = new CommunityBoard("üŰ���","�ȳ�","�����ض�");
		
	}
}