package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		// TODO Auto-generated constructor stub
	}
	
	public String afterToken(String str) {
		//���⸦ ���� ���ڿ� ��ȯ
		StringTokenizer st = new StringTokenizer(str," ");
		str="";
		while(st.hasMoreTokens()) {
			str+=st.nextToken();
		}
		return str;
			
	}
	
	public String firstCap(String input) {
		//ù ���ڸ� �빮�ڷ� �ٲ� ���ڿ� ��ȯ
		
		 return  input.substring(0,1).toUpperCase()+input.substring(1);
		 
		
	}
	
	public int findChar(String input, char one) {
		//���ڿ� �ȿ� ã�� ���� ������ �� �� �� �ִ��� ��ȯ
		int count = 0;
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)==one) {
				count++;
			}
		}
		return count;
	}

}
