package com.oop.main;

import com.oop.model.vo.Circle;
import com.oop.model.vo.Lotto;

public class Field {
	
	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		c.getSizeOfCircle();
		c.getAreaofCircle();
		
		c.incremenRadius();
		c.getSizeOfCircle();
		c.getAreaofCircle();
		
		Lotto l = new Lotto();
		
		l.information();
	}

}
