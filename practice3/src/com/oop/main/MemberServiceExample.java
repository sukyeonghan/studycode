package com.oop.main;

import com.oop.model.vo.MemberService;

public class MemberServiceExample {
	public static void main(String[] args) {
	
		MemberService memberservice = new MemberService();
		boolean result = memberservice.login("hong","12345");
		
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberservice.logout("hong");
		} else {
			System.out.println("�α��ο� �����Ͽ����ϴ�.");
		}
		
	}
}
