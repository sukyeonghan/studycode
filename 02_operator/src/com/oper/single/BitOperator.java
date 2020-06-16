package com.oper.single;

public class BitOperator {
	
	public static void main(String[] args) {
		//비트 연산 확인하기
		//&, |, ^
		//쉬프트 연산 곱하기(*2), 나누기(/2)
		int a=10, b=22;
		String basic="00000000000000000000000000000000";
		//a비트값
		String bit=basic+Integer.toBinaryString(a);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//b비트값
		bit=basic+Integer.toBinaryString(b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//a&b연산 - 둘 다 1일 때 1 
		bit=basic+Integer.toBinaryString(a&b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//a|b연산 - 하나라도 1일 때 1
		bit=basic+Integer.toBinaryString(a|b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//a^b - 두 값이 다르면 1
		bit=basic+Integer.toBinaryString(a^b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//~a 부수
		bit=basic+Integer.toBinaryString(~a);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//a<<1 - 2곱하기, 2칸 옮기면 *4, 3칸 옮기면 *8
		bit=basic+Integer.toBinaryString(a<<1);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//a>>1 - 2나누기
		bit=basic+Integer.toBinaryString(a>>1);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		
		
	}

}
