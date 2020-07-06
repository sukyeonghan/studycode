package com.filetest;

import java.io.File;
import java.io.IOException;

public class FileTest {
	
	public static void main(String[] args) {
		//�ڹٿ��� ������ �ٷﺸ��
		File f = new File("test.txt"); //�ڿ� ���ϸ� ����� ��. ���ϸ����� �� ram�� ��ü ����
		//���� ��ü�� ���� �� ��α��� �߰��ؼ� ������ �� ����(�߰� ���ϸ� ����Ʈ ����-������Ʈ ���� ��)
		//f = new File("c:/Users/han sujin/test/a/test.txt");
		
		//������ ���� ���� �� �־�� ��. ���� ������ ������ ������
		// ->�ڹٿ��� ������ �����ϰ� ���� �����ϸ� �� : mkdir,mkdirs(���� �� ���� ����)
		File dir = new File("c:/Users/han sujin/");
		if(!dir.exists()) System.out.println(dir.mkdirs());
		//-> ������ true�߸鼭 �������� 
		//if���� ���� �ϳ��� ���� �� {} �Ƚᵵ ��
		
		try {
			if(!f.exists()) {
				f.createNewFile();//���� �����
			}
			
		} catch(IOException e) {
			
			e.printStackTrace();//IO������Ʈ ���� �ȿ� ����. �ֿܼ��� ��� �ȵ�.
			
		} 
		
		System.out.println("������ ũ�� : "+f.length());
		System.out.println("��� Ȯ�� : "+f.getAbsolutePath());
		
		for(String file : dir.list()) {//���� ����� String�迭�� ����
		
			System.out.println("���ϵ� Ȯ���ϱ� : "+file);
		}
		
	}

}
