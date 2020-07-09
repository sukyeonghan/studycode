package com.frameTest.layout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class CardLayoutTest extends JFrame{
	
	public CardLayoutTest() {
		
		setTitle("cardLayout");
		setBounds(100,100,200,200);
		
		//cardLayout설정하기
		CardLayout card = new CardLayout();
		setLayout(card); 
		//생성해서 조작해야 하므로 이렇게 생성함. 가지고 있는 판넬들을 계속 바꾸면서 처리함
		
		JPanel card1 = new JPanel();//컨테이너 같은 컴포넌트
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();
		
		card1.setBackground(Color.red);//배경색
		card2.setBackground(Color.black);
		card3.setBackground(new Color(255,0,255));
		//RGB 0~255범위/ 빨강-초록-파랑 / 네이버 색상팔레트 참고
		
		card1.add(new JLabel("card1"));
		card2.add(new JLabel("card2"));
		card3.add(new JLabel("card3"));
		
		
		
		JButton btn = new JButton("크기 조절!");
		btn.setSize(300,300);//버튼 크기 반영하지 않는다
		btn.setLocation(20,20);//위치도 마찬가지
		
		card1.add(btn);
		
		
		//누르면 색 바뀜
		card1.addMouseListener(new MouseAdapter() {
		
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton()==1) {
					card.next(card1.getParent());
				}
			}
			
		});
		
		card2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton()==1) {
					card.next(card2.getParent());
				}
			}
			
		});
		
		card3.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton()==1) {
					card.next(card3.getParent());
				}
			}
			
		});
		
		//프레임에 판넬 추가하기
		add(card1);
		add(card2);
		add(card3);
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
