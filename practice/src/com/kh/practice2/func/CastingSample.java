package com.kh.practice2.func;

import java.lang.Integer;
import java.util.Scanner;

public class CastingSample {
	
	public void pointBitCount() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int su1 = sc.nextInt();
		System.out.printf("%d�� 2������ ���Ե� 1�� ���� : %d",su1,Integer.bitCount(su1));
		
		
	}

}
