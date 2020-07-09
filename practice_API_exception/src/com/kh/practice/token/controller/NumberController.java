package com.kh.practice.token.controller;

import com.kh.practice.exception.NumRangeException;

public class NumberController {
	
	public NumberController() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean checkDouble(int num1,int num2) throws NumRangeException {
		//매개변수로 들어온 값이 1~100사이일 때 
		//num1이 num2의 배수면 true, 아니면 false 반환
		//1~100사이가 아니라면 NumRangeException 발생
		if(1<=num1 && num1<=100 && 1<=num2 && num2<=100) {
			if(num1%num2==0) {
				return true;
			} 
			
		}
		if(!(1<=num1 && num1<=100)||!(1<=num2 && num2<=100)) 
			throw new NumRangeException("1부터 100사이의 값이 아닙니다."); 
		return false;
	}
	

}
