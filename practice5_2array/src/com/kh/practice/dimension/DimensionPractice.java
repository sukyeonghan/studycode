package com.kh.practice.dimension;

public class DimensionPractice {
	
	public void practice1() {
		//3행 3열짜리 문자열 배열을 선언 및 할당하고
		//인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 "(0,0)"과 같은 형식으로 저장 후 출력 
		String[][] arr = new String[3][3];
		arr[0][0] = "(0,0)";
		arr[0][1] = "(0,1)";
		arr[0][2] = "(0,2)";
		arr[1][0] = "(1,0)";
		arr[1][1] = "(1,1)";
		arr[1][2] = "(1,2)";
		arr[2][0] = "(2,0)";
		arr[2][1] = "(2,1)";
		arr[2][2] = "(2,2)";
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void practice2() {
		//4행 4열짜리 정수형 배열을 선언 및 할당하고
		//1~16까지 값을 차례대로 저장하기
		//저장된 값들을 차례대로 출력하기
		
		int count=0;
		
		int[][] num = new int[4][4];
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				num [i][j] = ++count;
				System.out.print(count+" ");
			}
			System.out.println();
		}
		
		
		for(int[] t : num) {
			for(int v : t) {
				System.out.printf("%2d ", v);
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		//4행 4열짜리 정수형 배열을 선언 및 할당하고
		//16~1과 같이 값을 거꾸로 저장하고 출력하기
		
		int count = 16;
		int[][] num = new int[4][4];
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				num [i][j] = count--;
				System.out.print(num[i][j]+ " ");
			}
			System.out.println();
		}
		
		for(int[] t : num) {
			for(int v : t) {
				System.out.printf("%2d ", v);
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		//4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는
		//1~10까지의 임의의 정수 값 저장 후 아래의 내용처럼 처리하기
		int sum =0;
		int num[][] = new int[4][4];
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				num [i][j] = (int)(Math.random()*10)+1;
				num[i][j]+=sum;
				System.out.print(num[i][j]);
				System.out.println(sum);
			}
			System.out.println();
		}
		
			
		
		
	}
	

}
