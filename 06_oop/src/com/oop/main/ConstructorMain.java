package com.oop.main;

import com.oop.model.vo.CommunityBoard;
import com.oop.model.vo.CommunityMember;
import com.oop.model.vo.Member;

public class ConstructorMain {

	public static void main(String[] args) { //main+ctrl+space+enter
		//객체 생성
		Member m =new Member();//기본데이터가 변수 대입 -> 기본생성자를 호출(실행)
		
		m.setMemberId("admin");
		m.setMemberPw("1234");
		m.setName("유병승");
		m.setPhone("01036446259");
		m.setPersonNo("010224-1234567");
		System.out.println(m.getMemberNo()+" "+m.getMemberId()+" "+
		m.getMemberPw()+" " + m.getName()+" "+m.getPhone()+ " "+m.getPersonNo());
	
		//매개변수 있는 생성자 이용
		//순서대로 Member클래스에 (String 5개에) 각각 들어감
		//생성과 동시에 초기화
		Member m2 = new Member("user01","4444","이세현",
				"01012341234","94042612341");
	
		System.out.println(m2.getMemberNo()+" "+m2.getMemberId()+" "+
				m2.getMemberPw()+" " + m2.getName()+" "+m2.getPhone()+ 
				" "+m2.getPersonNo());
		
		//일부만 초기화하는 생성자 이용
		Member m3=new Member("user02", "0987");
		System.out.println(m3.getMemberNo()+" "+m3.getMemberId()+" "+
				m3.getMemberPw()+" " + m3.getName()+" "+m3.getPhone()+ 
				" "+m3.getPersonNo());
		
	}
}
