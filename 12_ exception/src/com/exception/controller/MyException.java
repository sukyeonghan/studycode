package com.exception.controller;

public class MyException extends RuntimeException{ //Exception��ü�� ��
	//���α׷����� ����ϴ� ���� �����
	//�Ϲ� Ŭ������ Exception ��ü �� �ϳ��� ��ӹ�����
	//Exception��ü�� ��
	
	public MyException() {
		// TODO Auto-generated constructor stub
	}
	
	public MyException(String msg) {
		super(msg);
	}
	//-> main���� ����
	//������ ���� �� Exception �߻��ϸ� ��� �������� ������ ���� ������ �� ��

}
