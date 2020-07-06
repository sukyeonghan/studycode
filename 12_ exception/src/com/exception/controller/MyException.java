package com.exception.controller;

public class MyException extends RuntimeException{ //Exception객체가 됨
	//프로그램에서 사용하는 예외 만들기
	//일반 클래스에 Exception 객체 중 하나를 상속받으면
	//Exception객체가 됨
	
	public MyException() {
		// TODO Auto-generated constructor stub
	}
	
	public MyException(String msg) {
		super(msg);
	}
	//-> main에서 실행
	//페이지 만들 때 Exception 발생하면 어느 페이지로 가세요 등을 설정할 때 씀

}
