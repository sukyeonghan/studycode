package com.oop.method;

import java.util.Scanner;

import com.oop.model.vo.Member1;
import com.oop.model.vo.Student;

//기능제공용 클래스
//여기에 메소드 다수 구현
public class Functional {
	//매개변수있는 생성자 없어서 기본생성자가 자동으로 만들어 진 것.
	//public Functional() {}
	
	//계산기 
	
	//매개변수가 없고 반환형도 없는 계산기 기능(+만)
	public void calculator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 계산기 프로그램 ===");
		System.out.print("정수 : ");
		int su = sc.nextInt();
		System.out.print("정수 : ");
		int su2 = sc.nextInt();
		System.out.println(su+"+"+su2+"="+(su+su2));
//		System.out.print("연산자(+,-,*,/)");
//		char op = sc.next().charAt(0);
		
		
	}
	
	//반환형 없고 매개변수 있는 메소드로 구현하기
	//계산하는 기능 구현. 이항연산 두 개 값이 정수
	//연산이 변경되려면 연산자도 매개변수로 받아야 함.
	public void calculator2(int su, int su2, String[] operation) {
		System.out.println("=== 계산기 프로그램 ===");
		System.out.println("정수 : "+su);
		System.out.println("정수 : "+su2);
		
		double result = 0;
//		밑과 같음
//		for(int i=0; i<operation.length; i++) {
//			switch(operation[i]) {
//			case "+" : result=su+su2; break;
//			case "-" : result=su-su2; break;
//			case "*" : result=su*su2; break;
//			case "/" : result=(double)su/su2; break;
//			}
//			System.out.println(su+operation[i]+su2+"="+(result));
//		}
		
		for(String op : operation) { //for each문 -0번 인덱스부터 하나씩 들어감
			switch(op) { 
			case "+" : result=su+su2; break;
			case "-" : result=su-su2; break;
			case "*" : result=su*su2; break;
			case "/" : result=(double)su/su2; break;
		}
		
		System.out.println(su+op+su2+"="+(result));
		}
	}
	//이거 호출하면 얘에 대한 stack이 생성됐다가 실행끝나면 없어진다
	
	//반환형이 있고 매개변수가 없는 메소드 구현
	//두 개의 수를 더하고 그 결화를 반환하는 기능
	public int calculator3() { 
		//반환형(지금 int)있으면 {}안에 반드시 return이라는 예약어가 있어야 함!!!!
		System.out.println("=== 계산기 프로그램 ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int su = sc.nextInt();
		System.out.print("정수 : ");
		int su2 = sc.nextInt();
		return su+su2; //return 뒤에 반환형과 일치하는 자료형 변수/리터럴 옴
		//return은 단 한 개의 자료형만 가능!여러 개 값 보내고 싶으면 배열이나 객체 사용
	}
	
	//반환형이 있고 매개변수가 있는 메소드 구현
	public int calculator4(int su, int su2) {
		return su+su2;
	}
	
	//문자열 두 개를 전달받고 두 문자열을 결합하고 리턴해주는 메소드 만들기
	//반환형 있고 매개변수 있는 메소드
	public String str(String str1, String str2) {
		return str1+str2;
		
	}
	
	//정수 두 개를 전달받아 첫 번째 수부터 두 번째 수까지 합을 리턴해주는 메소드
	//단, 무조건 첫 번째 수가 커야함. 만약 작으면 에러 출력

	public int print(int first, int second) {
		int result=0;
		if(first<second) {
			System.out.println("에러출력!");
		} else {
			for(int i=second; i<=first; i++) {
				result+=i;
			}
		}
		return result;
	}
	
	//내가 한 거. 반환형 없고 매개변수 있는 메소드
	public void su(int su1, int su2) {
		if(su1>su2) {
			System.out.println(su1+su2);
		} else {
			System.out.println("에러");
		}
	}
	
	//문자 한 개를 전달받아 영문자인지 확인 후 결과를 리턴해주는 메소드 
	//true/false
	//변환형 있고 매개변수 있는 메소드
	
	public boolean checkChar(char check) {
		return ('a'<=check&&check<='z')||
								('A'<=check&&check<='Z');
		
	}
	
	//배열을 매개변수로 받는 메소드 생성
	public void updateArray(int[] nums) {
		//배열을 입력받는 값으로 초기화하기
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 배열 수정하기 ===");
		
		for(int i=0; i<nums.length; i++) { //4회전
			System.out.print("수정값 : ");
			nums[i]=sc.nextInt();
		}
	}
	
	//기본 자료형을 매개변수로 받고 수정하기 -> 안 됨!
	//아까는 같은 주소값이어서 원본값도 수정되지만 이건 아님.
//	public void basicUpdate(int su) {
//		su=200;
//	}
	
	public int basicUpdate() {
		return 200;
	}
	
	
	//student 객체를 만들고 이름,학년,반,번호,키,몸무게 
	//기본으로 자신의 정보로 세팅하고
	//studentUpdate매소드를 만들어 입력받은 값으로 수정한 뒤 출력하기
	//1.첫 번쨰 방법-반환없고 매개있고
	//접근해서 수정이니까 이게 더 효율적. 따로 메모리 추가적으로 확보안하고 있는 거 쓰니까
	public void studentUpdate(Student s) {
		//s를 수정해라. 수정할 값을 받음
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====학생정보수정====");
		System.out.print("이름 : ");
		String name=sc.next();
		System.out.print("학년 : ");
		int grade=sc.nextInt();
		System.out.print("반 : ");
		int rclass=sc.nextInt();
		System.out.print("번호 : ");
		int number=sc.nextInt();
		System.out.print("키 : ");
		double height=sc.nextDouble();
		System.out.print("몸무게 : ");
		double weight=sc.nextDouble();
		
		//전달된 매개변수 값을 수정
		s.setName(name);
		s.setGrade(grade);
		s.setRclass(rclass);
		s.setNumber(number);
		s.setHeight(height);
		s.setWeight(weight);
	}
	
	//2.두 번째 방법 학생정보 수정하는 로직 - 반환 있고 매개 없고
	//gc가 힙영역에 생성된 스튜던트 지우지 않는 이상 저장공간 살아있음
	public Student studentUpdate() {
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("====학생정보수정====");
		System.out.print("이름 : ");
		String name=sc.next();
		System.out.print("학년 : ");
		int grade=sc.nextInt();
		System.out.print("반 : ");
		int rclass=sc.nextInt();
		System.out.print("번호 : ");
		int number=sc.nextInt();
		System.out.print("키 : ");
		double height=sc.nextDouble();
		System.out.print("몸무게 : ");
		double weight=sc.nextDouble();
		Student s=new Student(name,grade,rclass,number,height,weight);
		//new했으니까 새로운 저장공간 생성
		return s;
		
	}
	
	
		//이름, 나이, 전화번호를 전달받고 그 내용을 string으로 반환하여 출력하기
		//insertMember 메소드 만들기
		//id,pw,name,email,addr을 전달받아 Member 객체를 생성하여 출력.*반환함
	
		public Member1 insertMember() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("아이디 : ");
			String id=sc.nextLine();
			System.out.print("비번 : ");
			String pw=sc.nextLine();
			System.out.print("이름 : ");
			String name=sc.nextLine();
			System.out.print("이메일 : ");
			String email=sc.nextLine();
			System.out.print("주소 : ");
			String address=sc.nextLine();
			
			Member1 mem = new Member1(id,pw,name,email,address);
			return mem;
			
		}
}
