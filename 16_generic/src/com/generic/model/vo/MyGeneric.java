package com.generic.model.vo;

public class MyGeneric<T,E> {//�빮�ڷ� ���� �ϳ� ����.�� ���� ��(key:value)
	
	private T testValue; //�ڷ����� ����. runtime�߿� ��� �� �� ����
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
