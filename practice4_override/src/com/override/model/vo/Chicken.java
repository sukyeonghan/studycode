package com.override.model.vo;

public class Chicken extends Animal{

	public Chicken( String name, String category, int leg) {
		super(name,category,leg);
	}
	
	@Override
	public String action() {
		return "²¿³¢¿À~ Ä¡Å² ¸ÀÀÌ´Ù!";
	}
}
