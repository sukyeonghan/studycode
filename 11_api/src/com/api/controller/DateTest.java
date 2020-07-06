package com.api.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {
	public static void main(String[] args) {
		//날짜를 활용하게 하는 클래스들!
		//Date, Calendar, GregorianCalendar
		//Date
		//기본생성자, long값 넣기
		Date today = new Date(); //현재 날짜와 시간
		System.out.println(today);
		
		today = new Date(123456787874L);//숫자 계산해서 년월일 나눔
		System.out.println(today);
		
		//Calendar객체 활용하기
		//추상클래스, protected여서 new로 생성 못함
		//Calendar birthDay = new Calendar();
		Calendar birthDay = Calendar.getInstance();
		System.out.println(birthDay);
		//따로 필드에 접근해서 출력을 해야함
		//get()메소드 이용. 대문자사용!final이어서 
		//int로 반환됨
		System.out.println("년"+birthDay.get(Calendar.YEAR));
		System.out.println("월"+birthDay.get(Calendar.MONTH)+1);
		//MONTH는 0부터 시작됨. 넣을 때는 -1로 해야 함
		System.out.println("일"+birthDay.get(Calendar.DATE));
		System.out.println("시"+birthDay.get(Calendar.HOUR_OF_DAY));
		System.out.println("분"+birthDay.get(Calendar.MINUTE));
		System.out.println("초"+birthDay.get(Calendar.SECOND));
		
		int year = birthDay.get(Calendar.YEAR);
		int month = birthDay.get(Calendar.MONTH)+1;
		int date = birthDay.get(Calendar.DATE);
		System.out.println(year+"년"+month+"월"+date+"일");
		
		//TimeInMillis 지정된 날짜를 long타입으로 반환
		System.out.println(new Date(birthDay.getTimeInMillis()));
		
		//원하는 날짜 세팅하기
		//set메소드를 이용하여 날짜를 지정할 수 있음
		
		birthDay.set(1993,7-1,8,11,35,15);
		System.out.println(new Date(birthDay.getTimeInMillis()));
		
		//GregorianCalendar
		GregorianCalendar gc = new GregorianCalendar(); //현재날짜
		System.out.println(gc);
		//날짜 정보를 출력하려면 get
		printDate(gc);
//		int year1 = gc.get(Calendar.YEAR);
//		int month1 = gc.get(Calendar.MONTH)+1;
//		int date1 = gc.get(Calendar.DATE); 
//		System.out.println(year1+"년"+month1+"월"+date1+"일");
		//Calendar 객체에서는 지정날짜를 대일할 때 set을 이용
		gc = new GregorianCalendar(1993,(8-1),28);
//		year1 = gc.get(Calendar.YEAR);
//		month1 = gc.get(Calendar.MONTH)+1;
//		date1 = gc.get(Calendar.DATE);
//		date1++;
//		System.out.println(year1+"년"+month1+"월"+date1+"일");
		printDate(gc);
		
		//GregorianCalendar
		Date birth2 = new Date(gc.getTimeInMillis());
		System.out.println(birth2);
		//각 필드의 값을 수정
		gc.set(Calendar.YEAR,2021);
		//gc.set(1,2021);
		gc.set(Calendar.MONTH,(9-1));
		printDate(gc);
		//YEAR, MONTH..는 숫자여서 숫자로 써도 되지만 헷갈리니 써줌
		
		//날짜를 형식에 맞게 포멧팅해주기
		//00년 0월 0일  / 0000년 00월 00일
		//00.00.00  / 00-00-00
		//SimpleDateFormat 객체 이용
		//text패키지 안에 있음.
		//Date 객체를 형식에 맞게 문자열로 출력해주는 객체. 매개변수에 형식 넣기
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		//SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd");
		SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 dd일 E요일 a HH:mm:ss");
		//시간 24시간 기준 hh면 기본 12시/HH면 00시 / a면 오전, 오후
		//String strDate = sdf.format(birth2); //매개변수 자료형은 Date만 된다!!Calendar나 그레고리안은 안됨
		String strDate = sdf.format(gc.getTimeInMillis());
		System.out.println(strDate);
		
		
		
	}
	
	private static void printDate(Calendar c) { //캘린더가 부모여서 그레고리안도 쓸 수 있음
		int year1 = c.get(Calendar.YEAR);
		int month1 = c.get(Calendar.MONTH)+1;
		int date1 = c.get(Calendar.DATE); 
		System.out.println(year1+"년"+month1+"월"+date1+"일");
	}
}
