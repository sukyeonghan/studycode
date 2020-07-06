package com.exception.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TryCatchClass {
	
	public static void main(String[] args) {
		//try ~ catch 구문으로 예외처리하기
		

		Scanner sc = new Scanner(System.in);
		//입력받은 문자열의 3번째 값을 출력하기
		for(int i=0; i<3; i++) {
			System.out.println("문자입력 : ");
			String name = sc.nextLine();
			try { //꼭 예외 발생하는 구문만 넣지 않아도 됨. 
				System.out.println(name.charAt(2));//예외발생 가능한 구문
				System.out.println("계속 고고!"); //에러나면 밑 출력 안하고 건너 뜀. 안나면 읽음
			} catch (StringIndexOutOfBoundsException e) { //매개변수-Exception에 대한 정보를 저장
				//e.printStackTrace(); //오류 관련 정보 뜸. 이거 안 쓰면 계속 돌아가버림
				//a(); //다른 메소드 호출 가능. 다른 로직으로 넘어감 ex)mainview
				return; //더 이상 실행하지 말고 jvm으로 돌아가 종료.
			} finally {//return해도 무조건 실행
				System.out.println("프로그램 종료"); //에러 나든 안나든 무조건 실행되야 하는 구문일 경우
			}
				System.out.println("계속 고고!"); 
		}
		fileTry();
	}
	
	public static void fileTry() {
		
		File f = new File("test.txt");
		FileInputStream fis = null;//->밖에다가 지역변수로 선언
		try { //한 개의 try구문 안에 여러 Exception을 쓸 수 있다
			
			//FileInputStream fis = new FileInputStream(f);//얘는 반드시 닫아줘야 함. 데이터안정적으로 보관
			fis = new FileInputStream(f);
			//fis.close(); //스트림 닫기. 여기에 쓰면 건너뛰어버려서 안 먹힘!
			fis.read(); //파일을 불러옴. IOException;으로 처리해야 함
			
		} catch(FileNotFoundException e) {
			
		} catch(IOException e) {
			//예외마다 1개씩 catch문 써야 함. catch문의 순서가 중요!
			//여기서 catch문 위치 바꾸면 FileNotFoundException 쓸모없어짐 
			//범위가 작은 것부터 큰 순서대로 작성해야 함!
			//-> 각 상황별로 처리할 수 있음
			//Exception 하나로 다 처리할 수 있음
			//-> 그러나 어떤 Exception 발생했는지 알기 어려움. 알 필요없으면 이렇게 해도 됨
			
		}catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
//			if() {
//				
//			}

		} finally {//이 안에서도 예외 처리 가능
			try {
			fis.close(); //try{}안에 선언한 변수 {}벗어나면 쓸 수 없음
			//쓸 때마다 finally로 계속 닫아줘야함 -> 그래서 나온게 trywithresourceTest()
			} catch(IOException e) {
				e.printStackTrace(); //어떤 오류인지 확인해야하니까
			}
		}
	}
	
	
	public static void trywithresourceTest() {
		//try with resource : 객체를 반환(지우기)해줘야 하는 구문을 자동으로 생성해서 처리
		//try{   }catch(예외클래스 e){   }finally{try..   } - 이렇게 썼음
		//try(반환 객체의 선언/생성){   }catch(예외클래스 e){   } - 끝나면 알아서 닫음
		
		File f = new File("test.txt");
		try(FileInputStream fis = new FileInputStream(f);
				BufferedInputStream bis = new BufferedInputStream(fis);) {
			
			bis.read();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
