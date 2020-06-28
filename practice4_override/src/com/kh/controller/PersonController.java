package com.kh.controller;

import com.kh.model.vo.Driver;
import com.kh.model.vo.Employee;
import com.kh.model.vo.Person;
import com.kh.model.vo.Student;

public class PersonController {
		public Person[] inputPerson() {
	
		Person[] persons = new Person[10];
		
		persons[0] = new Student("�л�1",15,'F',3,2,23);
		persons[1] = new Employee("ȸ���1",28,'F',"������","����",4000);
		persons[2] = new Driver("������1",50,'M',5,2);
		persons[3] = new Student("�л�2",18,'F',2,1,20);
		persons[4] = new Employee("ȸ���2",30,'F',"������","����",3000);
		persons[5] = new Driver("������2",70,'M',20,2);
		persons[6] = new Student("�л�3",19,'M',3,1,20);
		persons[7] = new Employee("ȸ���3",27,'M',"������","����",3500);
		persons[8] = new Driver("������3",45,'M',2,2);
		

		int countStudent=0;
		int countEmployee=0;
		int countDriver=0;
		for(int i=0; i<persons.length; i++) {
			if(persons[i] instanceof Student) {
				countStudent++;
				System.out.println(persons[i]);
			} else if(persons[i] instanceof Employee) {
				countEmployee++;
			} else if(persons[i] instanceof Driver) {
				countDriver++;
			}
		}
		System.out.println("��ϵ� ��� �� : "+persons.length+"��");
		System.out.println("�л� : "+countStudent+"��");
		System.out.println("ȸ��� : "+countEmployee+"��");
		System.out.println("������: "+countDriver+"��");
		
		return persons;
		}
		
		public void printAsJob(Person [] p) {
			
		System.out.println("��ϵ� ȸ�� ������ ����ϱ�");
		System.out.println("====�л�====");
		
		for(int i=0; i<p.length; i++) {
			if(p[i] instanceof Student) {
				System.out.println(p[i].getName()+p[i].getAge()+ p[i].getGender()
						+((Student)p[i]).getGrade()+((Student)p[i]).getClass()+((Student)p[i]).getNumber() );
			}
		}
		
		

		
	 }
	}


		

	
	