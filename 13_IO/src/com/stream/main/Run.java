package com.stream.main;

import java.util.Scanner;

import com.streamTest.DataFile;
import com.streamTest.FileStreamTest;

public class Run {
	
	public static void main(String[] args) {
		
		FileStreamTest fst = new FileStreamTest();
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("메세지 입력 : ");
		//fst.outputStream(sc.nextLine()); //파일에 내용을 저장 -file save
		
		//fst.InputStreamTest(); //file에서 내용을 읽어오는 것 - file load
		
		//fst.writerTest();
		fst.readerTest();
		
		
		//데이터 저장하기
		
		new DataFile().savePerson();
		new DataFile().loadPerson();
		
	}

}
