package com.subio.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataInputOutput {
	
	public void dataOutputTest() {
		//���� ��Ʈ�� ����� ���� �ֽ�Ʈ���� ���� ������ �� ������Ʈ���� ������
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("character.dat");
			dos = new DataOutputStream(fos);
			Scanner sc = new Scanner(System.in);
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("���� : ");
			int age = sc.nextInt();
			
			dos.writeUTF(name);//�ڷ������� ���� �� �ִ�
			dos.writeInt(age);
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}finally {
			if(dos!=null) {//���� ��Ʈ���� ������ ��
			try {
				dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	}
	
	public void dataInputTest() {
		
		try(FileInputStream fis = new FileInputStream("character.dat");
				DataInputStream dis = new DataInputStream(fis);) {
					//data ������Ʈ������ �����͸� �о�� ���� ������ Ÿ�� ������� �о��
					//���⼭ ��Ʈ��, ��Ʈ ����
					String name = dis.readUTF();
					int age = dis.readInt();
					
					System.out.println("�̸� : "+name+", ���� : "+age);
					
				}catch(IOException e) {
					e.printStackTrace();
				}
	}
}
