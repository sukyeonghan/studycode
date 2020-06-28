package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	
	Shape s = new Shape();
	
	public TriangleController() {
		// TODO Auto-generated constructor stub
	}
	
	public double calcPerimeter(double height, double width) {
		double round = height*2+width*2;
		return round;
	}
	
	public double calcArea(double height, double width) {
		double area = (height*width)/2;
		return area;
		
	}
	
	public void paintColor(String color) {
		//setter를 이용해 받아온 매개변수로 값 변경
		s.setColor(color);
		
	}
	
	public String print() {
		//어떤 모양인지와 Shape의 information()메소드의 반환 값 합쳐 반환
		
		String tri = "삼각형 "+s.information();
		return tri;
	}
	
	

}
