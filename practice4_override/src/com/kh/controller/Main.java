package com.kh.controller;

import com.kh.model.vo.Person;

public class Main {
	
	public static void main(String[] args) {
		
		PersonController pc = new PersonController();

		  Person[] people = pc.inputPerson(); 

		  System.out.println("��ϵ� ȸ�� ������ ����ϱ�");

		  pc.printAsJob(people);
	}

}
