package com.oop.method;

import java.util.Scanner;

public class StaticMethod {
	
	private static String value="abcde";
	

	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticMethod.value = value;
	}
	
	public static void toUpper() {
		String result =value.toUpperCase();
		System.out.println(result);
	}
	
	public static void setChar(int index,char str) {
		
		StringBuilder sb = new StringBuilder(value);
		sb.setCharAt(index,str);
		System.out.println(sb);
		
	}
	
	public static int valueLength() {
		int num = value.length();
		return num;
	}
	
	public static String valueConcat(String str3) {
		String result = value+str3;
		return result;
		
	}

}
