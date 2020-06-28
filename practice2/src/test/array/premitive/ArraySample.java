package test.array.premitive;

import java.util.Scanner;
import java.util.Calendar;

public class ArraySample {
	
	public void test1() {
		//10개의 int배열 선언하고 할당
		//각 방에 1~100 사이의 임의의 난수를 기록
		//10개의 정수들의 합계를 구하여 출력하기
		
		int [] su = new int [10];
		int sum = 0;
		
		for(int i=0; i<10; i++) {
			su[i] = ((int)(Math.random()*100)+1);
			sum+=su[i];
		}
		System.out.println(sum);
	}
	
	public void test2() {
		//10개의 int 선언, 할당
		//1~100사이의 임의의 정수를 발생시켜 기록하기
		//10개 값 중 최대값과 최소값 출력하기
		
		int [] su = new int [10];
		int max = su[0];
		int min = su[0];
		
		for(int i=0; i<10; i++) {
			su[i] = ((int)(Math.random()*100)+1);		
		}
		for(int j=0; j<10; j++) {
			if(max<su[j]) {
				max=su[j];
			}
			if(min>su[j]) {
				min=su[j];
			}
		}
		System.out.println("최대값 : "+max+"\n최소값 :"+min);
	}
	
	public void test3() {
		//10개의 byte 배열 선언 및 할당
		//임의의 난수를 기록하고 짝수들의 합계만 구하여 출력하기
		
		byte [] su = new byte[10];
		int sum = 0; //바이트로 더하면 최대값127을 넘어서면 최소값-128으로 돌아감!
		
		for(int i=0; i<10; i++) {
			su[i] = ((byte)(Math.random()*Byte.MAX_VALUE));
			if(su[i]%2==0) {
				System.out.print(su[i]+" ");
				sum+=su[i];
			}
		}
		System.out.println("짝수합 :"+sum);
	}

	public void test4() {
		//숫자로 된 문자열을 입력받아 각 자리의 숫자들의 합을 구하여 출력하기
		//substring() 메소드 활용
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자로 된 문자열을 입력하세요 :");
		String suString = sc.next();
		
		String [] str = new String[suString.length()];
		int sum = 0;
		
		for(int i=0; i<suString.length(); i++) {
			str[i] = suString.substring(i,i+1);
			//문자열.substring(시작위치, 끝나는 위치)
			//문자열 시작위치부터 끝나는 위치까지 발췌
			//시작 위치부터 끝까지 문자열 자르기
			//-3 마지막 3글자
			sum+=Integer.parseInt(str[i]);
		}
		System.out.println("합계 : "+ sum);
	}
	
	public void test5() {
		//숫자로 된 문자열을 입력받아 각 자리의 숫자들의 합을 구하여 출력하기
		//substring() 메소드 활용//배열 안쓰고 함
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자로 된 문자열을 입력하세요 :");
		String suString = sc.next();
		
		
		int sum = 0;
		
		for(int i=0; i<suString.length(); i++) {
		
			sum+=Integer.parseInt(suString.substring(i,i+1));
		}
		System.out.println("합계 : "+ sum);
	}
	
	public void test6() {
		//숫자로 된 문자열을 입력받아 각 자리의 숫자들의 합을 구하여 출력하기
		//charAt() 메소드 활용
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자로 된 문자열을 입력하세요 :");
		String suString = sc.next();
		
		String [] str = new String[suString.length()];
		int sum = 0;
		
		for(int i=0; i<suString.length(); i++) {
			sum += suString.charAt(i) - '0';
			//char형 int형으로 바꾸기
			//char - '0' 을 이용하면 아스키코드값 필요없이 int변환 가능
		}
		System.out.println("합계 :"+sum);	
	}
	
	public void test7() {
		//문자열 변수를 초기화한 후 
		//생년,생월,생일,성별에 대한 값을 분리 추출하기 - substring() 사용
		//java.util.Date 등을 사용해서 추출한 생년월일 값으로 날짜 데이터 만들기
		//생일의 요일이 무슨 요일이었는지 제공되는 메소드를 사용해서 출력하기
		//성별값이 1이면 남자, 2면 여자라고 출력하기
		//날짜 데이터로 바꾼 값에서 오늘 날짜의 년도를 빼서 나이 출력하기
		
		String personID = "881225-1234567";
		int myYear = Integer.parseInt(personID.substring(0,2))+1900;
		int myMonth = Integer.parseInt(personID.substring(2,4));
		int myDate = Integer.parseInt(personID.substring(4,6));
		int gender = Integer.parseInt(personID.substring(7,8));
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		
		System.out.println(myYear+""+ myMonth+ ""+myDate);
		cal.set(myYear, myMonth, myDate);
		
		int whatDay = cal.get(Calendar.DAY_OF_WEEK);
		
		String day = "";
		switch(whatDay) {
		case 1 : day="일"; break;
		case 2 : day="월"; break;
		case 3 : day="화"; break;
		case 4 : day="수"; break;
		case 5 : day="목"; break;
		case 6 : day="금"; break;
		case 7 : day="토"; 
		
		}
	
		System.out.print(day+"요일");
		
		if(gender==1) {
			System.out.println("\n남자");
		} else {
			System.out.println("\n여자");
		}
		
		int age = year-myYear;
		System.out.println(age+1);
	}

}
