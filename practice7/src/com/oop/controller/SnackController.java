package com.oop.controller;

import com.oop.model.vo.Snack;

public class SnackController {
	
	Snack s = new Snack();

	public SnackController() {
		// TODO Auto-generated constructor stub
	}
	
	public String saveData(String kind, String name, 
			String flavor, int numOf, int price) {
		
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		 
		return "저장완료되었습니다.";
	}
	
	public String confirmData() {
	
		return s.information();
	}

}
