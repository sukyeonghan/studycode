package com.generic.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.generic.model.vo.MyGeneric;
import com.generic.model.vo.Student;

public class GenericTest {
	
	public static void main(String[] args) {
		//제네릭이란
		//클래스 설계시에 자료형을 정하지 않고 생성 시에 자료형을 확정짓는 방법
		//멤버변수, 메소드 반환형, 메소드 매개변수 자료형 선언
		//Collection에서 적용
		
		ArrayList<Student> students = new ArrayList(); //학생 객체만 저장할 거다
		//만약 <Person>하고 Student상속하면 둘 다 쓸 수 있음
		//이 땐 형변환해야함
		
		students.add(new Student("유병승",3,1));
		students.add(new Student("유다해",2,22));
		students.add(new Student("박현우",2,33));
		//students.add(new Date()); //들어감! 
		//이때 자료형을 정할 수 있음 ->제네릭<E> E는 대표문구.식별자
		//제네릭 선언 후 에러남
		//원래 add는 Object자료형이었는데 선언 후 Student자료형으로 바뀜
	
		students.get(0).getName();//형변환했어야 됐는데 자료형 고정되서 이제 안해도 됨
		
	
		ArrayList<String> names = new ArrayList(); //문자열만 가능
		names.add("유병승");
		names.add("강경록");
		//names.add(new Student()); 에러남
		
		
		Set<Integer> number = new HashSet<Integer>();//뒤에도 선언하는 게 좋다
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
	
		
		Set<Student> s = new HashSet<Student>(students);
		
		Iterator<Student> it = s.iterator();
		while(it.hasNext()) {
			//학생 이름만 출력하기
			System.out.println(it.next().getName());//형변환 안해도 됨
		}
		
		
		HashMap<String,Student> studentMap = new HashMap();
		studentMap.put("1", new Student("김다희",3,1));
		studentMap.put("2", new Student("정로희",3,2));
		studentMap.put("3", new Student("이세현",2,1));
		studentMap.put("4", new Student("남지선",3,1));
		
		//순회하기! 이름만 출력, 학년이 3학년인 사람의 이름만 출력
		
		Set<String> key = studentMap.keySet();
		Iterator<String> it1 = key.iterator();
		while(it1.hasNext()) {
			Student s1 =studentMap.get(it1.next());
			if(s1.getGrade()==3) {
				System.out.println(s1.getName());
			}
		}
		
		//Map.Entry 인터페이스임 
		//HashMap에서 entrySet()하면 데이터가 넘어감. 자동으로 자료형(타입)이 Map.Entry이 됨
		// 그 안에 키값과 벨류값이 있고 쌍으로 트레이에 하나씩 들어가는 것
		Set<Map.Entry<String, Student>> entry = studentMap.entrySet();
		Iterator<Map.Entry<String, Student>> it2 = entry.iterator();
		
		while(it2.hasNext()) {
			Map.Entry<String, Student> e = it2.next();
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		//for each문
		for(Map.Entry<String, Student> e : studentMap.entrySet()) {
			if(e.getValue().getGrade()==3) {
				System.out.println(e.getValue().getName());
			}
		}
		
		MyGeneric<String,Integer> g = new MyGeneric();
		g.setTestValue("안녕");
		System.out.println(g.getTestValue());
		
		MyGeneric<ArrayList<Integer>,HashMap> arr = new MyGeneric();
		arr.setTestValue(new ArrayList());
		//arr.getTestValue().add(new Student()); 설계 시 정할 수 있다~ 
	}

}
