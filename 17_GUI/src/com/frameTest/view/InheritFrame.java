package com.frameTest.view;

import javax.swing.JFrame;

public class InheritFrame extends JFrame{
	
	public InheritFrame() { //기본생성자
		//프레임이나 기본 container를 상속한 클래스는 
		//생성자에서 모든 설정을 지정함.
		
		//프레임 기본 설정 3가지
		//1.프레임 위치, 크기 설정 -> setBounds();
		setBounds(100,100,800,1000);//setBounds는 JFrame거
		//앞 2개가 위치(x,y). 위치 값 기준은 좌측 상단. 왼 맨 위가 0,0
		//그 다음 넓이(가로width),길이(세로height)
		
		//2.창을 닫는 이벤트 설정 -> setDefaultCloseOperation
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//원래 이렇게 써야함. JFrame.EXIT_ON_CLOSE 상속이여서 생략가능

		//3.프레임객체는 기본적으로 안보이게 설정 되어 있음
		//setVisible() 보이게 설정하기
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		new InheritFrame(); //프레임 하나가 생성!
		
	}

}
