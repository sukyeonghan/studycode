package com.kh.practice.token.controller;

import com.kh.practice.exception.CharCheckException;

public class CharacterController {
	
	public CharacterController() {
		// TODO Auto-generated constructor stub
	}
	
	public int countAlpha(String s) throws CharCheckException {
		
		int count=0;
		
		for(int i=0; i<s.length(); i++ ) {
			if(('A'<= s.charAt(i) && s.charAt(i) <='Z')||
					('a'<=s.charAt(i) && s.charAt(i)<'z'))
				count++; 
			if((s.charAt(i))==' ') throw new CharCheckException("üũ�� ���ڿ� �ȿ� ������ ���ԵǾ� �ֽ��ϴ�.");
		}
		return count;
	} 
		
}
