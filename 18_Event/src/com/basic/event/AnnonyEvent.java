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
	
	//�͸�Ŭ������ �̿��ؼ� �̺�Ʈ �����ϱ�
	public static void main(String[] args) {
	
		AnnonyEvent an = new AnnonyEvent();
		
		JFrame f = new JFrame();
		
		f.setBounds(100,100,400,500);
		JPanel p = new JPanel();
		JButton btn = new JButton("�̺�Ʈ �ǽ�!");//������Ʈ 2���� �ǳڿ�
		
		JLabel str = new JLabel();//������Ʈ 2���� �ǳڿ� 
		p.add(btn);
		p.add(str);
		
		//��ư�� �̺�Ʈ �����ϱ�
		btn.addMouseListener(new MouseListener() {//�͸�Ŭ����
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				System.out.println("��ư Ŭ����!!");
				
				str.setText("��ư ����!");
				System.out.println(e.getSource());
				//JButton btn = (JButton)e.getSource();
				btn.setText("��ư Ŭ����");
				btn.setBackground(Color.blue);
				btn.setForeground(Color.white); //���ڻ� �ٲ�
				System.out.println(e.getX()+ " : "+e.getY());
				//������Ʈ �ȿ��� ���� ��ġ�� ��ȯ
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				//������ �� Ư�� �̺�Ʈ �߻���ų ��!
				System.out.println("���콺 ����!");
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("���콺 ����!");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("���콺 ����!");
				JButton btn = (JButton)e.getSource();//�̺�Ʈ�� �߻��� ��ü�� �Ѿ��(��ư)
				btn.setBackground(Color.green);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("���콺 ��������!");
				JButton btn = (JButton)e.getSource();
				btn.setBackground(Color.DARK_GRAY);
			}
		});
		
		JTextField text = new JTextField(10);
		p.add(text);
		
		//�ܺ� ��ü�� �̿��� �̺�Ʈó��
		str.addMouseListener(new MouseEventHandler());
		
		
		//�̺�Ʈ �����ϱ�
		//���� �̺�Ʈ �ڵ鷯 Ŭ������ �̿��ؼ� ó��
		text.addKeyListener(an.new TextEventHandler());
		//static�̾ �� Ŭ������ �����Ǿ�� �޼ҵ带 �� �� ����
		
		f.add(p); //�ǳ��� �����ӿ� ����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	//�̺�Ʈ ó�� ���� Ŭ����!
	//Ŭ���� �ȿ� Ŭ���� ����
	class TextEventHandler implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println("Ű���� ġ�� ����");
			System.out.println(e.getKeyChar());
		}

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("Ű���� ����");
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("Ű���� ��");
			
			//System.out.println(e.getKeyChar());//������ Ű���� �� �� ����
			JTextField text = (JTextField)e.getSource();
			if(text.getText().length()>5) {
				System.out.println("���� 5�� �̻� �Է���!");
				
			}
			//e.isAltDown() alt ������ �� Ȯ��
			
		}
		
	}
	

}
