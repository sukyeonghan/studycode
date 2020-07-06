package com.streamTest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DataFile {
	
	public void savePerson() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		try(FileWriter fw = new FileWriter("person.data")) {
			
			fw.write(name+",");//저장할 떄 구분해서 넣어주면 출력도 그렇게 됨
			fw.write(String.valueOf(age+","));//캐릭터 자체가 인트랑 형변환돼서 안써도 되긴 함
			fw.write(String.valueOf(height+",")); //문자열로 변환
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	
	public void loadPerson() {
		
		try(FileReader fr = new FileReader("person.data")) {
			//char[] str = new char[new File("Person.data").length()];
			int value = 0;
			String person="";
			
			while((value=fr.read())!=-1) {
				person+=(char)value;
				//fr.read((String)name);
			}
			System.out.println(person);
			//구분해서 가져오기..불편하다 -> 보조스트림 사용
			String[] datas = person.split(","); //문자열을 , 구분으로 쪼개서 문자열 배열에 넣어줌
			System.out.println("이름 : "+datas[0]);
			System.out.println("나이 : "+Integer.parseInt(datas[1]));
			//string type의 숫자를 int로 변환
			System.out.println("키  : "+Double.parseDouble(datas[2]));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
