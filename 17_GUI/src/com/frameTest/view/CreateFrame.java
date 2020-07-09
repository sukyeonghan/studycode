package com.frameTest.view;

import javax.swing.JFrame;

public class CreateFrame {
	
	public static void main(String[] args) {
	
		JFrame f = new JFrame();
		f.setBounds(100,200,200,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);//컴포넌트 다 추가하고 가장 마지막에 적기
	}
	

}
