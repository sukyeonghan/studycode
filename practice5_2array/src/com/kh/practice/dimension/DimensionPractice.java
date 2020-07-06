package com.kh.practice.dimension;

public class DimensionPractice {
	
	public void practice1() {
		//3�� 3��¥�� ���ڿ� �迭�� ���� �� �Ҵ��ϰ�
		//�ε��� 0�� 0������ 2�� 2������ ���ʴ�� �����Ͽ� "(0,0)"�� ���� �������� ���� �� ��� 
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
		//4�� 4��¥�� ������ �迭�� ���� �� �Ҵ��ϰ�
		//1~16���� ���� ���ʴ�� �����ϱ�
		//����� ������ ���ʴ�� ����ϱ�
		
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
		//4�� 4��¥�� ������ �迭�� ���� �� �Ҵ��ϰ�
		//16~1�� ���� ���� �Ųٷ� �����ϰ� ����ϱ�
		
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
		//4�� 4�� 2���� �迭�� �����Ͽ� 0�� 0������ 2�� 2��������
		//1~10������ ������ ���� �� ���� �� �Ʒ��� ����ó�� ó���ϱ�
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
