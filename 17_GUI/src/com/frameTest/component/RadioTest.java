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
	
		JFrame f = new JFrame("������ư");
		
		f.setSize(300,150);//����� ���� 0,0 ����!
		
		JPanel top = new JPanel();
		JLabel title = new JLabel("� ũ�⸦ ���ϼ���?");
		top.add(title);
		
		f.add(top,"North");
		
		JPanel content = new JPanel();
		JRadioButton small = new JRadioButton("small");
		JRadioButton medium = new JRadioButton("medium");
		JRadioButton large = new JRadioButton("large");
		
		//��ư�� ���� �� ������
		//->ButtonGroup���� ������� ��
		ButtonGroup size = new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		
		content.add(small);
		content.add(medium);
		content.add(large);
		
		//�̹��� �ݿ��ϱ�
		//�̹����� JLabel �̹� ������ �־ ����
		
		JLabel imageLa = new JLabel(new ImageIcon("pang.jpg"));
		
		//ComboBox
		String[] names = {"������","����ȣ","����","�̼���","�����"};
		JComboBox<String> com = new  JComboBox<String>(names);
		com.setSelectedIndex(3);//�̸� ComboBox�� ������ �� ����
		
		content.add(com,"South");
		
		
		content.add(imageLa,"West");
		
		f.add(content,"Center");
		
		//�������� �����̰� �Ϸ��� �̺�Ʈ�� �ɾ�� ��
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
	

}
