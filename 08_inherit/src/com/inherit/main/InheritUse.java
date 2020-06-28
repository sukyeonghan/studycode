package com.inherit.main;

import com.inherit.model.vo.Employee;
import com.inherit.model.vo.ObjectTest;
import com.inherit.model.vo.Student;
import com.inherit.model.vo.Teacher;

public class InheritUse {
	
	public static void main(String[] args) {
		//아 생각을 해보니 , 내가 관리하고 이쓴 객체들의(STUDENT,EMPLOYEE.TEACHER)
		//이름은 2글자 이상만 들어갈 수 있게 하자
		
		Teacher t = new Teacher();
		t.getName();
		t.getAge();
		t.setName("한");
		Student s = new Student();
		s.setName("한");
		Employee e = new Employee ();
		s.setName("한");
		
		//관리하고 있는 전체 객체에 성별을 추가한다.
		//person에 추가하면 자식객체들도 다 쓸 수 있다
		e.setGender('남');
		s.setGender('여');
		t.setGender('M');
		
		s = new Student();
		System.out.println(s.information());
		
		s = new Student("한수경",20,"경기도","0102334555",'여',3,1,2); //자료형 맞추기 주의
		System.out.println(s.information());
		
		s.getName();
		
		//모든 객체는 object의 후손이다
		//자바에서 object가 최상위객체!!
		
		ObjectTest test = new ObjectTest();
		//test.   object 가지고 있다!
		//s.
		Object obj; //자료형이 안맞아도 모든걸 다 담을 수 있다(다형성)
	}

}
