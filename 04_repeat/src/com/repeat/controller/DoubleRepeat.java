package com.repeat.controller;

import java.util.Scanner;

public class DoubleRepeat {
	
	public void doubleRepeatTest() {
		//중첩반복문
		//한 개 고정하고 돌리기
		//순서정렬, 중복값 찾기
		
		//구구단 출력하기
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i+ "X" + j +"=" + (i*j));
			}
		}
		
		//옆으로 구구단 출력하고
		//다른 단으로 넘어가면 밑줄에 출력하기
		for(int i=2; i<10; i++) {
			System.out.println(i + "단");
			for(int j=1; j<10; j++) {
				System.out.print(i+ "X" + j +"=" + (i*j) + " ");
			} //내곽은 열을 관리한다
			System.out.println(); //외곽은 행을 관리한다
		}
		
		//1234
		//1234
		//1234 처럼 출력하기
		for(int i=0; i<4; i++) {
			for(int j=1; j<=4; j++) {
				System.out.print(j +" ");
		}System.out.println();
	}
		
		//123
		//456
		//789 처럼 출력하기
//		for(int i = 0; i<1; i++) {
//			for(int j= 1; j<=3; j++) {
//				System.out.print(j+" ");
//			} System.out.println();
//			for(int j= 4; j<=6; j++) {
//				System.out.print(j+" ");
//			} System.out.println();
//			for(int j= 7; j<=9; j++) {
//				System.out.print(j+" ");
//			} System.out.println();
//		}
//	
		int su=1;
		for(int i =0; i<3; i++) {
			for(int j=0;j<3;j++) {
				System.out.print((su++) +" ");
			}
			System.out.println();
		}
		
		//987
		//654
		//321
		int su1 = 9;
		for(int i =0; i<3; i++) { //3번 반복 출력
			for(int j=0; j<3; j++) { //3번 반복 출력
				System.out.print(su1-- + " ");//옆으로 출력
			}
			System.out.println();//아래로 줄바꿈
		}
		
		//이중반복문을 이용하여 중복값찾기
		
	
		//a : 0
		//p : 1
		//p : 1
		//l : 0
		//e : 0
		
		String msg="apple";
	
		
		for(int i = 0; i<5; i++) {
			int count =0; //for문이 끝났을 때 이전 count를 0처리 해야함.
			//밖으로 나와 있으면 이전 카운트가 누적이 됨..
			//System.out.println(msg.charAt(i));//0,1,2,3,4 체크
			for(int j=0;j<5;j++) {
				if (i!=j && msg.charAt(i) == msg.charAt(j)) {
					//true면 똑같은 값이 있다
					count++;//1증가. 개수세는 것.count=count+1
				}
//				System.out.println(i+" : "+j);
//				System.out.println(msg.charAt(i)+" : "+msg.charAt(j));
			}
			
			System.out.println(msg.charAt(i)+" : "+count);
			//count =0; 
			}
			

		}
	
	public void breakTest() {
		//break문 활용하기
		for(int i=0; ; i++) {
			System.out.println (i);
			if(i==200) {
				break;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		String msg="";
		//무한 반복되는 메뉴를 종료시킬 때
		while(true) {
			System.out.print("값입력 : ");
			String temp = sc.nextLine();
			if(temp.equals("끝")) {
				break;
			} else {
				msg+=temp;
			}
		}
		
		//중첩반복문에서 break문 사용하기
		dinner:
		for(int i =2; i<9; i++) {
//			if(i%2==1) {
//			break;
//		}
		//여기 있으면 2단까지 출력
			for(int j=1; j<10; j++) {
				System.out.println(i+"X"+j+"="+i*j);
				if(i%2==1) {
					break dinner; //dinner(라벨)붙이면 아예 종료시킴
					//여기 있으면 가장 가까운for문을 종료함..
					//홀수는 x1까지만 출력하고 break됨
				}
			}
//			if(i%2==1) {
//				break;
			//여기 있으면 3단까지 출력
		}
		
		//continue문
		//로직에서 continue문을 만나면 continue문 아래있는 로직을 실행하지 않고
		//증가 연산으로 바로 가서 실행함. 
		
		for(int i =0; i<10; i++) {
			if(i%2==0) {
				continue; // 이 라인이 컨티뉴문.짝수가 나오면 밑에 무시하고 증가연산으로 올라감
			}
			System.out.println(i);
		}
		
		
		
	}
	//배열
	//heap영역에 주소값 생성(new를 통해)
	//선언하고 반드시 할당이 필요!!
	//배열은 시작이 0이다! 주의
	//int[] arr=new int[4]
	//4개 저장공간 생겨서 번호0~3 -> arr[0],arr[1],arr[2],arr[3]	
		
	}

