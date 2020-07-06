package com.exception.controller;

public class Main {

	public static void main(String[] args) { //throws Exception {//JVM에게 보냄
		//System.out.println("이거 실행되니?");
		//new ThrowsTest().exceptionTest(); //JVM이 이거 출력하고 종료시킴.Unchecked처럼
		//System.out.println("Exception 아래 실행");//이건 출력 안 됨
		
		try {
			throw new MyException("내꺼얌");
		} catch(MyException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
