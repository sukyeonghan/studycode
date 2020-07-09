package com.collection.controller;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	
	public void propertiesTest() {
		//Properties : key = value 형식으로 데이터를 저장하는 클래스
		//문자열 자료를 저장하는 클래스
		//key : String, value : String
		//가장 큰 장점! 파일과 연동하여 처리할 수 있음
		//-> 파일에 저장하고, 저장된 것을 가져올 수 있음
		//프로그램의 주요 설정파일, 환경데이터 등을 저장하고 불러올 때 많이 사용
		
		//생성해서 사용함
		Properties prop = new Properties();
		
		//객체에 데이터를 대입하기
		//SetProperty(key,value)메소드를 이용해서 대입
		
		prop.setProperty("name","설지노");
		prop.setProperty("age","29");
		
		//파일에 간편하게 저장할 수 있음
		//store(문자저장스트림)메소드 이용
//		try {
//			
//			prop.store(new FileWriter("prop.properties"), "사람");//주석 "사람"
//		
//		} catch(IOException e) {
//			
//			e.printStackTrace();
//		}
	

		//파일에 저장된 내용 불러오기
		//load(문자열 불러오는 스트림!)
		try { 
			prop.load(new FileReader("prop.properties"));
//			prop.load(new FileReader("myProp.properties"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//properties에 있는 값 출력하기
		//getProperty(키값);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("nickname"));//외부에서 저장
//		System.out.println(prop.getProperty("userId"));
//		System.out.println(prop.getProperty("password"));
		
	}

}
