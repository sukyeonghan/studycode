package com.abstracttest.controller;

import com.abstracttest.model.vo.Food;
import com.abstracttest.model.vo.IncludeAbstract;
import com.abstracttest.model.vo.IncludeImplements;
import com.abstracttest.model.vo.IncludeImplements2;
import com.abstracttest.model.vo.Recipe;
import com.abstracttest.model.vo.Test;

public class AbstractTestMain {
	public static void main(String[] args) {
		
		//abstract class �ƴ� ��
		//Food f = new Food("�߽�","¥���","�ѱ�",1,0);
		//System.out.println(f);
		
		Test t = new Test("�ѽ�","���","�ѱ�",1,5);
		System.out.println(t);
		
		System.out.println(t.getName());
		
		//�߻�Ŭ������ ������ �ڷ������� ����� �����ϴ�
		Food f = new Test();
		f=new Recipe();
		//Food �ڷ����� ��������Food ��ӹ��� ��ü�� ���԰���
		//f=new String(); �ȵ�~
	
		((Recipe)f).cooking(); //�̷��� �޼ҵ� ����ȯ�ؼ� �� �� �ִ�
		
		IncludeAbstract ia = new IncludeImplements();
		System.out.println(ia.calculator(10, 20));
		//�������ε�! new IncludeImplements()�� ia�� ���ϱ� 
		
		ia = new IncludeImplements2();
		System.out.println(ia.calculator(10, 20));
		System.out.println(ia.getA());
		//ia���� IncludeAbstract�� ����� ��ü�鸸 �� �� �ִ�!
		
	}

}
