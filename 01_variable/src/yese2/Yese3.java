package yese2;

import java.util.Scanner;

public class Yese3 {
	
	public static void main(String[] args) {
		
//		자신의 이름(String), 나이(int), 주소(String), 
//		키(double), 몸무게(double), 성별(char)를 입력
//		받고 출력하는 프로그램을 작성하세요.
//
//
//		  *몸무게는 첫째자리까지 출력
//		    키는 정수로 변환하여 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name=sc.next();
		
		System.out.print("나이 : ");
		int age=sc.nextInt();
		
		sc.nextLine();
		System.out.print("주소 : ");
		String address=sc.nextLine();
		
		System.out.print("키 :");
		double height=sc.nextDouble();
		
		System.out.print("몸무게 : ");
		double weight=sc.nextDouble();
		
		sc.nextLine();
		System.out.print("성별 : ");
		char gender=sc.nextLine().charAt(0);
		
		System.out.printf("%s,%d,%s,%d,%.1f,%c", name, age, address, (int)height, weight, gender);
			
	}	
	
}
