package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.exception.CharCheckException;
import com.kh.practice.token.controller.CharacterController;

public class CharacterMenu {
	
	public void menu() {
		//사용자에게 문자열을 입력 받아 
		CharacterController cc = new CharacterController();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		try {
			System.out.println(str+"에 포함된 영문자 개수 : "+cc.countAlpha(str));//호출한 곳에서 예외 처리해야 함
		} catch(CharCheckException ch) {
			ch.printStackTrace();
		}
	}

}
