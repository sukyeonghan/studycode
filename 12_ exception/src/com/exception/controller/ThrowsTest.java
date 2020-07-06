package com.exception.controller;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class ThrowsTest {
	
	//1. 다른 메소드에 위임
	public void exceptionTest2() throws FileNotFoundException{
		
		throw new FileNotFoundException();
	
	}
	
	public void exceptionTest3() throws EOFException {
		throw new  EOFException();
	}
	//예외처리에도 상속관계가 있음!자식객체의 Exception을 부모 Exception을 처리할 수 있음
	//모든 Exception의 최상위 객체는 Exception이어서 이걸로 다 처리 가능
	//IOException이 FileNotFoundException의 부모여서 처리 가능
	//EOFException는 FileNotFoundException같은 레벨이어서 처리 못함
	//throws를 여러 개 exception할 수 있음
	//FileNotFoundException,EOFException 두 개 안쓰고 IOException로 써도 됨
	
	public void exceptionTest() throws FileNotFoundException,EOFException { 
		//checkedException 예외를 발생시킴 
		//반드시 처리 구문을 작성을 해야함
		//throw new IOException(); //예외를 발생시킴
		
		exceptionTest2();
		exceptionTest3();
	}

	

}
