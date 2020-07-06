package com.oop.main;

import java.util.Scanner;

import com.oop.method.NonstaticSample;
import com.oop.method.StaticMethod;

public class Method {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//StaticMethod
		StaticMethod sm = new StaticMethod();
		
		sm.toUpper();
		
		sm.setChar(2,'g');
		 
		int num = sm.valueLength();
		System.out.println(num);
		
		String result = sm.valueConcat("fgh");
		System.out.println(result);
		
		//NonstaticSample
		NonstaticSample ns = new NonstaticSample();
		
		ns.printLottoNumbers();
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		char b = sc.nextLine().charAt(0);
		System.out.print("���ڸ� �� �� ����� �ǰ���?");
		int a = sc.nextInt();
		ns.outputChar(a,b);
		System.out.println();
		
		System.out.println(ns.alphabette());
		
		sc.nextLine(); //���۰� ���ִ� �� ����!!!
		
		System.out.println("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		System.out.println("���� �ε��� ��ȣ : ");
		int in1 = sc.nextInt();
		System.out.println("�� �ε��� ��ȣ : ");
		int in2 = sc.nextInt();
		System.out.println(ns.mySubsting(str,in1,in2));
		
		
		
	}
	
}
