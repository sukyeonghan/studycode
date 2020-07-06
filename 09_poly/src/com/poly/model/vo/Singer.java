package com.poly.model.vo;

public class Singer extends Person{
	
	private String title;
	private int year;
	private String genre;
	
	public Singer() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Singer(String title, int year, String genre) {
		super();
		this.title = title;
		this.year = year;
		this.genre = genre;
	}

	public Singer(String name, int age, String address, String title, int year, String genre) {
	super(name, age, address);
	this.title = title;
	this.year = year;
	this.genre = genre;
}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return getName()+getAge()+getAddress()+title+year+genre;
	}
	

}
