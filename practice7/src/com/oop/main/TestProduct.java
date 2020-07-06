package com.oop.main;

import com.oop.model.vo.Product;

public class TestProduct {
	
	public static void main(String[] args) {
	
		Product pro1 = new Product("ssgnote6","�����ó�Ʈ6","��⵵����",960000,10.0);
		Product pro2 = new Product("lgxnote","LG����Ʈ��5","��⵵����",780000,0.7);
		Product pro3 = new Product("ktnorm3","KT�Ϲ���3","����ð���",25000,0.3);
		
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
		System.out.println("��ǰ�� : "+pro1.getProductName());
		System.out.println("�ΰ��� ���� ���� : "+newPrice(pro1.getPrice(),pro1.getTex()));
		System.out.println("��ǰ�� : "+pro2.getProductName());
		System.out.println("�ΰ��� ���� ���� : "+newPrice(pro2.getPrice(),pro2.getTex()));
		System.out.println("��ǰ�� : "+pro3.getProductName());
		System.out.println("�ΰ��� ���� ���� : "+newPrice(pro3.getPrice(),pro3.getTex()));
	}

	public static int newPrice(int a,double b) {
		int result = a+(int)(a*b);
		return result;
	}
}
