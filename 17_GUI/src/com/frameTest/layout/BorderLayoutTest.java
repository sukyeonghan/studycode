package com.frameTest.layout;


import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.frameTest.panel.view.LoginPanel;

public class BorderLayoutTest extends JFrame{
	

	public BorderLayoutTest() {
		
		setTitle("border���̾ƿ�");
		setBounds(100,100,800,500);
		
		//���̾ƿ� �����ϱ�. ��ü ����
		setLayout(new BorderLayout());
		//���̾ƿ��� �������� ������ �⺻���� BorderLayout�� ������
		
		//���̾ƿ��� ������Ʈ ��ġ�� �����ϴ� ��. �׳� ����ϸ� �ƹ� ��ȭ ����
		JButton btn = new JButton("����");
		JButton btn1 = new JButton("������");
		JButton btn2 = new JButton("��");
		JButton btn3 = new JButton("�Ʒ�");
		JButton btn4 = new JButton("�߾�");
		
		//������ ������Ʈ�� BorderLayout�� ���� ��ġ�ϱ�
		//ũ�� ���� ����. �����Ǿ� ����
		add(btn,"West"); //ù ���� �빮��.��Ī �ùٸ��� �����.�����Ǿ�����.
		add(btn1,"East");
		add(btn2,"North");
		add(btn3,"South");
		//add(btn4,"Center");
		
		//�α��� 
		add(new LoginPanel(),"Center");
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
