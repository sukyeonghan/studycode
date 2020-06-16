package com.kh.practice2.func;

import java.lang.Integer;
import java.util.Scanner;

public class CastingSample {
	
	public void pointBitCount() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int su1 = sc.nextInt();
		System.out.printf("%d의 2진수에 포함된 1의 갯수 : %d",su1,Integer.bitCount(su1));
		
		
	}

}
