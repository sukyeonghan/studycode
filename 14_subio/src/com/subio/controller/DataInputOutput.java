package com.subio.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataInputOutput {
	
	public void dataOutputTest() {
		//보조 스트림 사용할 때는 주스트림을 먼저 생성한 후 보조스트림을 생성함
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("character.dat");
			dos = new DataOutputStream(fos);
			Scanner sc = new Scanner(System.in);
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			dos.writeUTF(name);//자료형별로 넣을 수 있다
			dos.writeInt(age);
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}finally {
			if(dos!=null) {//보조 스트림만 닫으면 됨
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
					//data 보조스트림에서 데이터를 읽어올 때는 저장한 타입 순서대로 읽어옴
					//여기서 스트링, 인트 순서
					String name = dis.readUTF();
					int age = dis.readInt();
					
					System.out.println("이름 : "+name+", 나이 : "+age);
					
				}catch(IOException e) {
					e.printStackTrace();
				}
	}
}
