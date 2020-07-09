package com.kh.practice.token.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LeapController {

	public boolean isLeapYear(int year) {
		//연도가 윤년이면 true, 평년이면 false리턴
		//윤년 : 연도가 4의 배수이면서, 100의 배수가 아니거나 400의 배수가 되는 해
		
//		GregorianCalendar gc = new GregorianCalendar();
//		Calendar c = Calendar.getInstance();
////		
////		gc = new GregorianCalendar(year);
////		int year2 = year.get(Calendar.YEAR);
//		
//		Date birth2 = new Date(gc.getTimeInMillis());
//		gc.set(Calendar.YEAR,year);
//		int year2 = c.get(Calendar.YEAR);
		if(year%4==0 && year%100!=0||year%400==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public long leapDate(Calendar c) {
		//1년 1월 1일부터 오늘까지의 총 날짜 수를 계산
		//1년부터 현재 연도까지 각 연도가 윤년이면 총 날수에 366일을,
		//평년이면 365일을 더함
		//현재 연도가 윤년이면 2월을 29일로, 평년이면 28일로 더함
		//1,3,5,7,8,10,12월 - 31일 , 4,6,9,11 - 30일
		
		GregorianCalendar gc = new GregorianCalendar(1,0,1);
		
		
		
	}
}
