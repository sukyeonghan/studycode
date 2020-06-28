package com.oop.model.vo;

public class Car {
	//car 객체생성/모델명,배기량,도어수,색상
	private String name;
	private int gas;
	private int door;
	private String color;
	
	public Car() {}
	
	public Car(String name, int gas, int door, String color) {
		this.name=name;
		this.gas=gas;
		this.door=door;
		this.color=color;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setGas(int gas) {
		this.gas=gas;
	}
	public int getGas() {
		return gas;
	}
	public void setDoor(int door) {
		this.door=door;
	}
	public int getDoor() {
		return door;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
}
