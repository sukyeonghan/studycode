package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.exception.CharCheckException;
import com.kh.practice.token.controller.CharacterController;

public class CharacterMenu {
	
	public void menu() {
		//����ڿ��� ���ڿ��� �Է� �޾� 
		CharacterController cc = new CharacterController();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		try {
			System.out.println(str+"�� ���Ե� ������ ���� : "+cc.countAlpha(str));//ȣ���� ������ ���� ó���ؾ� ��
		} catch(CharCheckException ch) {
			ch.printStackTrace();
		}
	}

}
