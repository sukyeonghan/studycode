package com.network.controller;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPClient {

	public static void main(String[] args) throws UnknownHostException{
	
		//포트 정하기
		int port = 9999;
		
		//아이넷주소
		InetAddress address = InetAddress.getLocalHost();
		DatagramSocket socket = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new DatagramSocket(port);
			System.out.print("전송할 데이터 입력 : ");
			String msg = sc.nextLine();
			DatagramPacket packet = new DatagramPacket
					(msg.getBytes(),msg.getBytes().length, address, 8888);
			//패킷 생성.감싸서 보냄- 데이터, 길이, 주소,포트번호
			//따로 포트를 염
			socket.send(packet);
			
			//데이터 받기
			byte[] data = new byte[512];
			packet = new DatagramPacket(data, data.length);
			socket.receive(packet); //패킷 데이터 길이를 보고 여기 데이터 넣어줌
			
			System.out.println(new String(packet.getData()));
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			socket.close();
		}
		
		
		
		
	}
	
}
