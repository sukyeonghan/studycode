package com.vari.scanner;

import java.util.Scanner;

public class SignThis {
	
	public static void main(String[] args) {
		//client 이름,나이,주소,전화번호,키
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("당신의 이름 : ");
		String name=sc.next();
		//여기서 nextLine();으로 받아도 됨.에러 안남.
		System.out.println("이름 : " + name);
		
		System.out.print("당신의 나이 : ");
		int age=sc.nextInt();
		System.out.println("나이 : " + age);
		
		//nextLine으로 값을 받기전에 nextInt(),next(), nextDouble() 등으로 이전에 값을 받아왔으면
		//입력버퍼를 sc.nextLine();으로 비워주고 사용해야 함!
		//위에 먼저 쓰고 실행해야함!
		sc.nextLine();
		System.out.print("당신의 주소 : ");
		String address=sc.nextLine();
		System.out.println("주소 : " + address);
		
		System.out.print("당신의 전화번호 : ");
		String phone=sc.next();
		System.out.println("전화번호 : " + phone);
		
		System.out.print("당신의 키 : ");
		double height=sc.nextDouble();
		System.out.println("키 : " + height + "cm");
		
		//System.out.println(name+" "+age+" "+phone+" "+) 으로 한 번에 받을 수 있음
	}

}
