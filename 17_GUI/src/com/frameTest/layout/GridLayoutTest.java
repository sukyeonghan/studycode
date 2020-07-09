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
		//���̾ƿ� ����
		//�׸��� ���̾ƿ� - �ٵ��ǽ����� ��ġ
		setLayout(new GridLayout(5,5));
		//setLayout(new GridLayout(5,5,10,10));
		//�ڿ� �߰��ϸ� ĭ ��ġ�� ����߷� ����
		
		//������ ������ ���� �ʰ� ���ٸ�
		//row(����)�� ������ ����! ���δ� ������Ʈ ���� ������
//		for(int i=0; i<15; i++) {
//			add(new JButton(i+"��"));
//		}
//		
		
		
		//������ �����.�ߺ����� �ʰ�
		
		Set number = new HashSet();
		
		while(number.size()!=25) {
		
			number.add(String.valueOf((int)(Math.random()*25)+1));
		} //���ڿ��� �ڵ� ���������� �ع����� ��Ʈ������ ����
		
		Iterator<Integer> it = number.iterator();
		for(int i=0; i<25; i++) {
			this.add(new JButton(String.valueOf(it.next())));
		}
	
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

}
