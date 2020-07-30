package data.com.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import data.com.vo.Product;

public class DataStream {

	public void addFile() {
		
		Scanner sc = new Scanner(System.in);
		
		Product[] products =new Product[5];
		
		System.out.println("===== ���� ��ǰ =====");
		
		for(int i=0; i<products.length; i++) {
			
			Product p = new Product();
			
			sc.nextLine();
			System.out.println("��ǰ�� : ");
			p.setName(sc.nextLine());
			System.out.println("���� : ");
			p.setPrice(sc.nextInt());
			System.out.println("���� : ");
			p.setNumber(sc.nextInt());
			System.out.println("������ : ");
			p.setDiscount(sc.nextDouble());		
			products[i]=p;
		}
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream
				(new FileOutputStream("product.dat"))) {
		
			oos.writeObject(products);
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
			
	}
	
	
	public void printFile() {
		
		
		Product[] products =new Product[5];
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("product.dat"))) {
			
			products = (Product[])ois.readObject();
			
		} catch(ClassNotFoundException c) {
			c.printStackTrace();
		
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		for(Product obj : products) {
			System.out.println(obj);
		}
	}
	
}
