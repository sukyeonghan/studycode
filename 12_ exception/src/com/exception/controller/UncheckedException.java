package com.exception.controller;

import java.util.Calendar;
import java.util.Date;

public class UncheckedException {
	
	public static void main(String[] args) {
		
		// UncheckedException �ڵ� �󿡼� �����ڰ� ó������ �ʾƵ� �Ǵ� Exception
		int a = 0;
		int b = 10;
		//System.out.println(b/a); //ArithmeticException �߻�
		
		String name = null;
		//System.out.println(name.charAt(0)); //NullPointerException �߻�
		
		//int[] nums = new int[-3]; //NegativeArraySizeException �߻�
		//������ �ÿ��� ���� �ȳ����� ��Ÿ�ӽ� ���� �߻� ��� �� ����
		int[] nums = new int[2];
		//System.out.println(nums[3]);//ArrayIndexOutOfBoundsException �߻�
		
		//�ذ� ����
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("����");
//			int cho = sc.nextInt();
//			if(cho==0) break;
//			try {
//				System.out.println(nums[3]);
//			}catch(ArrayIndexOutOfBoundsException e) {
//				nums = new int[nums.length+5];
//				System.out.println("�ذ���");
//			}
//			
//		}
		
		Object obj = new Date();
		//Calendar c =(Calendar)obj; //ClassCastException �߻�
		
		//���ܴ� ������ �߻���ų �� ����
		//throw���� �̿��ؼ� Exception�� �߻���Ŵ
		throw new NullPointerException("����!����~");
		
		//���ܰ� �߻��� ��ġ ����ϴ� �޼ҵ� : printStackTrace()
		
		
		
		
	}

}
