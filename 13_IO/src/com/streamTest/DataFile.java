package com.streamTest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DataFile {
	
	public void savePerson() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.print("Ű : ");
		double height = sc.nextDouble();
		
		try(FileWriter fw = new FileWriter("person.data")) {
			
			fw.write(name+",");//������ �� �����ؼ� �־��ָ� ��µ� �׷��� ��
			fw.write(String.valueOf(age+","));//ĳ���� ��ü�� ��Ʈ�� ����ȯ�ż� �Ƚᵵ �Ǳ� ��
			fw.write(String.valueOf(height+",")); //���ڿ��� ��ȯ
			
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
			//�����ؼ� ��������..�����ϴ� -> ������Ʈ�� ���
			String[] datas = person.split(","); //���ڿ��� , �������� �ɰ��� ���ڿ� �迭�� �־���
			System.out.println("�̸� : "+datas[0]);
			System.out.println("���� : "+Integer.parseInt(datas[1]));
			//string type�� ���ڸ� int�� ��ȯ
			System.out.println("Ű  : "+Double.parseDouble(datas[2]));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
