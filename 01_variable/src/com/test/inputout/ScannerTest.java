package com.test.inputout;
//1.키보드에 입력된 값을 가져오기 위해 Scanner객체 이용
import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
	
		//2.Scanner 생성  
		Scanner sc=new Scanner(System.in);
		
		//3.Scanner가 제공하는 기능(메서드)을 이용해서 값을 받아옴.
		//nextInt() : 정수, nextFloat() 또는 nextDouble() : 실수
		//next() 또는 nextLine() : 문자열
		
		//sc.nextInt();
		//하면 아무것도 안보임. 빨간 박스 보임-runtime 중이다.
		//입력하는 것을 대기 중.
		//콘솔에 19입력하고 엔터치면 프로그램 종료(빨간불 꺼짐)정수리터럴로 변환
		//sc.nextInt();에 값 저장 됨
		//밑에서 이용하려면 변수에 저장해야 함
		//System.out.println(sc.nextInt());
		
		System.out.print("당신의 주소 : ");
		String address=sc.nextLine();
		System.out.println("주소 : "+address);
		
		System.out.print("나이를 입력 : ");
		//클라이언트에게 무엇을 입력할지 설명함
		int age=sc.nextInt();
		System.out.println("당신이 입력한 나이는 : "+age);
		
		System.out.print("문자입력 : ");
		String msg=sc.next();
		//띄어쓰기를 기준으로 띄어쓰기 앞에 글자만 가져옴
		//저녁 맛있게 먹었어요? - '저녁'만 나오고 뒤 글자들은 버퍼(임시 저장)됨.뒤에서 출력하려 함
		//띄어쓰기까지 모두 포함하려면 sc.nextLine(); 써야 함.
		sc.nextLine();//버퍼를 비워주는 역할!
		System.out.println("당신이 입력한 문자는 : "+msg);
		//위 age 실행하고 문자도 실행
		//유동적으로 변할 수 있는 값들임.
		
		System.out.print("당신의 키 : ");
		double height=sc.nextDouble();
		System.out.println("당신의 키는 : "+height+"cm");
		
		sc.nextLine();
		//sc.nextChar();는 없음
		//char형으로 입력받기!
		//문자열로 가져와서 따로 떼어내기-charAt();
		System.out.print("성별 : ");//한수경
		char gender=sc.nextLine().charAt(0);
		//charAt(글자 위치); 0,1,2..순서로 감
		System.out.println(gender);
		
		
		
		
	}
	
}
