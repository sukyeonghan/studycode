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
		//setter�� �̿��� �޾ƿ� �Ű������� �� ����
		s.setColor(color);
		
	}
	
	public String print() {
		//� ��������� Shape�� information()�޼ҵ��� ��ȯ �� ���� ��ȯ
		
		String tri = "�ﰢ�� "+s.information();
		return tri;
	}
	
	

}
