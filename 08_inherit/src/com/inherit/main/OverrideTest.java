package com.inherit.main;

import com.override.model.vo.Cat;
import com.override.model.vo.Chicken;
import com.override.model.vo.Dog;

public class OverrideTest {

	public static void main(String[] args) {
		
		Dog d = new Dog("����","���",'M',"���");
		Cat c = new Cat("�����̰�","�θ�",'F',"���");
		Chicken ch = new Chicken("����","ó����",'F',"���");
		
		System.out.println(d.bark());
		System.out.println(c.bark());
		System.out.println(ch.bark());
		
		//new Animal().info(); protected�ϱ� �ȵ�
		d.info();
	}
	
}