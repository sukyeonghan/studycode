package com.io.main;

import java.util.Scanner;

import com.io.test.StreamTest;

public class Run {
	//사용자에게 메세지를 입력받고 (0 누를 때까지) 
	//그 메세지를 저장메소드에 전달하여 저장하기
	public static void main(String[] args) {
		//화면 출력, 값 입력
		StreamTest st = new StreamTest();
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("저장할 메세지 입력 : ");
		String msg ="";
		while(true) {
			String temp = sc.nextLine();
			if(temp.equals("0")) {
				break;
			}
			msg+=temp;
		}
		//여긴 RAM에서 움직임. 이걸 file에 보낸다! -> OutputStream,Writer
		//입력받은 값은 msg에 저장이 됨
		//이걸 Writer 보냄
		
		//파일명 유동적으로 만들어주기 위해 변수 씀
		//String result ="";
		System.out.print("파일명 : ");
		String fname = sc.nextLine();
		String result = new StreamTest().saveMsgData(msg,fname);
		System.out.println("실행결과 : "+result);
		
		//저장된 데이터 불러오기
		System.out.print("불러올 파일명 : ");
		//result = new StreamTest().loadMsgData();
		result = new StreamTest().loadMsgData(sc.nextLine());
		System.out.println(result);
		
		
	}
}
