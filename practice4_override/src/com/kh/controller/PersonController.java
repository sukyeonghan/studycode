package com.kh.controller;

import com.kh.model.vo.Driver;
import com.kh.model.vo.Employee;
import com.kh.model.vo.Person;
import com.kh.model.vo.Student;

public class PersonController {
		public Person[] inputPerson() {
	
		Person[] persons = new Person[10];
		
		persons[0] = new Student("학생1",15,'F',3,2,23);
		persons[1] = new Employee("회사원1",28,'F',"개발팀","신입",4000);
		persons[2] = new Driver("운전사1",50,'M',5,2);
		persons[3] = new Student("학생2",18,'F',2,1,20);
		persons[4] = new Employee("회사원2",30,'F',"개발팀","신입",3000);
		persons[5] = new Driver("운전사2",70,'M',20,2);
		persons[6] = new Student("학생3",19,'M',3,1,20);
		persons[7] = new Employee("회사원3",27,'M',"개발팀","신입",3500);
		persons[8] = new Driver("운전사3",45,'M',2,2);
		

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
		System.out.println("등록된 사람 수 : "+persons.length+"명");
		System.out.println("학생 : "+countStudent+"명");
		System.out.println("회사원 : "+countEmployee+"명");
		System.out.println("운전수: "+countDriver+"명");
		
		return persons;
		}
		
		public void printAsJob(Person [] p) {
			
		System.out.println("등록된 회원 직업별 출력하기");
		System.out.println("====학생====");
		
		for(int i=0; i<p.length; i++) {
			if(p[i] instanceof Student) {
				System.out.println(p[i].getName()+p[i].getAge()+ p[i].getGender()
						+((Student)p[i]).getGrade()+((Student)p[i]).getClass()+((Student)p[i]).getNumber() );
			}
		}
		
		

		
	 }
	}


		

	
	