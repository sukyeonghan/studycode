package com.inherit.model.vo;

public class Student extends Teacher {
	//���� ���! extends �ڿ� �θ� ��ü �ϳ��� �� �� �ִ�
	//student�� teacher�� ���, teacher�� person�� ����ϸ�
	//student�� teacher,person,object �� �� �� �ִ�
	
	//�̸�,����,�ּ�,��ȭ��ȣ,�г�,��,��ȣ
	
//	private String name;
//	private int age;
//	private String address;
//	private String phone;
	private int grade;
	private int classroom;
	private int number;
	
	//�⺻������ ����Ű : ctrl+space+enter
	
	public Student() {
	}//�ݵ�� �־�� ��
	
	//�Ű����� ������ ����� : alt+s+a+g
	public Student(String name, int age, String address, String phone, 
			char gender, int grade , int classroom, int number) {	
//		super.setName(name);
//		super.setAge(age);
//		super.setAddress(address);
//		super.setPhone(phone);
//		super.setGender(gender);
		
		//�̷��� �� �Ƚᵵ �θ��� �����ڸ� ȣ���ϸ� �� ���ϴ�
		//super(); //�θ��� �⺻ �����ڸ� ȣ��
		//super(name,age,address,phone,gender); //�θ��� �Ű� ���� �ִ� �����ڸ� ȣ��
		//Teacher���� �Ű����� ������ ����. �̷��� �� �� ����
		//�׻� �� ���ٿ� �־�� �Ѵ�
		//�θ� ������ ���� ������ ��ġ�ؾ��Ѵ�!
		//public Person(String name, int age, String address, String phone, char gender)
		
		
//		if(name.length()>2) {
//			this.name = name;
//		}
//		this.name = name;
//		this.age = age;
//		this.address = address;
//		this.phone = phone;
		this.grade = grade;
		this.classroom = classroom;
		this.number = number;
	}
	
	//setter/getter ����� : alt+s+r+a+r
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		if(name.length()>2) {
//		this.name = name;
//		}
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public String getPhone() {
//		return phone;
//	}
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAddress() {
		return "�ڽ�!";
	}
	
	//�ڽİ�ü���� �θ�ü ������ �����ϱ�
	public String information() {
		//�θ� ��ü�� �����Ϸ���? -> super
		return super.getName()+" "+super.getAge()+" "+
				super.getAddress()+" "+super.getPhone()+" "+super.getGender()+
				" "+grade+" "+classroom+" "+number;
		//return super.name ���� ������
		//���������� private�� �����ϸ� �� ���԰�����(ĸ��ȭ) not visible
		//getter/setter�� �����ؾ���!
		//nor reserved �� ���� ��
		
		//���� ������ ���� ��
		//super. ���� �θ� �ɷ� ���� , �Ⱦ��� �ڱ� �Ű� �켱������
	}

}