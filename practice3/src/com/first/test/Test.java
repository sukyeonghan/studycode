package com.first.test;

public class Test {
	
	private String name="�ȳ�"; //����� �ʱⰪ
	
	{ 
		this.name="Rclass";
		System.out.println("�ʱ�ȭ ��� ����");
	} //�ʱ�ȭ���
	
	
	public Test() {
		// TODO Auto-generated constructor stub
	} //�⺻������ - JVM�� �غ��� �⺻������ �ʱ�ȭ 
	
	public void className(String name) {
		this.name=name; //�Ű����� �ִ� ������	- �Ű������� ���޹��� �ʱⰪ���� �ʱ�ȭ
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	

	
	
}
