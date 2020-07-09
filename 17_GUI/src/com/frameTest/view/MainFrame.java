package com.frameTest.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MainFrame extends JFrame{

	
	public MainFrame() {
		//setBounds(200,200,100,100);//��ġx,��ġy,�ʺ�,����
		setSize(400,300); //ũ�⸸. ��ġ�� 0,0�⺻
		setLocation(300,300); //��ġ��
		
		//�����ӿ� ���� ����
		setTitle("���� ù Frame!");
		
		//������ ������ ����
		//�׸� �ٿ�޾Ƽ� ���� ����
		try {
			setIconImage(ImageIO.read(new File("pang.jpg")));
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//�������� ũ�⸦ �����ϱ�
		setResizable(false);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}
}
