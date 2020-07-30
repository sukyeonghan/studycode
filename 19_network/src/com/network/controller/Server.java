package com.network.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) throws IOException {
		//서버 생성하기
		//1.port번호를 선정하기/0~65535 중에 하나 정함 .2000~이후부터 주로 씀
		int port = 8888;
		
		//2.ServerSocket 생성하기-프로그램 연결하는 통로
		ServerSocket server = new ServerSocket(port);
		
		//3. server 동작 구성하기
		
		while(true) { //계속 돌아야 함 
			//3-1 client 요청대기
			Socket client = server.accept();
			
			//연결된 소켓을 이용하여 스트림열기
			InputStream clientInput = client.getInputStream();//클라이언트가 보낸 거 받기
			OutputStream clientOutput = client.getOutputStream();//클라이언트에게 보내기
			
			//성능향상을 위해 보조스트림 사용하기 //2개 보조스트림을 염. 바이트 단위로 보내면 오래 걸리니까 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(clientInput));
			//Reader일반 스트림을 문자화 / Buffered 속도를 올림
			PrintWriter pw = new PrintWriter(clientOutput); //콘솔에 찍어줌
		
			//클라이언트가 보낸 데이터 받기/객체, 문자, 데이터 등 보냄/ 단순서버는 한 방향. 스레드까지 연결할 수 있음
			
			while(true) {
				
				String msg = br.readLine();//보내는 거 하나씩 받음
				
				if(!msg.equals("exit")) {
					System.out.println(client.getInetAddress().getHostAddress()+" : "+msg);
					pw.println("보낸 메세지 수신 성공!"); //받으면 응답
					pw.flush(); //버퍼 비워줌
				} else {
					System.out.println("접속종료");
					break;
				}
			}
			
			//열린 스트림 닫기
			br.close();
			pw.close();
			client.close();
		
		}
		
		
	}
	

}
