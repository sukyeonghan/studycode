package com.generic.model.vo;

public class MyGeneric<T,E> {//대문자로 문구 하나 적음.두 개도 됨(key:value)
	
	private T testValue; //자료형에 적음. runtime중에 골라 쓸 수 있음
	private E value2;
	
	public MyGeneric() {
		
	}
	
	

	
	public MyGeneric(T testValue) {
		super();
		this.testValue = testValue;
	}

	
	public T getTestValue() {
		return testValue;
	}

	public void setTestValue(T testValue) {
		this.testValue = testValue;
	}


	@Override
	public String toString() {
		return "MyGeneric [testValue=" + testValue + "]";
	}
	
	
	

}
