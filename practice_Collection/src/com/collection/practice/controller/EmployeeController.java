package com.collection.practice.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.collection.practice.model.vo.Employee;

public class EmployeeController {
	
	public void collectionTest() {
	
		//arrayList를 이용한 사원들을 관리. 데이터 넣고 출력하기
		System.out.println("==== List 이용 ====");
		List list = new ArrayList();
	
		list.add(new Employee("홍길동",29,"대리",300));
		list.add(new Employee("이순신",30,"과장",500));
		list.add(new Employee("유병승",18,"사장",1000));
		list.add(new Employee("장길산",85,"고문",10));
		list.add(new Employee("용석",26,"인턴",1));
		
		printList(list);
	
		
		//set을 이용하여 사원관리. 출력 후 유병승 18 사장 1000을 다시 넣고 출력
		System.out.println("==== Set 이용 ====");
		Set emp = new HashSet();
		
		emp.add(new Employee("홍길동",29,"대리",300));
		emp.add(new Employee("이순신",30,"과장",500));
		emp.add(new Employee("유병승",18,"사장",1000));
		emp.add(new Employee("장길산",85,"고문",10));
		emp.add(new Employee("용석",26,"인턴",1));
		emp.add(new Employee("유병승",18,"사장",1000));
		
//		Iterator it = emp.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		for(Object o : emp) {
			System.out.println(o);
		}
		
		
		//HashMap 이용
		System.out.println("==== HashMap 이용 ====");
		HashMap hs = new HashMap();
		
		hs.put(1, new Employee("홍길동",29,"대리",300));
		hs.put(2, new Employee("이순신",30,"과장",500));
		hs.put(3, new Employee("유병승",18,"사장",1000));
		hs.put(4, new Employee("장길산",85,"고문",10));
		hs.put(5, new Employee("용석",26,"인턴",1));
		
		for(Object o : hs.keySet()) {
			Employee emp2 = (Employee)hs.get(o); 
			System.out.println(emp2);
			//System.out.println(o); - key값만 나옴
		}
		
	
	}

	private void printList(List list) {
		
		for(Object o : list) {
			System.out.println(o);
		}
		
	}

}
