package com.abstracttest.model.vo;

public class IncludeImplements extends IncludeAbstract {
	
	//상속한 객체에 추상메소드가 있으면 반드시 Override 해줘야 함
	//안해주면 사용을 못하게 됨
	@Override
	public double calculator(int su, int su2) {
		return su/(double)su2;
	}
	
	

}
