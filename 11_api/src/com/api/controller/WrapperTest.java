package com.api.controller;

public class WrapperTest {
	
	public static void main(String[] args) {
		//Wrapper Ŭ���� Ȱ���ϱ�
		//Wrapper Ŭ������ �ڵ����� ����ȯ�Ͽ� �⺻�ڷ������� ����ǰ�
		//�⺻�ڷ����� �ʿ信 ���� �ڵ����� WrapperŬ������ �����
		int age = 19;
		Integer ageW = age; //����ڽ�
		System.out.println(ageW);
		int su = ageW; //�⺻�� int�� ���� ��Ӱ��� �� �� ����
		printTest(su);
		
		double height = 180.5;
		Double dheight = height;
		System.out.println(dheight);
		printTest(height); //double�� integer�� �ٲ� �� ����
		
		//wrapperŬ�������� ������ �޼ҵ嵵 �Բ� ������ ����
		//���������� ���ڰ��� ���������� �����ϴ� ��      ������ ���ڿ��� ��ȯ�Ǿ� ���⶧���� ���̾�!!
		//wrapperŬ������.parsewrapperŬ������(�����ҹ���);
		String test="2020";
		int year = Integer.parseInt(test);//���ڿ��� int�� ����ȯ
		System.out.println(year); //���� 2020���� ���
		test="65.5";
		double weight = Double.parseDouble(test);
		System.out.println(weight);
		
		test="���Ƚ�"; //�̰� ������
		
//		Integer.valueOf(); �굵 ���. �ȵ�
//		int a = Integer.valueOf(test);
//		System.out.println(a);
		
		//�ٸ� �ڷ����� ���������� �����Ϸ���?
		//String.valueOf()
		test = String.valueOf(age);
		System.out.println(test);
		test = String.valueOf(height);
		System.out.println(test);
		
	}
	
	public static void printTest(Object obj) { //��Ӱ��� ������ Ư¡������ ��ü���� �� �� ����
		System.out.println(obj instanceof Integer);
	}

}
