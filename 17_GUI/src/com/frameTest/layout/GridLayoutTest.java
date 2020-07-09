package com.frameTest.layout;

import java.awt.GridLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest extends JFrame{
	
	public GridLayoutTest() {
		
		setTitle("GridLayout");
		setBounds(100,100,500,800);
		//레이아웃 설정
		//그리드 레이아웃 - 바둑판식으로 배치
		setLayout(new GridLayout(5,5));
		//setLayout(new GridLayout(5,5,10,10));
		//뒤에 추가하면 칸 위치를 떨어뜨려 놓음
		
		//지정된 범위에 맞지 않게 쓴다면
		//row(세로)는 무조건 고정! 가로는 컴포넌트 따라서 조정됨
//		for(int i=0; i<15; i++) {
//			add(new JButton(i+"번"));
//		}
//		
		
		
		//빙고판 만들기.중복되지 않게
		
		Set number = new HashSet();
		
		while(number.size()!=25) {
		
			number.add(String.valueOf((int)(Math.random()*25)+1));
		} //숫자여서 자동 순서정렬을 해버려서 스트링으로 받음
		
		Iterator<Integer> it = number.iterator();
		for(int i=0; i<25; i++) {
			this.add(new JButton(String.valueOf(it.next())));
		}
	
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

}
