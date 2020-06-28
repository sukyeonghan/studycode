package com.poly.controller;

import com.poly.model.vo.Employee;
import com.poly.model.vo.Person;
import com.poly.model.vo.Singer;

public class Functional {
	
//	//Employee������ ����ϴ� ���
//	public void print(Employee e) {
//		System.out.println(e.getName()+e.getAge()+e.getAddress());
//	}
//	//singer ������ ����ϴ� ��� //�����ε�. ��ü�� �ٲ� 2�� ���� ������
//	public void print(Singer s) {
//		System.out.println(s.getName()+s.getAge()+s.getAddress());
//	}
	
	
	//�������� �̿��ϸ� �����ε��� ���� �� ����. ��Ӱ��谡 ������!!
	public void print(Person p) { //p���� person�� ��ӹ��� ��� ��ü�� ���� �� ����(p,e,s) ���� ������ �𸣴ϱ� �и��ؼ� �ۼ��ؾ���.
		if(p instanceof Employee) {//->instanceof : type��. ==�� ���� �ǹ�.�տ� �� Ÿ���� (��ӹ��� Ŭ����)�� ����?���氡���ϴ�?
		//Employee��� ���� ���. �ڽ� ��ü �����Ϸ��� ��������ȯ!
		System.out.println(p.getName()+p.getAge()+p.getAddress()
			+((Employee)p).getDepartment()+((Employee)p).getJob()+((Employee)p).getSalary());
		} else if(p instanceof Singer) {
		//Singer ��� ���� ���
		System.out.println(p.getName()+p.getAge()+p.getAddress()
			+((Singer)p).getTitle()+((Singer)p).getYear()+((Singer)p).getGenre());
		} else if(p instanceof Person) {
			System.out.println("person�̾�!");
		}
		
	}
	
	
}