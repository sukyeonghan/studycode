package com.collection.model.vo;

import java.util.Objects;

public class Member {
	
	private String id;
	private String pw;
	private String name;
	private int age;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
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

	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Member) {
			Member m=(Member)o;
			if(this.id.equals(m.id) && this.age==m.age) {
				return true;
			}
		}
		return false;
	}
	
	//set,Map에서 객체를 동일하게 볼려면 주소값도 일치하는지 확인해야 함!
	//해쉬코드 이용 - 동일한 값을 넣으면 동일한 주소를 출력함
	//데이터 보관용 객체 만들 때
	//투스트링, 이퀄스, 해쉬코드는 다 만들어 놓는게 좋다. 동등비교할 때 써야하므로.
	
	//이퀄스가 같으면 해쉬코드가 같게 만들어야 하니까
	//해쉬코드()안에 동등성 비교하는게 다들어가야한다
	//지금은 id.age 비교면 hash(id,age) 넣음
	
	@Override
	public int hashCode() {
		return Objects.hash(id,age); //Objects 객체 안에 있음
	}
	
	

}
