package com.frameTest.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MainFrame extends JFrame{

	
	public MainFrame() {
		//setBounds(200,200,100,100);//위치x,위치y,너비,길이
		setSize(400,300); //크기만. 위치는 0,0기본
		setLocation(300,300); //위치만
		
		//프레임에 제목 설정
		setTitle("나의 첫 Frame!");
		
		//프레임 아이콘 설정
		//그림 다운받아서 파일 설정
		try {
			setIconImage(ImageIO.read(new File("pang.jpg")));
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//프레임의 크기를 고정하기
		setResizable(false);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}
}
