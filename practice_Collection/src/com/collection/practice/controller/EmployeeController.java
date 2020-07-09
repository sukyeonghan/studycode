package com.collection.practice.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.collection.practice.model.vo.Employee;

public class EmployeeController {
	
	public void collectionTest() {
	
		//arrayList�� �̿��� ������� ����. ������ �ְ� ����ϱ�
		System.out.println("==== List �̿� ====");
		List list = new ArrayList();
	
		list.add(new Employee("ȫ�浿",29,"�븮",300));
		list.add(new Employee("�̼���",30,"����",500));
		list.add(new Employee("������",18,"����",1000));
		list.add(new Employee("����",85,"��",10));
		list.add(new Employee("�뼮",26,"����",1));
		
		printList(list);
	
		
		//set�� �̿��Ͽ� �������. ��� �� ������ 18 ���� 1000�� �ٽ� �ְ� ���
		System.out.println("==== Set �̿� ====");
		Set emp = new HashSet();
		
		emp.add(new Employee("ȫ�浿",29,"�븮",300));
		emp.add(new Employee("�̼���",30,"����",500));
		emp.add(new Employee("������",18,"����",1000));
		emp.add(new Employee("����",85,"��",10));
		emp.add(new Employee("�뼮",26,"����",1));
		emp.add(new Employee("������",18,"����",1000));
		
//		Iterator it = emp.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		for(Object o : emp) {
			System.out.println(o);
		}
		
		
		//HashMap �̿�
		System.out.println("==== HashMap �̿� ====");
		HashMap hs = new HashMap();
		
		hs.put(1, new Employee("ȫ�浿",29,"�븮",300));
		hs.put(2, new Employee("�̼���",30,"����",500));
		hs.put(3, new Employee("������",18,"����",1000));
		hs.put(4, new Employee("����",85,"��",10));
		hs.put(5, new Employee("�뼮",26,"����",1));
		
		for(Object o : hs.keySet()) {
			Employee emp2 = (Employee)hs.get(o); 
			System.out.println(emp2);
			//System.out.println(o); - key���� ����
		}
		
	
	}

	private void printList(List list) {
		
		for(Object o : list) {
			System.out.println(o);
		}
		
	}

}
