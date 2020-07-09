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
		
		setTitle("null ���̾ƿ�");
		setBounds(100,100,400,500);
		
		//null���̾ƿ� ����
		//�ϳ��ϳ� ���� �����ؾ���
		setLayout(null);
		
		JPanel p1 = new JPanel();//�ǳڿ��� ���̾ƿ� ��
		p1.setBounds(100,0,100,100);//�̸�,��ư �ִ�
		p1.setBackground(Color.MAGENTA);
		p1.setLayout(new BorderLayout());
		
		JPanel p2 = new JPanel();
		p2.setBackground(Color.CYAN);
		p2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p2.setBounds(200,0,100,100);//��ġ ���� �� �� �ǳڰ� �ٷ� ���� �ٵ��� ������
		for(int i=0; i<5; i++) {
			p2.add(new JLabel(i+"�� ����"));
		}
		
		
		JLabel name = new JLabel("�̸�");
		name.setSize(100,30);
		name.setLocation(50,50);
		
		JButton btn = new JButton("��ư");
		btn.setBounds(100,100,50,80);
		p1.add(name,"North");
		p1.add(btn,"South");
		
		//���ο� �ݵ�� �־�� ��
		add(p1);
		add(p2);
	
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
	}
}
