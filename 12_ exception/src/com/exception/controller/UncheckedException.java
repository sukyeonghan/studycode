package com.exception.controller;

import java.util.Calendar;
import java.util.Date;

public class UncheckedException {
	
	public static void main(String[] args) {
		
		// UncheckedException 코드 상에서 개발자가 처리하지 않아도 되는 Exception
		int a = 0;
		int b = 10;
		//System.out.println(b/a); //ArithmeticException 발생
		
		String name = null;
		//System.out.println(name.charAt(0)); //NullPointerException 발생
		
		//int[] nums = new int[-3]; //NegativeArraySizeException 발생
		//컴파일 시에는 에러 안나지만 런타임시 에러 발생 출력 후 멈춤
		int[] nums = new int[2];
		//System.out.println(nums[3]);//ArrayIndexOutOfBoundsException 발생
		
		//해결 예시
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("선택");
//			int cho = sc.nextInt();
//			if(cho==0) break;
//			try {
//				System.out.println(nums[3]);
//			}catch(ArrayIndexOutOfBoundsException e) {
//				nums = new int[nums.length+5];
//				System.out.println("해결함");
//			}
//			
//		}
		
		Object obj = new Date();
		//Calendar c =(Calendar)obj; //ClassCastException 발생
		
		//예외는 강제로 발생시킬 수 있음
		//throw예약어를 이용해서 Exception을 발생시킴
		throw new NullPointerException("히힛!에러~");
		
		//예외가 발생한 위치 출력하는 메소드 : printStackTrace()
		
		
		
		
	}

}
