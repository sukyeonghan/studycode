package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	
	private Shape s = new Shape();

	public SquareController() {
	// TODO Auto-generated constructor stub
	}
	
	public double calcPerimeter(double height, double width) {
		double round = height*2+width*2;
		return round;
	}
	
	public double calcArea(double height, double width) {
		double area = height*width;
		return area;
		
	}
	
	public void paintColor(String color) {
		//setter�� �̿��� �޾ƿ� �Ű������� �� ����
		s.setColor(color);
		
	}
	
	public String print() {
		//� ��������� Shape�� information()�޼ҵ��� ��ȯ �� ���� ��ȯ
		
		String square = "�簢�� "+s.information();
		return square;
	}

}