package com.oper.single;

public class BitOperator {
	
	public static void main(String[] args) {
		//��Ʈ ���� Ȯ���ϱ�
		//&, |, ^
		//����Ʈ ���� ���ϱ�(*2), ������(/2)
		int a=10, b=22;
		String basic="00000000000000000000000000000000";
		//a��Ʈ��
		String bit=basic+Integer.toBinaryString(a);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//b��Ʈ��
		bit=basic+Integer.toBinaryString(b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//a&b���� - �� �� 1�� �� 1 
		bit=basic+Integer.toBinaryString(a&b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//a|b���� - �ϳ��� 1�� �� 1
		bit=basic+Integer.toBinaryString(a|b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//a^b - �� ���� �ٸ��� 1
		bit=basic+Integer.toBinaryString(a^b);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//~a �μ�
		bit=basic+Integer.toBinaryString(~a);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//a<<1 - 2���ϱ�, 2ĭ �ű�� *4, 3ĭ �ű�� *8
		bit=basic+Integer.toBinaryString(a<<1);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		//a>>1 - 2������
		bit=basic+Integer.toBinaryString(a>>1);
		bit=bit.substring(bit.length()-32);
		System.out.println(bit);
		
		
	}

}
