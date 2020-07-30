package com.network.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) {
	
		//client 구성하기
		//연결 요청할 서버의 포트!! 내 주소 아님
		int port = 8888;
		
		BufferedReader br = null;
		PrintWriter pw = null; //try 써야하니까 위에 선언
		
		Socket socket = null;
		
		try {
			//연결할 서버의 주소와 포트를 가지고 socket 생성
			socket = new Socket("172.30.1.47",port);
			
			if(socket!=null) { //널포인트에러 처리
				//연결 스트림 열기
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw = new PrintWriter(socket.getOutputStream());
				
				//서버에 보낼 문구 입력 기능 구성
				Scanner sc = new Scanner(System.in);
				System.out.println("대화 입력");
				
				do {
					//서버에 데이터를 전송
					String msg = sc.nextLine();
					pw.println(msg);
					pw.flush();//버퍼 비워줌
					
					if(msg.equals("exit")) {
						break;
					}
					
					//서버에서 온 데이터 확인
					System.out.println(br.readLine());
					
				} while(true);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		
		} finally {
			
			try {
				br.close();
				pw.close();
				socket.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
