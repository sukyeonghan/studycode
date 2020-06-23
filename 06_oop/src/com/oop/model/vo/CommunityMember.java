package com.oop.model.vo;

public class CommunityMember { //Testmain과 연결
	//커뮤니티 사이트를 만들기 위해 회원가입을 받으려고 한다.
	//회원에 대한 정보를 저장할 객체를 만드세요
	//매개변수 있는 생성자 이용/각 스터디 3명씩 생성해 출력
	
	//1. 필요한 정보 (아이디, 패스워드, 이메일, 평점..)
	//2. 클래스 이름(멤버), 데이터 받는 멤버변수(자료형 변수명) 만들기
	private String comName; //회원 이름
	private String comId; //회원 아이디 4~8글자 설정
	private String comPw; //회원 비밀번호 8글자 이상
	private double point; //좋아요 평균횟수

	//객체를 생성할 때 필요한 생성자 작성
	//3.기본 생성자 무조건 만들어라. 나중을 위해서라도 이렇게 코딩하는 습관들이기.
	public CommunityMember() { //framework에서 이용할 기본생성자로 생성을 한 다름 setter로 값을 대입함.
		//this()
		//생성자 내에서 자신이 가지고 있는 다른 생성자 호출할 때 씀
		//주의!this 생성자는 반드시 무조건 맨 위에 선언되야 한다!!
		//이렇게 기본 셋팅도 가능
		this("userId","1111","print");
		this.point=100.10;

//		this.comId="userId";
//		this.comPw="1111"; ...
//		원래 이렇게 다 썼음
		
	}

	//4.매개변수 있는 생성자
	public CommunityMember (String comName, String comId, String comPw, double point) {
	//외부에서 주는 값들을 내부에 세팅한다..
		this.comName=comName;
		this.comId=comId;
		this.comPw=comPw;
		this.point=point;
	}
	//point초기값 없으니까..따로 만듦
	public CommunityMember (String comName, String comId, String comPw) {
		this(comName,comId,comPw,0);
		//위에 있으니까 또 쓸 필요 없음.
		
//		this.comName=comName;
//		this.comId=comId;
//		this.comPw=comPw;
		
	}
	//getter/setter -> 객체에 생성된 변수에 접근해서 값을 가져오고 값을 대입하는 기능을 함
	public void setComName(String comName) {
		this.comName=comName;
	}
	public String getComName() {
		return comName;
	}
	public void setComId(String comId) {
		this.comId=comId;
	}
	public String getComId() {
		return comId;
	}
	public void setComPw(String comPw) {
		this.comPw=comPw;
	}
	public String getComPw() {
		return comPw;
	}
	public void setPoint(double point) {
		this.point=point;
	}
	public double getPoint() {
		return point;
	}
	
}
