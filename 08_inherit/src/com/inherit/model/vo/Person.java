package com.inherit.model.vo;

public class Person {
	
	private String name;
	private int age;
	private String address;
	private String phone;
	private char gender;
	
	
	public Person() {
		
	}
// �Ⱦ���  Employee, Teacher ������. �̰� �����ؼ�

	public Person(String name, int age, String address, String phone, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.gender = gender;
	}


	public String getName() {
		return name;
	}

	//person(�θ�ü)�� �����ϸ� ��ӹް� �ִ� �ֵ鵵 �� ���� ����
	//�������� ����
	public void setName(String name) {
		if(name.length()>1) {
		this.name = name;
		} else {
			System.out.println("�̸��� �� ���� �̻� �ۼ��ؾ� �մϴ�.");
		}
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
		
	public void setGender(char gender ) {
		this.gender=gender;
	}
	public char getGender() {
		return gender;
	}
	

}