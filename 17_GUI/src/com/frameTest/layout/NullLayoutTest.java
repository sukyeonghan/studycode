package com.frameTest.layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NullLayoutTest extends JFrame {

	public NullLayoutTest() {
		
		setTitle("null 레이아웃");
		setBounds(100,100,400,500);
		
		//null레이아웃 설정
		//하나하나 직접 지정해야함
		setLayout(null);
		
		JPanel p1 = new JPanel();//판넬에도 레이아웃 들어감
		p1.setBounds(100,0,100,100);//이름,버튼 있는
		p1.setBackground(Color.MAGENTA);
		p1.setLayout(new BorderLayout());
		
		JPanel p2 = new JPanel();
		p2.setBackground(Color.CYAN);
		p2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p2.setBounds(200,0,100,100);//위치 정할 때 위 판넬과 바로 옆에 붙도록 설정함
		for(int i=0; i<5; i++) {
			p2.add(new JLabel(i+"번 조현"));
		}
		
		
		JLabel name = new JLabel("이름");
		name.setSize(100,30);
		name.setLocation(50,50);
		
		JButton btn = new JButton("버튼");
		btn.setBounds(100,100,50,80);
		p1.add(name,"North");
		p1.add(btn,"South");
		
		//메인에 반드시 넣어야 함
		add(p1);
		add(p2);
	
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
	}
}
