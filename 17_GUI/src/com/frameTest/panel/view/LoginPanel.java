package com.frameTest.panel.view;

import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel extends JPanel {//자체가 하나의 판넬
	
	public LoginPanel() {
		
		setLayout(null);
		setSize(300,200);
		
		JLabel id = new JLabel("아이디 : "); 
		id.setSize(80,40);
		id.setLocation(10,20);
		
		JTextField idInput = new JTextField(10);//텍스트 박스/ 네모 박스 안에 텍스트 넣음
		idInput.setSize(100,40);
		idInput.setLocation(90,20);
		
		JLabel pw = new JLabel("비밀번호 : ");
		pw.setSize(80,40);
		pw.setLocation(10,60);
		
		JPasswordField pwInput = new JPasswordField(10);
		pwInput.setSize(100,40);
		pwInput.setLocation(90,60);
		
		
		JButton btn = new JButton("로그인");
		btn.setSize(100,40);
		btn.setLocation(190,60);
		
		add(id);
		add(idInput);
		add(pw);
		add(pwInput);
		add(btn);
		
		
	}
	

}
