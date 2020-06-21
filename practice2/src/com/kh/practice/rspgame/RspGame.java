package com.kh.practice.rspgame;

import java.util.Scanner;

public class RspGame {

	public static void main(String[] args) {
		//가위바위보 게임 만들기
		//주먹 가위 보를 입력받아서 비기면 한 번 더 돌고
		//한 명이 이기면 종료하기
		//게임 결과 출력하기 ---while true break
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 가위, 바위, 보 게임! ===");
		
		while(true) {
			
			System.out.println("1.가위 2.바위  3.보 (번호를 입력하세요)");
			int user = sc.nextInt();
			
			int com = (int)(Math.random()*3)+1;
	
			//출력 시 숫자가 아닌 "가위/바위/보"로 하고 싶어서 추가함 
			String userstr=intToStr(user);
			String comstr=intToStr(com);
			
			
//			if(com==1) {
//				comstr="가위";
//			} else if(com==2) {
//				comstr="바위";
//			} else {
//				comstr="보";
//			}
//			
//			if(user==1) {
//				userstr="가위";
//			} else if(user==2) {
//				userstr="바위";
//			} else {
//				userstr="보";
//			}
			
			System.out.println("컴퓨터 : "+comstr);
			System.out.println("사용자 : "+userstr);
			
			
			int game = user-com;
			
				if(game==-2||game==1) {
					System.out.println("사용자가 이겼습니다.");
					break;
				} else if(game==2||game==-1) {
					System.out.println("컴퓨터가 이겼습니다.");
					break;
				} else {
					System.out.println("비겼습니다. 다시 한 번,\n");
				}
			
			} 		
	}
	
	public static String intToStr(int num) {
		//로또 번호 자동 생성기 (중복값 없이 오름차순으로 정렬)프로그램 작성하기
		String str = "";
		
		switch (num) {
			case 1:
				str = "가위";
				break;
			case 2:
				str = "바위";
				break;
			case 3:
				str = "보";
		}
		return str;
	}

}
