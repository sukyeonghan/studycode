package com.io.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StreamTest {
	//����ڿ��� �޼����� �Է¹ް� (0 ���� ������) 
	//�� �޼����� ����޼ҵ忡 �����Ͽ� �����ϱ�
	
	public String saveMsgData(String msg, String fname) {//������ �����Ϳ� ���� �̸��� �Է¹ޱ�
		//�����͸� �޾Ƽ� ���� ����
		//ȣ���ϸ� �˷��ٰ�,����Ǹ� �˷��ٰ� ->�޼��� ��ȯ
		//File f = new File("msg.data");
		//���ϸ� ����
		File f = new File(fname);
		
		String returnMsg = "���������� ó���Ǿ����ϴ�.";
		
		try(FileWriter fw = new FileWriter(f)) {
			
			fw.write(msg);//�����͸� file�� ����
			
		} catch(IOException e) {//�Ű�������  Exception ���� ���
			e.printStackTrace();
			returnMsg="���������� ó������ �ʾҽ��ϴ�. �ٽ� �õ��ϼ���.";
		}
		
		return returnMsg;
	}
	
	//���ϴ� ���ϸ� �˻��ؼ� ��ȯ
	public String loadMsgData(String fname) {
		
		//File f = new File("msg.data");
		//try(FileReader fr = new FileReader(f)) {
		
		String result ="";
		
		try(FileReader fr = new FileReader(fname)) {
			
			int value = 0;
			
			while((value=fr.read())!=-1) {
				result+=(char)value;
			}
			
			} catch (IOException e) {
				e.printStackTrace();
				result ="������ �ҷ����µ� ������ �߻��߽��ϴ�.";
		}
		return result;
	} 
	
}
