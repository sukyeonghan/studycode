package com.oop.main;

import com.oop.model.vo.Car;

public class Main {
	public static void main(String[] args) {
		//�⺻���� �����ؼ� default�� Ȯ��
		//���� �ְ� �����ؼ� Ȯ��
		Car car1 = new Car(); 
		
		System.out.println("�ʱⰪ Ȯ�� :"+ car1.getName() + car1.getGas() + 
				car1.getDoor()+ car1.getColor());
		
		car1.setName("�׽���");
		car1.setGas(5000);
		car1.setDoor(5);
		car1.setColor("black");
		
		System.out.println("���� �� :"+ car1.getName() + car1.getGas() + 
				car1.getDoor()+ car1.getColor());
		
	}

}