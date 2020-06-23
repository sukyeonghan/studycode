package com.oop.model.vo;

public class Member {
	
	//생성자 테스트 객체	
	private String name;
	private String memberId;
	private String memberPw;
	private String phone;
	private String personNo; //주민번호는 암호화 처리 필요
	private int memberNo;
	private static int count;
	
	//객체 내에 생성자를 작성하지 않으면
	//기본생성자를 자동으로 생성하여 컴파일함.
	
	//기본생성자 선언해보자!
	//기본생정자 : 처리하는 로직과 매개변수가 없음
	//접근제한자(public) 클래스명(){}
	//이거 주석처리하면 에러남. 밑에 매개변수 있는 생성자 있으니까 자동으로 생성안해줌
	public Member() {
		//memberId="test"; 초기화 블록과 다를 바 없음.
		System.out.println("기본 생성자 호출!");
	}
	
	//매개변수가 있는 생성자
	//new member실행할 때 외부에서 값을 받도록 저장공간을 만듦
	//변수명으로 구분이 되지 않고 개수와 자료형으로 구분함..  
	//순서를 섞어 스트링 5개 하나 더 만들면 오류남. 구분을 못 함
	public Member(String memberId, String memberPw, 
			String name,String phone,String personNo) {
		//실제 들어가있는지 확인 출력
//		System.out.println("매개변수 memberId" + memberId);
//		System.out.println("매개변수 memberPw" + memberPw);
//		System.out.println("매개변수 name" + name);
//		System.out.println("매개변수 phone" + phone);
//		System.out.println("매개변수 personNo" + personNo);
		this.memberId=memberId;
		this.memberPw=memberPw;
		this.name=name;
		this.phone=phone;
		this.personNo=personNo;
		//생성됐을 때 주소값을 넣는다
		//유동적으로 바뀐다..
	}
	
	//오버로딩
	//선언한 거 다 받을 필요없이 필요한 것만 해도 됨
	//객체의 일부멤버변수만 초기화하는 매개변수있는 생성자
	public Member (String memberId, String memberPw) {
		this.memberId=memberId;
		this.memberPw=memberPw;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setMemberId(String id) {
		this.memberId=id;
	}
	public String getMemberId() {
		return memberId;
	}
	
	public void setMemberPw(String pw) {
		memberPw=pw; 
		//public void setMemberPw(String memberPw) {
		//this.memberPw=memberPw;
		//기본적으로 중괄호 안에서는 이름이 동일한 변수를 먼저 접근
		//여기 안에 memberPw 중복된 게 없어서 this 생략가능
		//노란색 로컬변수 여기{} 안에서만 쓸 수 있다.
		//memberPw=memberPw;이렇게 쓰면 둘 다 노란색 됨
	}
	public String getMemberPw() {
		return memberPw;
	}
	
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public String getPhone() {
		return phone;
	}
	
	public void setPersonNo(String no) {
		personNo=no;
	}
	public String getPersonNo() {
		return personNo;
	}
	//외부에서 수정 못하게 set을 만들어 주지 않음
	public int getMemberNo() {
		return memberNo;
	}

}
