package com.oop.model.vo;

public class Circle {
	
	private final double PI=3.14;
	private int radius = 1;
	
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public void incremenRadius() {
		radius=radius+1;
		
	}
	
	public void getSizeOfCircle() {
		//�� �ѷ�
		double size = 2*PI*radius;
		System.out.println(size);
	}
	
	public void getAreaofCircle() {
		//�� ����
		double area = PI*radius*radius;
		System.out.println(area);
	}
	
	

}
