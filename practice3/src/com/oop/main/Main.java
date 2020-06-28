package com.oop.main;

import com.oop.model.vo.Car;

public class Main {
	public static void main(String[] args) {
		//기본으로 생성해서 default값 확인
		//값을 넣고 생성해서 확인
		Car car1 = new Car(); 
		
		System.out.println("초기값 확인 :"+ car1.getName() + car1.getGas() + 
				car1.getDoor()+ car1.getColor());
		
		car1.setName("테슬라");
		car1.setGas(5000);
		car1.setDoor(5);
		car1.setColor("black");
		
		System.out.println("수정 후 :"+ car1.getName() + car1.getGas() + 
				car1.getDoor()+ car1.getColor());
		
	}

}
