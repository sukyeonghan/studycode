package com.network.controller;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPserver {
	
	public static void main(String[] args) throws UnknownHostException{
		
		//��Ʈ ���ϱ�
		int port = 8888; //8888�� �������ϱ�.port�������� �Դٰ�����
		
		//���̳��ּ�
		InetAddress address = InetAddress.getLocalHost();
		DatagramSocket socket = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new DatagramSocket(port);
			System.out.print("������ ������ �Է� : ");
			String msg = sc.nextLine();
			DatagramPacket packet = new DatagramPacket
					(msg.getBytes(), msg.getBytes().length, address, 9999); //9999���� ����
			//��Ŷ ����.���μ� ����- ������, ����, �ּ�,��Ʈ��ȣ
			//���� ��Ʈ�� ��
			socket.send(packet);
			
			//������ �ޱ�
			byte[] data = new byte[512];
			packet = new DatagramPacket(data, data.length);
			socket.receive(packet); //��Ŷ ������ ���̸� ���� ���� ������ �־���
			
			System.out.println(new String(packet.getData()));
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			socket.close();
		}
		
		
		
		
	}

}
