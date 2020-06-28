package com.oop.main;

import com.oop.model.vo.MemberService;

public class MemberServiceExample {
	public static void main(String[] args) {
	
		MemberService memberservice = new MemberService();
		boolean result = memberservice.login("hong","12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberservice.logout("hong");
		} else {
			System.out.println("로그인에 실패하였습니다.");
		}
		
	}
}
