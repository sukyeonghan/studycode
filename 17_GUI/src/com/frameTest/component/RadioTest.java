package com.frameTest.component;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioTest {
	
	public static void main(String[] args) {
	
		JFrame f = new JFrame("라디오버튼");
		
		f.setSize(300,150);//만드는 곳의 0,0 기준!
		
		JPanel top = new JPanel();
		JLabel title = new JLabel("어떤 크기를 원하세요?");
		top.add(title);
		
		f.add(top,"North");
		
		JPanel content = new JPanel();
		JRadioButton small = new JRadioButton("small");
		JRadioButton medium = new JRadioButton("medium");
		JRadioButton large = new JRadioButton("large");
		
		//버튼이 각각 다 눌러짐
		//->ButtonGroup으로 묶어줘야 함
		ButtonGroup size = new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		
		content.add(small);
		content.add(medium);
		content.add(large);
		
		//이미지 반영하기
		//이미지는 JLabel 이미 파일을 넣어서 구성
		
		JLabel imageLa = new JLabel(new ImageIcon("pang.jpg"));
		
		//ComboBox
		String[] names = {"유병승","설진호","조현","이세현","강경록"};
		JComboBox<String> com = new  JComboBox<String>(names);
		com.setSelectedIndex(3);//미리 ComboBox값 세팅할 수 있음
		
		content.add(com,"South");
		
		
		content.add(imageLa,"West");
		
		f.add(content,"Center");
		
		//동적으로 움직이게 하려면 이벤트를 걸어야 함
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
	

}
