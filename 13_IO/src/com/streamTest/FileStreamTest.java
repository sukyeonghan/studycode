package com.streamTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStreamTest {
	//������ �������Ϸ� ���(����)�ϱ�
	public void outputStream(String data) {
		//RAM -> file �� �̵���Ű��/�����͸� ���Ӽ��ְ� �����ϱ� ���ؼ�
		//1. �����͸� �ű� ��ġ ����(file) -> file ��ü ����
		//2. file�� Stream ���� -> OutputStream��ü ����
			//ram�� �ִ� �� file�� �ű�� ���� �������(stream)�ʿ�
		//3. �޼ҵ带 ���ؼ� data�� ������ -> Write();
		//4. OutputStream ��ȯ -> close();
		
		File saveFile = new File("data.bs");//Ȯ���ڸ� �������
		//byte�� �����͸� �ְ�޴� FileOutputStream �� ����غ���
		FileOutputStream fos = null; 
		//checkedException���� �ݵ�� ����ó���� ����� ��.
		
		try {
			fos = new FileOutputStream(saveFile); 
			//Stream�� ���鼭 �Ű������� ���� ���ϰ�ü�� ��������. ���� ����!
			//�׸��� ���� ���� ������  ������. 
			//fos.write("123456".getBytes());
			//���ڿ��� ����Ʈ�� �ٲ㼭 1byte�� �Ѱ���
			
			//�ܺο��� ���޹��� ���� file�� �����ϱ�
			fos.write(data.getBytes());
			
			//fos.write("funtion test(){alert('����');}".getBytes());
			//���� �� ���� ����. ���� ������ �� ���ϰ� ������
		} catch(IOException e) {
			
			e.printStackTrace();
		
		} finally { //close ���ϸ�...
			if(fos!=null) {
				try {
					fos.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	public void InputStreamTest() {
		//file�� ����� ������ �о����
		//InputStream�� ����ϰ� ��
		//1. file�� ���� -> File��ü
		//2. FileInputStream�� ������
		//3. read()�޼ҵ�� �����͸� �о� ��
		//4. Stream �ݱ�
		
		File load = new File("data.bs");
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(load);
			//���� �о�� ���� read�� �о� ��
			//byte������ data�� �о���� ������ ��ü �����͸� ��������
			//date�� ������ ���� ������ �ݺ����� ����Ͽ� �޾ƿ� 
			int value = 0;//byte����ó��. �ƽ�Ű�ڵ� ��Ģ
			
			StringBuffer sb = new StringBuffer();
			
			while((value=fis.read())!=-1) {
				//-1�� ���ذ��� file�� �� �̻� �о� �� �����Ͱ� ���� ��� ��ȯ
				// -> ������ �� �о��ٴ� �ǹ�
				sb.append((char)value); //�ڿ� ���ڿ� �߰�
				
			}
			
			System.out.println(sb);
			
		} catch(IOException e) {
			e.printStackTrace();
			
		} finally {
			if(fis!= null) {
				try {
					fis.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	
	//���ڿ� ���� ��Ʈ��
	//Writer / Reader
	
	public void writerTest() {
		//1. file ����
		//2. Stream ����
		//3. ������ ���� -> write
		//4. ��Ʈ�� ��ȯ
		
		File f = new File("strData.bs");
		//try with resource �� ����
		try(FileWriter fw = new FileWriter(f);) {
			String msg = "���� �ʹ�";
			fw.write(msg);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//���Ͽ� ����� ���ڿ� ������ �ҷ�����
	public void readerTest() {
		//1. ���� ���� -> File
		//2. Stream ���� ->FileReader
		//3. ���� �ҷ����� -> read();
		//4. ��Ʈ����ȯ -> close();
		
		File f = new File("strData.bs");
		
		try(FileReader fr = new FileReader(f)) {
			
			int value = 0;
			String msg="";
			while((value=fr.read())!=-1) {
				//System.out.println((char)value);
				msg+=(char)value;
			}
			
			System.out.println(msg);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
