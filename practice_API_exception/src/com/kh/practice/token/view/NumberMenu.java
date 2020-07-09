package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.exception.NumRangeException;
import com.kh.practice.token.controller.NumberController;

public class NumberMenu {
	
	public void menu() {
		
		Scanner sc = new Scanner(System.in); 
		NumberController nc = new NumberController();
		
		System.out.print("���� 1 : ");
		int num1 = sc.nextInt();
		System.out.print("���� 2 : ");
		int num2 = sc.nextInt();
		
		
		try {
			
			System.out.println(num1+"��(��) "+num2+"�� ����ΰ�?" + nc.checkDouble(num1, num2));
			
		}catch(NumRangeException ne) {
			ne.printStackTrace();
		}
	}


}
