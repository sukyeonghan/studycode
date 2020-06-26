package com.override.model.vo;

public class Lion extends Animal {
	
	public Lion( String name, String category, int leg) {
		super(name,category,leg);
	}	
	
	@Override
	public String action() {
		return "크아앙~ 사자~";
	}
}
