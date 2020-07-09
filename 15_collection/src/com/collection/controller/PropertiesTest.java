package com.collection.controller;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	
	public void propertiesTest() {
		//Properties : key = value �������� �����͸� �����ϴ� Ŭ����
		//���ڿ� �ڷḦ �����ϴ� Ŭ����
		//key : String, value : String
		//���� ū ����! ���ϰ� �����Ͽ� ó���� �� ����
		//-> ���Ͽ� �����ϰ�, ����� ���� ������ �� ����
		//���α׷��� �ֿ� ��������, ȯ�浥���� ���� �����ϰ� �ҷ��� �� ���� ���
		
		//�����ؼ� �����
		Properties prop = new Properties();
		
		//��ü�� �����͸� �����ϱ�
		//SetProperty(key,value)�޼ҵ带 �̿��ؼ� ����
		
		prop.setProperty("name","������");
		prop.setProperty("age","29");
		
		//���Ͽ� �����ϰ� ������ �� ����
		//store(�������彺Ʈ��)�޼ҵ� �̿�
//		try {
//			
//			prop.store(new FileWriter("prop.properties"), "���");//�ּ� "���"
//		
//		} catch(IOException e) {
//			
//			e.printStackTrace();
//		}
	

		//���Ͽ� ����� ���� �ҷ�����
		//load(���ڿ� �ҷ����� ��Ʈ��!)
		try { 
			prop.load(new FileReader("prop.properties"));
//			prop.load(new FileReader("myProp.properties"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//properties�� �ִ� �� ����ϱ�
		//getProperty(Ű��);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("nickname"));//�ܺο��� ����
//		System.out.println(prop.getProperty("userId"));
//		System.out.println(prop.getProperty("password"));
		
	}

}
