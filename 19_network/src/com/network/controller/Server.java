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
		//���� �����ϱ�
		//1.port��ȣ�� �����ϱ�/0~65535 �߿� �ϳ� ���� .2000~���ĺ��� �ַ� ��
		int port = 8888;
		
		//2.ServerSocket �����ϱ�-���α׷� �����ϴ� ���
		ServerSocket server = new ServerSocket(port);
		
		//3. server ���� �����ϱ�
		
		while(true) { //��� ���ƾ� �� 
			//3-1 client ��û���
			Socket client = server.accept();
			
			//����� ������ �̿��Ͽ� ��Ʈ������
			InputStream clientInput = client.getInputStream();//Ŭ���̾�Ʈ�� ���� �� �ޱ�
			OutputStream clientOutput = client.getOutputStream();//Ŭ���̾�Ʈ���� ������
			
			//��������� ���� ������Ʈ�� ����ϱ� //2�� ������Ʈ���� ��. ����Ʈ ������ ������ ���� �ɸ��ϱ� ����
			BufferedReader br = new BufferedReader(new InputStreamReader(clientInput));
			//Reader�Ϲ� ��Ʈ���� ����ȭ / Buffered �ӵ��� �ø�
			PrintWriter pw = new PrintWriter(clientOutput); //�ֿܼ� �����
		
			//Ŭ���̾�Ʈ�� ���� ������ �ޱ�/��ü, ����, ������ �� ����/ �ܼ������� �� ����. ��������� ������ �� ����
			
			while(true) {
				
				String msg = br.readLine();//������ �� �ϳ��� ����
				
				if(!msg.equals("exit")) {
					System.out.println(client.getInetAddress().getHostAddress()+" : "+msg);
					pw.println("���� �޼��� ���� ����!"); //������ ����
					pw.flush(); //���� �����
				} else {
					System.out.println("��������");
					break;
				}
			}
			
			//���� ��Ʈ�� �ݱ�
			br.close();
			pw.close();
			client.close();
		
		}
		
		
	}
	

}
