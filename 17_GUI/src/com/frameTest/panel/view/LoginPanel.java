package com.frameTest.panel.view;

import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel extends JPanel {//��ü�� �ϳ��� �ǳ�
	
	public LoginPanel() {
		
		setLayout(null);
		setSize(300,200);
		
		JLabel id = new JLabel("���̵� : "); 
		id.setSize(80,40);
		id.setLocation(10,20);
		
		JTextField idInput = new JTextField(10);//�ؽ�Ʈ �ڽ�/ �׸� �ڽ� �ȿ� �ؽ�Ʈ ����
		idInput.setSize(100,40);
		idInput.setLocation(90,20);
		
		JLabel pw = new JLabel("��й�ȣ : ");
		pw.setSize(80,40);
		pw.setLocation(10,60);
		
		JPasswordField pwInput = new JPasswordField(10);
		pwInput.setSize(100,40);
		pwInput.setLocation(90,60);
		
		
		JButton btn = new JButton("�α���");
		btn.setSize(100,40);
		btn.setLocation(190,60);
		
		add(id);
		add(idInput);
		add(pw);
		add(pwInput);
		add(btn);
		
		
	}
	

}
