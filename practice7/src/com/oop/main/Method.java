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
		
		System.out.print("문자를 입력하세요 : ");
		char b = sc.nextLine().charAt(0);
		System.out.print("문자를 몇 번 출력할 건가요?");
		int a = sc.nextInt();
		ns.outputChar(a,b);
		System.out.println();
		
		System.out.println(ns.alphabette());
		
		sc.nextLine(); //버퍼값 없애는 거 주의!!!
		
		System.out.println("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		System.out.println("시작 인덱스 번호 : ");
		int in1 = sc.nextInt();
		System.out.println("끝 인덱스 번호 : ");
		int in2 = sc.nextInt();
		System.out.println(ns.mySubsting(str,in1,in2));
		
		
		
	}
	
}
