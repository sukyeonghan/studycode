package com.random;

import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {
		//임의 수 출력하는 랜덤 사용하기
		//Math클래스에 random() 메소드가 있음
		System.out.println((int)(Math.random()*10)+1); //한 번 실행할 때마다 실수 임의의 값(0.0~1.0사이) 나옴
		System.out.println((int)(Math.random()*10)+1); //그냥 int로 바꾸면 0이 나옴..()쳐서 먼저 계산 해야함. 형변환이 우선순위여서
		System.out.println((int)(Math.random()*10)+1); //1~10까지면 *10+1, 써져있는 거 n-1 까지, +1을 더하면 1~n까지의 수  
		System.out.println((int)(Math.random()*10)+1); //11까지면 0~10까지
		
	}

}
