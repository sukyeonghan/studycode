package com.stream.main;

import java.util.Scanner;

import com.streamTest.DataFile;
import com.streamTest.FileStreamTest;

public class Run {
	
	public static void main(String[] args) {
		
		FileStreamTest fst = new FileStreamTest();
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("�޼��� �Է� : ");
		//fst.outputStream(sc.nextLine()); //���Ͽ� ������ ���� -file save
		
		//fst.InputStreamTest(); //file���� ������ �о���� �� - file load
		
		//fst.writerTest();
		fst.readerTest();
		
		
		//������ �����ϱ�
		
		new DataFile().savePerson();
		new DataFile().loadPerson();
		
	}

}
