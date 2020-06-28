package com.inherit.model.vo;

public class Person {
	
	private String name;
	private int age;
	private String address;
	private String phone;
	private char gender;
	
	
	public Person() {
		
	}
// 안쓰면  Employee, Teacher 에러남. 이걸 참조해서

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

	//person(부모객체)만 수정하면 상속받고 있는 애들도 다 영향 받음
	//유지보수 간편
	public void setName(String name) {
		if(name.length()>1) {
		this.name = name;
		} else {
			System.out.println("이름은 두 글자 이상 작성해야 합니다.");
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
