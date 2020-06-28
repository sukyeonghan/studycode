package com.kh.controller;

import com.kh.model.vo.Person;

public class Main {
	
	public static void main(String[] args) {
		
		PersonController pc = new PersonController();

		  Person[] people = pc.inputPerson(); 

		  System.out.println("등록된 회원 직업별 출력하기");

		  pc.printAsJob(people);
	}

}
