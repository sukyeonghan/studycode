package com.interfaceTest.controller;

import com.interfaceTest.model.vo.Test;
import com.interfaceTest.model.vo.TestAble;

public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println(TestAble.age);
		System.out.println(TestAble.name);
		//TestAble.age=20; cannot be assigned ����
		//TestAble.name="�̰Ŵ�?";
		//�������̽����� ������ ���� ����� �ٸ� ���� ������ �ȵ�.
		
		Test t = new Test();
		t.test();
		System.out.println(t.getStr("���� ���� ���� ��"));
		
		//�������̽��� ������ �ڷ������� ����� ����
		TestAble test;
		test = new Test("������",19);
		//�ʼ����� ��ɸ� ���̵��� ������.
		//�������̽��� ������ �޽��常 ����!
		//�θ�Ŭ������ �Ѿ�� �θ�͸� ���̴� �Ͱ� ����� �ƶ�
		System.out.println(test.getStr("�� �����ð�"));
		//getStr ���� TestAble�ǵ�
		//Test�� �����  - �������ε�
		((Test)test).getAge(); //���� �Ⱥ����� �� ����ȯ�ϸ� ������ �� ����
		
		
		
		
	}

}
