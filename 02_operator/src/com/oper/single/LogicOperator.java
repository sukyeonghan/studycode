package com.oper.single;

import java.util.Scanner;

public class LogicOperator {
	
	public static void main(String[] args) {
		//논리 연산자 활용하기
		//논리 연산은 두 개의 논리를 배교하는 연산자
		//주로 비교연산자를 연결하여 사용함
		//결과값은 논리(true,false);
		//1<10<20이니? 범위 나타낼 때 논리연산 중 &&연산으로 함
		int su=10;
		System.out.println(1<su&&su<20);
		//System.out.println(1<su||su<20);
		//이렇게 되면 전제 정수 포함. 다 true
		System.out.println(1>su||su>20);
		//특정 범위 제외할 때 사용
		
		
		//1. 티켓 있고 키 140cm 이상
	    boolean ticket=true;
	    double height=130.9;
		System.out.println(ticket&&height>=140);
		
		//2. id가 admin이고 패스워드가 1234인 사람. 입력받아서 비교하기
		Scanner sc=new Scanner(System.in);
		
		System.out.print("id : ");
		String id=sc.nextLine();
		System.out.print("password : ");
		String password=sc.nextLine();
		System.out.println(id+" "+password);
		System.out.println(id.contentEquals("admin")
				&&password.contentEquals("1234"));
		
		//3. 티켓이나 초대장이 있으면 입장, 아니면 입장불가
		//티켓은 1234, 초대장은 4444
		
		String ti="1234";
		String cho="4444";
		System.out.println(ti.contentEquals("1234")
				||cho.contentEquals("4444"));
		
		int ticket1=1234;
		int invate=0000;
		System.out.println(ticket1==1234||invate==4444);
		
		//논리연산은 다중으로 사용이 가능한가?? 가능함.
		//티켓이나 초대장이 있고 19살 이상인 사람
		int age=18;
		System.out.println((ticket1==1234||invate==4444)&&age>19);
		
		
		
		
		
	}

}
