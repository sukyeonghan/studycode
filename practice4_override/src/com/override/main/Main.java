package com.override.main;

import com.override.model.vo.Cat;
import com.override.model.vo.Chicken;
import com.override.model.vo.Lion;

public class Main {
	
	public static void main(String[] args) {
		//Animal을 상속받아
		//action()을 호출하면 각자 멘트 나오게 하기
		//출력, 생성 시 초기화시키기 
		
		Cat c = new Cat("두리","포유류",4);
		Lion l = new Lion("흥이","포유류",4);
		Chicken ch = new Chicken("처식이","조류",2);
		
		System.out.println(c.action());
		System.out.println(l.action());
		System.out.println(ch.action());
		
	}

}
