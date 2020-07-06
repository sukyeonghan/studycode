package com.poly.model.vo;

public class Person {
	
	private String name;
	private int age;
	private String address;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	
	@Override //부모 있는지 확인
	public String toString() { //Object(부모)에 있는 toString메소드를 자식(person)이 재정의한 것 
		//toString 은 접근제한자 public만 가능. 원래 public으로 선언되어 범위 더 좁힐 수 없기 때문
		//return "Person 이름"+name+"나이"+age+"주소"+address;
		return name+age+address;
	}
	
	
	@Override 
	public boolean equals(Object obj) { //object조건- 선언부 꼭 똑같이 써야 함!!!
		//동등성 비교는 객체마다 다 해야함
		//객체가 같다고 판단할 수 있는 조건문 설정
		//멤버변수의 데이터를 기준으로 설정
		//return (this == obj); 여기서 디스가 jo,obj가 jo2/char[] 배열로 받음
		//같으면 true, 아니면 false
		if(obj instanceof Person) {
		
		Person p = (Person)obj;
		if(this.name.equals(p.getName())
			&&this.age==p.getAge()
			&&this.address.equals(p.getAddress())) {
			return true;
		} 
	}
		return false;
	}
}
