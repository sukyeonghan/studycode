package com.abstracttest.controller;

import com.abstracttest.model.vo.Food;
import com.abstracttest.model.vo.IncludeAbstract;
import com.abstracttest.model.vo.IncludeImplements;
import com.abstracttest.model.vo.IncludeImplements2;
import com.abstracttest.model.vo.Recipe;
import com.abstracttest.model.vo.Test;

public class AbstractTestMain {
	public static void main(String[] args) {
		
		//abstract class 아닐 때
		//Food f = new Food("중식","짜장면","한국",1,0);
		//System.out.println(f);
		
		Test t = new Test("한식","돈까스","한국",1,5);
		System.out.println(t);
		
		System.out.println(t.getName());
		
		//추상클래스는 참조형 자료형으로 사용이 가능하다
		Food f = new Test();
		f=new Recipe();
		//Food 자료형의 변수에는Food 상속받은 객체반 대입가능
		//f=new String(); 안됨~
	
		((Recipe)f).cooking(); //이렇게 메소드 형변환해서 쓸 수 있다
		
		IncludeAbstract ia = new IncludeImplements();
		System.out.println(ia.calculator(10, 20));
		//동적바인딩! new IncludeImplements()가 ia에 들어가니까 
		
		ia = new IncludeImplements2();
		System.out.println(ia.calculator(10, 20));
		System.out.println(ia.getA());
		//ia에는 IncludeAbstract를 상속한 객체들만 들어갈 수 있다!
		
	}

}
