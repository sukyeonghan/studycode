package com.kh.practice.token.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LeapController {

	public boolean isLeapYear(int year) {
		//������ �����̸� true, ����̸� false����
		//���� : ������ 4�� ����̸鼭, 100�� ����� �ƴϰų� 400�� ����� �Ǵ� ��
		
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
		//1�� 1�� 1�Ϻ��� ���ñ����� �� ��¥ ���� ���
		//1����� ���� �������� �� ������ �����̸� �� ������ 366����,
		//����̸� 365���� ����
		//���� ������ �����̸� 2���� 29�Ϸ�, ����̸� 28�Ϸ� ����
		//1,3,5,7,8,10,12�� - 31�� , 4,6,9,11 - 30��
		
		GregorianCalendar gc = new GregorianCalendar(1,0,1);
		
		
		
	}
}
