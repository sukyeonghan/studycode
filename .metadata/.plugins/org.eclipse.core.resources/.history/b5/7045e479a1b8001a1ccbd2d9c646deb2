package com.objerr.main;

import com.object.model.vo.Nation;

public class Main {
	
	public static void main(String[] args) {
		
		//객체 배열 사용하기
		//객체 배열 선언하기
		Nation[] nations;
		//배열 할당 -> 저장공간확보하기
		nations=new Nation[3];
		//주의!
		//System.out.println(nations[0].getName());//에러남
		//초기값 null. 주소값 없음. 변수 집어넣기 전에 접근해서
		
		//index 이용하여 배열에 객체 넣기
		//Nation이라는 자료형을 갖는 주소를 넣어야 함
		//nations[0] 하나의 변수명이라고 보면 됨
		nations[0]=new Nation("한국",6000,"한국어",100,"무궁화");
		//Nation n = new Nation("한국",6000,"한국어",100,"무궁화"); 같음
		//n.getName(); 해서 불러왔었음
		nations[1]=new Nation("미국",30000,"영어",10000,"장미");
		nations[2]=new Nation("중국",150000,"중국어",10000,"매화");
		
		//배열에 저장된 객체 불러오기
		System.out.println(nations[0].getName());
		
		//for문 이용한 초기화 방법
		Nation[] nations2 = new Nation[10];
		
		for(int i=0; i<nations2.length; i++) {
			nations2[i] = new Nation(); //default로 초기화 됨
		}
		for(int i=0; i<nations2.length; i++) {
			System.out.println(nations2[i]);
		}
		
		//객체 배열은 for each문 사용이 가능한가??
		for(Nation n : nations) {
			System.out.println(n.getName());
		}
		
		
		//객체 배열 선언과 동시에 초기화. 객체가 다 정해져있지 않는 이상 잘 안씀
		nations2 = new Nation[] { new Nation(), new Nation()};
		Nation[] n = {new Nation(), new Nation(), new Nation()};
		
		//배열의 특성 다 가지고 있음. 쓰는 방식은 객체 쓰는 법처럼
	
	}
}
