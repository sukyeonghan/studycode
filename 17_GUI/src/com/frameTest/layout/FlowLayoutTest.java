package com.frameTest.layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlowLayoutTest extends JFrame{

	public FlowLayoutTest() {
		
		setTitle("Flow 레이아웃");
		setBounds(100,100,400,500);
		
		//레이아웃 설정 - 3가지 정렬 방식
		//버튼 크기 지정되어 있음
		//setLayout(new FlowLayout()); 기본(default)이 중앙정렬
		//setLayout(new FlowLayout(FlowLayout.LEFT)); //왼쪽정렬
		setLayout(new FlowLayout(FlowLayout.RIGHT));//오른쪽정렬
		
		
		for(int i=0; i<20; i++) {
			if(i%2==0) add(new JButton(i+"번"));
			else add(new JLabel("빈자리       "));
		}//이렇게 하면 간격이 좀 벌어짐
		
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
