package com.api.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {
	public static void main(String[] args) {
		//��¥�� Ȱ���ϰ� �ϴ� Ŭ������!
		//Date, Calendar, GregorianCalendar
		//Date
		//�⺻������, long�� �ֱ�
		Date today = new Date(); //���� ��¥�� �ð�
		System.out.println(today);
		
		today = new Date(123456787874L);//���� ����ؼ� ����� ����
		System.out.println(today);
		
		//Calendar��ü Ȱ���ϱ�
		//�߻�Ŭ����, protected���� new�� ���� ����
		//Calendar birthDay = new Calendar();
		Calendar birthDay = Calendar.getInstance();
		System.out.println(birthDay);
		//���� �ʵ忡 �����ؼ� ����� �ؾ���
		//get()�޼ҵ� �̿�. �빮�ڻ��!final�̾ 
		//int�� ��ȯ��
		System.out.println("��"+birthDay.get(Calendar.YEAR));
		System.out.println("��"+birthDay.get(Calendar.MONTH)+1);
		//MONTH�� 0���� ���۵�. ���� ���� -1�� �ؾ� ��
		System.out.println("��"+birthDay.get(Calendar.DATE));
		System.out.println("��"+birthDay.get(Calendar.HOUR_OF_DAY));
		System.out.println("��"+birthDay.get(Calendar.MINUTE));
		System.out.println("��"+birthDay.get(Calendar.SECOND));
		
		int year = birthDay.get(Calendar.YEAR);
		int month = birthDay.get(Calendar.MONTH)+1;
		int date = birthDay.get(Calendar.DATE);
		System.out.println(year+"��"+month+"��"+date+"��");
		
		//TimeInMillis ������ ��¥�� longŸ������ ��ȯ
		System.out.println(new Date(birthDay.getTimeInMillis()));
		
		//���ϴ� ��¥ �����ϱ�
		//set�޼ҵ带 �̿��Ͽ� ��¥�� ������ �� ����
		
		birthDay.set(1993,7-1,8,11,35,15);
		System.out.println(new Date(birthDay.getTimeInMillis()));
		
		//GregorianCalendar
		GregorianCalendar gc = new GregorianCalendar(); //���糯¥
		System.out.println(gc);
		//��¥ ������ ����Ϸ��� get
		printDate(gc);
//		int year1 = gc.get(Calendar.YEAR);
//		int month1 = gc.get(Calendar.MONTH)+1;
//		int date1 = gc.get(Calendar.DATE); 
//		System.out.println(year1+"��"+month1+"��"+date1+"��");
		//Calendar ��ü������ ������¥�� ������ �� set�� �̿�
		gc = new GregorianCalendar(1993,(8-1),28);
//		year1 = gc.get(Calendar.YEAR);
//		month1 = gc.get(Calendar.MONTH)+1;
//		date1 = gc.get(Calendar.DATE);
//		date1++;
//		System.out.println(year1+"��"+month1+"��"+date1+"��");
		printDate(gc);
		
		//GregorianCalendar
		Date birth2 = new Date(gc.getTimeInMillis());
		System.out.println(birth2);
		//�� �ʵ��� ���� ����
		gc.set(Calendar.YEAR,2021);
		//gc.set(1,2021);
		gc.set(Calendar.MONTH,(9-1));
		printDate(gc);
		//YEAR, MONTH..�� ���ڿ��� ���ڷ� �ᵵ ������ �򰥸��� ����
		
		//��¥�� ���Ŀ� �°� ���������ֱ�
		//00�� 0�� 0��  / 0000�� 00�� 00��
		//00.00.00  / 00-00-00
		//SimpleDateFormat ��ü �̿�
		//text��Ű�� �ȿ� ����.
		//Date ��ü�� ���Ŀ� �°� ���ڿ��� ������ִ� ��ü. �Ű������� ���� �ֱ�
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		//SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd");
		SimpleDateFormat sdf = new SimpleDateFormat("yy�� MM�� dd�� E���� a HH:mm:ss");
		//�ð� 24�ð� ���� hh�� �⺻ 12��/HH�� 00�� / a�� ����, ����
		//String strDate = sdf.format(birth2); //�Ű����� �ڷ����� Date�� �ȴ�!!Calendar�� �׷������� �ȵ�
		String strDate = sdf.format(gc.getTimeInMillis());
		System.out.println(strDate);
		
		
		
	}
	
	private static void printDate(Calendar c) { //Ķ������ �θ𿩼� �׷����ȵ� �� �� ����
		int year1 = c.get(Calendar.YEAR);
		int month1 = c.get(Calendar.MONTH)+1;
		int date1 = c.get(Calendar.DATE); 
		System.out.println(year1+"��"+month1+"��"+date1+"��");
	}
}
