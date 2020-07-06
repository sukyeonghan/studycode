package com.filetest;

import java.io.File;
import java.io.IOException;

public class FileTest {
	
	public static void main(String[] args) {
		//자바에서 파일을 다뤄보자
		File f = new File("test.txt"); //뒤에 파일명 적어야 함. 파일명으로 된 ram에 객체 생성
		//파일 객체를 만들 때 경로까지 추가해서 생성할 수 있음(추가 안하면 디폴트 폴더-프로젝트 파일 안)
		//f = new File("c:/Users/han sujin/test/a/test.txt");
		
		//저장할 폴더 만든 후 넣어야 함. 없는 폴더에 넣으면 오류남
		// ->자바에서 폴더를 생성하고 파일 생성하면 됨 : mkdir,mkdirs(여러 개 동시 생성)
		File dir = new File("c:/Users/han sujin/");
		if(!dir.exists()) System.out.println(dir.mkdirs());
		//-> 없으면 true뜨면서 폴더생성 
		//if문에 라인 하나만 실행 시 {} 안써도 됨
		
		try {
			if(!f.exists()) {
				f.createNewFile();//파일 만들기
			}
			
		} catch(IOException e) {
			
			e.printStackTrace();//IO프로젝트 파일 안에 생김. 콘솔에는 출력 안됨.
			
		} 
		
		System.out.println("파일의 크기 : "+f.length());
		System.out.println("경로 확인 : "+f.getAbsolutePath());
		
		for(String file : dir.list()) {//파일 목록을 String배열로 리턴
		
			System.out.println("파일들 확인하기 : "+file);
		}
		
	}

}
