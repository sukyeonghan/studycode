package com.inherit.model.vo;

public class Student extends Teacher {
	//단일 상속! extends 뒤에 부모 객체 하나만 올 수 있다
	//student가 teacher를 상속, teacher가 person을 상속하면
	//student는 teacher,person,object 다 쓸 수 있다
	
	//이름,나이,주소,전화번호,학년,반,번호
	
//	private String name;
//	private int age;
//	private String address;
//	private String phone;
	private int grade;
	private int classroom;
	private int number;
	
	//기본생성자 단축키 : ctrl+space+enter
	
	public Student() {
	}//반드시 있어야 함
	
	//매개변수 생성자 단축기 : alt+s+a+g
	public Student(String name, int age, String address, String phone, 
			char gender, int grade , int classroom, int number) {	
//		super.setName(name);
//		super.setAge(age);
//		super.setAddress(address);
//		super.setPhone(phone);
//		super.setGender(gender);
		
		//이렇게 다 안써도 부모의 생성자를 호출하면 더 편하다
		//super(); //부모의 기본 생성자를 호출
		//super(name,age,address,phone,gender); //부모의 매개 변수 있는 생성자를 호출
		//Teacher에는 매개변수 생성자 없음. 이렇게 쓸 수 없음
		//항상 맨 윗줄에 있어야 한다
		//부모 생성자 변수 순서와 일치해야한다!
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
	
	//setter/getter 만들기 : alt+s+r+a+r
	
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
		return "자식!";
	}
	
	//자식객체에서 부모객체 변수에 접근하기
	public String information() {
		//부모 객체에 접근하려면? -> super
		return super.getName()+" "+super.getAge()+" "+
				super.getAddress()+" "+super.getPhone()+" "+super.getGender()+
				" "+grade+" "+classroom+" "+number;
		//return super.name 쓰면 오류남
		//접근제한자 private로 선언하면 못 보게갈놔서(캡슐화) not visible
		//getter/setter로 접근해야함!
		//nor reserved 는 없는 거
		
		//같은 변수명 있을 때
		//super. 쓰면 부모 걸로 접근 , 안쓰면 자기 거가 우선순위임
	}

}
