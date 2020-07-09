package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		// TODO Auto-generated constructor stub
	}
	
	public String afterToken(String str) {
		//띄어쓰기를 없앤 문자열 반환
		StringTokenizer st = new StringTokenizer(str," ");
		str="";
		while(st.hasMoreTokens()) {
			str+=st.nextToken();
		}
		return str;
			
	}
	
	public String firstCap(String input) {
		//첫 글자만 대문자로 바꾼 문자열 반환
		
		 return  input.substring(0,1).toUpperCase()+input.substring(1);
		 
		
	}
	
	public int findChar(String input, char one) {
		//문자열 안에 찾을 문자 개수가 몇 개 들어가 있는지 반환
		int count = 0;
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)==one) {
				count++;
			}
		}
		return count;
	}

}
