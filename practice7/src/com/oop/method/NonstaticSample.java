package com.oop.method;

public class NonstaticSample {
	
	
	public NonstaticSample() {
		// TODO Auto-generated constructor stub
	}
	
	public void printLottoNumbers() {
		int[] num = new int[6];
		for(int i=0; i<num.length; i++) {
			num[i] = (int)((Math.random()*45)+1);
			System.out.println(num[i]);
		}
		
	}
	
	public void outputChar(int a, char b) {
		for(int i=0; i<a; i++) {
			System.out.print(b);
		}
		
	}
	
	public char alphabette() {
		char c = (char)((Math.random()*26)+97);//임의의 영어 소문자 출력
		return c;
	}
	
	public String mySubsting(String str,int in1, int in2) {
		
		String result = str.substring(in1, in2);
		
		if(result!=null) {
			return result;
		} else {
			return null;
		}
		
	}

}
