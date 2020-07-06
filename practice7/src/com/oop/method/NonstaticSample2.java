package com.oop.method;

public class NonstaticSample2 {
	
	public int[] intArrayAllocation(int a) {
		//전달받은 정수 갯수만큼의 배열공간을 할당하여
		//임의의 숫자 1부터 100사이의 값을 기록하고 주소 리턴하기
		int[] intArr = new int[a];
		for(int i=0; i<a; i++) {
			intArr[i]= (int)((Math.random()*+100)+1);
		}
		return intArr;
	}
	
	public void display(int[] intArr) {
		//배열을 전달받아 화면에 출력하기
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}
	
	public static void swap(int[] intArr, int in1, int in2) {
		//배열과 두 정수의 인덱스를 전달받아 두 인덱스의 값을 교환함
		int result1 = intArr[in1];
		intArr[in1] = intArr[in2];
		intArr[in2]= result1;
		
	}
	
	public void sortDescending(int[] intArr) {
		//swap메소드를 이용하여 배열의 값들을 내림차순으로 정렬함
		for(int i=0; i<intArr.length; i++) {
			for(int j=i+1; j<intArr.length; j++) {
				if(intArr[i]<intArr[j]) {
					swap(intArr,i,j);
				}
			}
		}
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}
	
	public void sortAscending(int[] intArr) {
		//swap메소드를 이용하여 배열의 값들을 오름차순으로 정렬함
		for(int i=0; i<intArr.length; i++) {
			for(int j=i+1; j<intArr.length; j++) {
				if(intArr[i]>intArr[j]) {
					swap(intArr,i,j);
				}
			}
		}
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}
	
	public void countChar(String str, char ch) {
		//문자열과 문자 하나를 전달 받아, 문자열에 포함된 문자의 갯수를 리턴
		int count=0;
		char[] strr = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			strr[i]=(str.charAt(i));
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.print("문자열 개수 : "+count);
	}
	
	public void totalValue(int su, int su1) {
		//정수 두 개를 전달받아, 두 수중 작은 값에서 큰 값사이의 정수들의 합계를 리턴
		int sum=0;
		
		if(su<su1) {
			for(int i=su; i<=su1; i++) {
				sum+=i;
			} 
		} else if (su1<su){
			for(int i=su1; i<=su; i++) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	
	
	public String pCharAt(String str3, int su3) {
		//문자열과 인덱스를 전달받아, 그 위치의 문자를 리턴
		String ch3 = str3.substring(su3, su3+1);
		return ch3;
	}

	public String pConcat(String str4, String str5) {
		//두 개의 문자열을 전달받아, 하나의 문자열로 합쳐서 리턴
		String sumStr = str4+str5;
		return sumStr;
	}
}
