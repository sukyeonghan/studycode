package com.oop.model.vo;

public class FieldAccessTest {
	
	//��������� �����׽�Ʈ
	//���������� ����� �ڷ��� ������[=��];
	//���� �����ϳ� �ڷ��� �������� �����Ұ���
	
	////public static String name;
	//static�� �ϳ��� Ŭ���������� ���� ����??? ����Ǵ� �͸��� �ٸ��� ��������� �����ȴٴ� �ǰ�??
	
	public int publicInt=20;;
	protected char protectedChar='A';
	String defaultString="��ȣ~";
//	private int publicInt;  default : 0
//	private char protectedChar; //default : ' '
//	private String defaultString; //default : null
//	�� �� �ٲٸ� ���� ���� �� ������.
	private double privateDouble=180.5; //default : 0.0
	//����� ���ÿ� �ʱ�ȭ�� ����!!
	//�̰� �ִٰ� ���� �� �� �ִ� ���� �ƴ�
	//new�� �Ҵ��ؼ� �ּҰ� �����ؾ� ��. ->>main���� ����
	
	//ĸ��ȭ�� �� private�� ����.
//	public int age;
	private int age=180;
	
	//�ʵ��� �ڷ����� �ڹٿ��� ����ϴ� ��� �ڷ����� ����� �� ����
	private int[] intArr=new int[10];
	//private DefaultTest test=new DefaultTest();
	//��ü�鵵 ������ ���� �� �ִ�
	
	{
		publicInt = 200;
		protectedChar='��';
		defaultString="�̰�!";
		privateDouble=180.5;
		//�ش� Ŭ���� ���ο��� ���� ����.
				
	}
	
	//������ �����ؼ� �����͸� ��������, ������ ���� ������ �� �ִ� �޼ҵ带 ���� �ۼ�
	//������ 1:2�� ��������� ��. getter(�������� ��)/setter(������ ����)
	//���������� �����ڷ���(��ȯ��) ||void get������(){  } || set������(�����ڷ��� ������){   }
	
	//getter : �������� �������� ���
	public int getAge() { //get+������ �빮��
		return this.age; //������� ȣ��
	}
	//setter : ������ ���� �ִ� ���
	public void setAge(int age) {
		if(age>0) {
			this.age=age;
		}
	}
	

}