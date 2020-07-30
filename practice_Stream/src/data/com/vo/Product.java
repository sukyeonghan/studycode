package data.com.vo;

import java.io.Serializable;

public class Product implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9104349921967002737L;
	
	private String name;
	private int price;
	private int number;
	private double discount;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(String name, int price, int number, double discount) {
		super();
		this.name = name;
		this.price = price;
		this.number = number;
		this.discount = discount;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", number=" + number + ", discount=" + discount + "]";
	}


	
	
	

}
