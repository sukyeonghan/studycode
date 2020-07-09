package com.basic.event;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AnnonyEvent {
	
	//익명클래스를 이용해서 이벤트 적용하기
	public static void main(String[] args) {
	
		AnnonyEvent an = new AnnonyEvent();
		
		JFrame f = new JFrame();
		
		f.setBounds(100,100,400,500);
		JPanel p = new JPanel();
		JButton btn = new JButton("이벤트 실습!");//컴포넌트 2개를 판넬에
		
		JLabel str = new JLabel();//컴포넌트 2개를 판넬에 
		p.add(btn);
		p.add(str);
		
		//버튼에 이벤트 연결하기
		btn.addMouseListener(new MouseListener() {//익명클래스
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				System.out.println("버튼 클릭함!!");
				
				str.setText("버튼 눌림!");
				System.out.println(e.getSource());
				//JButton btn = (JButton)e.getSource();
				btn.setText("버튼 클릭함");
				btn.setBackground(Color.blue);
				btn.setForeground(Color.white); //글자색 바꿈
				System.out.println(e.getX()+ " : "+e.getY());
				//컴포넌트 안에서 찍힌 위치를 반환
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				//눌렸을 때 특정 이벤트 발생시킬 때!
				System.out.println("마우스 눌림!");
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("마우스 나감!");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("마우스 들어옴!");
				JButton btn = (JButton)e.getSource();//이벤트가 발생한 객체가 넘어옴(버튼)
				btn.setBackground(Color.green);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("마우스 눌림해제!");
				JButton btn = (JButton)e.getSource();
				btn.setBackground(Color.DARK_GRAY);
			}
		});
		
		JTextField text = new JTextField(10);
		p.add(text);
		
		//외부 객체를 이용한 이벤트처리
		str.addMouseListener(new MouseEventHandler());
		
		
		//이벤트 연결하기
		//내부 이벤트 핸들러 클래스를 이용해서 처리
		text.addKeyListener(an.new TextEventHandler());
		//static이어서 이 클래스가 생성되어야 메소드를 쓸 수 있음
		
		f.add(p); //판넬을 프레임에 넣음
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	//이벤트 처리 내부 클래스!
	//클래스 안에 클래스 선언
	class TextEventHandler implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println("키보드 치고 있음");
			System.out.println(e.getKeyChar());
		}

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("키보드 누름");
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("키보드 뗌");
			
			//System.out.println(e.getKeyChar());//눌리는 키들을 볼 수 있음
			JTextField text = (JTextField)e.getSource();
			if(text.getText().length()>5) {
				System.out.println("문자 5개 이상 입력함!");
				
			}
			//e.isAltDown() alt 눌렀는 지 확인
			
		}
		
	}
	

}
