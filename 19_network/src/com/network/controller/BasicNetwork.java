package com.network.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class BasicNetwork {
	
	public static void main(String[] args) throws UnknownHostException{
		//InetAddress�̿��غ���
		
		InetAddress localIp = InetAddress.getLocalHost(); 
		
		//�̰� �� ����! ������ ������ �� �̰ɷ� �ϸ� �ȵȴ�..
		
		System.out.println(localIp.getHostAddress());//�� ������ �ּ�
		System.out.println(localIp.getHostName()); // �� ��ǻ�� �̸�
		
		InetAddress naver = InetAddress.getByName("www.naver.com");
		//������ ������ �������� ������
		System.out.println(naver.getHostAddress());
		System.out.println(naver.getHostName());
	}

}
