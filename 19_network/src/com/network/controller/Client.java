package com.network.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) {
	
		//client �����ϱ�
		//���� ��û�� ������ ��Ʈ!! �� �ּ� �ƴ�
		int port = 8888;
		
		BufferedReader br = null;
		PrintWriter pw = null; //try ����ϴϱ� ���� ����
		
		Socket socket = null;
		
		try {
			//������ ������ �ּҿ� ��Ʈ�� ������ socket ����
			socket = new Socket("172.30.1.47",port);
			
			if(socket!=null) { //������Ʈ���� ó��
				//���� ��Ʈ�� ����
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw = new PrintWriter(socket.getOutputStream());
				
				//������ ���� ���� �Է� ��� ����
				Scanner sc = new Scanner(System.in);
				System.out.println("��ȭ �Է�");
				
				do {
					//������ �����͸� ����
					String msg = sc.nextLine();
					pw.println(msg);
					pw.flush();//���� �����
					
					if(msg.equals("exit")) {
						break;
					}
					
					//�������� �� ������ Ȯ��
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
