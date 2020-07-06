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
		//원 둘레
		double size = 2*PI*radius;
		System.out.println(size);
	}
	
	public void getAreaofCircle() {
		//원 넓이
		double area = PI*radius*radius;
		System.out.println(area);
	}
	
	

}
