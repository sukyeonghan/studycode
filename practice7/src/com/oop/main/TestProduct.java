package com.oop.main;

import com.oop.model.vo.Product;

public class TestProduct {
	
	public static void main(String[] args) {
	
		Product pro1 = new Product("ssgnote6","갤럭시노트6","경기도수원",960000,10.0);
		Product pro2 = new Product("lgxnote","LG스마트폰5","경기도평택",780000,0.7);
		Product pro3 = new Product("ktnorm3","KT일반폰3","서울시강남",25000,0.3);
		
		pro1.information();
		pro2.information();
		pro3.information();
		System.out.println();
		
		pro1.setPrice(1200000);
		pro2.setPrice(1200000);
		pro3.setPrice(1200000);
		pro1.setTex(0.5);
		pro2.setTex(0.5);
		pro3.setTex(0.5);
		
		pro1.information();
		pro2.information();
		pro3.information();
		System.out.println();
		
		pro1.setTex(0.05);
		pro2.setTex(0.05);
		pro3.setTex(0.05);
		System.out.println("상품명 : "+pro1.getProductName());
		System.out.println("부가세 포함 가격 : "+newPrice(pro1.getPrice(),pro1.getTex()));
		System.out.println("상품명 : "+pro2.getProductName());
		System.out.println("부가세 포함 가격 : "+newPrice(pro2.getPrice(),pro2.getTex()));
		System.out.println("상품명 : "+pro3.getProductName());
		System.out.println("부가세 포함 가격 : "+newPrice(pro3.getPrice(),pro3.getTex()));
	}

	public static int newPrice(int a,double b) {
		int result = a+(int)(a*b);
		return result;
	}
}
