package com.collection.practice.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Properties;

import com.collection.practice.model.vo.Employee;
import com.collection.practice.model.vo.Employee3;

public class Employee3Contr {
	
	public static void main(String[] args) {
	
		Employee3Contr test = new Employee3Contr();
		Properties prop = new Properties();
		
		test.readFile(prop);
		test.printConsole(prop);
		test.addEmpData(prop);
		test.printConsole(prop);
		test.saveEmpXML(Employee[] er);
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empData.txt"))) {
			
			oos.writeObject(new Employee3(20130412,"ȫ�浿","��ȹ��",38000000,0.2));
			oos.writeObject(new Employee3(20130413,"ȫ���","���ߺ�",39000000,0.3));
			oos.writeObject(new Employee3(20130414,"ȫ���","�λ��",40000000,0.1));
			oos.writeObject(new Employee3(20130415,"ȫ���","���",41000000,0.2));
			oos.writeObject(new Employee3(20130416,"ȫ���","���",42000000,0.2));
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	
	}
	
	public void addEmpData(Properties p) {
		
		p.setProperty("2013102084", "�Ѽ���, ������ , 35000000, 50.0");
		p.se
		
	}
	
	public Employee[] readFile(Properties p ) {
		
	}
	
	public void printConsole(Properties p) {
		
	}
	
	public void saveEmpXML(Employee[] er) {
		
	}

}
