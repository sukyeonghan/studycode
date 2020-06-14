package kh.java.operator;

import java.util.Scanner;

public class TestOperator {
	
	Scanner sc=new Scanner(System.in);
	
	public void test1 () {
		//3자리 이상의 숫자를 입력 받아 백의 자리 이하를 버리는 코드 작성하기
		
		System.out.print("숫자 입력 : ");
		int su1=sc.nextInt();
		System.out.println((su1/100)*100);
	}
	
	public void test2 () {
		//총 과일의 갯수, 한 개의 바구니에 들어가는 과일의 갯수를 입력받아
		//과일을 모두 담으려면 몇 개의 바구니가 필요한지와
		//마지막 바구니에 들어가는 과일의 수 확인하는 코드 작성하기
		
		System.out.print("과일 개수 :");
		int su3=sc.nextInt();
		System.out.print("바구니 과일 수 :");
		int su4=sc.nextInt();
		int result1=su3/su4+(su3%su4>0?1:0);
		System.out.printf("%d의 과일을 담으려면 %d개가 필요합니다.",su3,result1);
		System.out.println("마지막 바구니에 들어가는 과일의 수 :"+su3%su4);
		
	}
	
	public void test3 () {
		//영어 하나의 문자를 입력하여 대문자는 소문자로, 소문자는 대문자로 변경하기
		
		System.out.print("문자 입력 : ");
		char str1=sc.nextLine().charAt(0);
		System.out.println('A'<=str1&&str1<='Z'?(char)(str1+32):('a'<=str1&&str1<='z'?(char)(str1-32):str1));
		
	}
	
}
