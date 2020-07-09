package com.kh.practice.token.controller;

import com.kh.practice.exception.NumRangeException;

public class NumberController {
	
	public NumberController() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean checkDouble(int num1,int num2) throws NumRangeException {
		//�Ű������� ���� ���� 1~100������ �� 
		//num1�� num2�� ����� true, �ƴϸ� false ��ȯ
		//1~100���̰� �ƴ϶�� NumRangeException �߻�
		if(1<=num1 && num1<=100 && 1<=num2 && num2<=100) {
			if(num1%num2==0) {
				return true;
			} 
			
		}
		if(!(1<=num1 && num1<=100)||!(1<=num2 && num2<=100)) 
			throw new NumRangeException("1���� 100������ ���� �ƴմϴ�."); 
		return false;
	}
	

}
