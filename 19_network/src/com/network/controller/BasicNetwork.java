package com.network.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class BasicNetwork {
	
	public static void main(String[] args) throws UnknownHostException{
		//InetAddress이용해보자
		
		InetAddress localIp = InetAddress.getLocalHost(); 
		
		//이건 내 거임! 서버에 접속할 때 이걸로 하면 안된다..
		
		System.out.println(localIp.getHostAddress());//내 아이피 주소
		System.out.println(localIp.getHostName()); // 내 컴퓨터 이름
		
		InetAddress naver = InetAddress.getByName("www.naver.com");
		//도메인 네임을 기준으로 가져옴
		System.out.println(naver.getHostAddress());
		System.out.println(naver.getHostName());
	}

}
