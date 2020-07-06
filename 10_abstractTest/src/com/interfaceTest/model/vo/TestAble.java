package com.interfaceTest.model.vo;

public interface TestAble {//항상 public
	
	//상수형 필드를 가질 수 있고
	public static final int age=19;
	String name="유병승"; //알아서 public static final 생략된 거임.
	
	//메소드는 추상메소드만 가질 수 있고 Override를 위해 public으로 접근제한자 설정함
	//기본적으로 메소드 선언하면 추상메소드로 보기 때문에 public abstract는 생략이 가능함
	public void test(); //추상메소드
	
	String getStr(String a); //추상메소드. 자동으로 public abstract가 붙음
	
	
	
	

}
