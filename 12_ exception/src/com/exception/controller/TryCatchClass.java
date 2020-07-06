package com.exception.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TryCatchClass {
	
	public static void main(String[] args) {
		//try ~ catch �������� ����ó���ϱ�
		

		Scanner sc = new Scanner(System.in);
		//�Է¹��� ���ڿ��� 3��° ���� ����ϱ�
		for(int i=0; i<3; i++) {
			System.out.println("�����Է� : ");
			String name = sc.nextLine();
			try { //�� ���� �߻��ϴ� ������ ���� �ʾƵ� ��. 
				System.out.println(name.charAt(2));//���ܹ߻� ������ ����
				System.out.println("��� ���!"); //�������� �� ��� ���ϰ� �ǳ� ��. �ȳ��� ����
			} catch (StringIndexOutOfBoundsException e) { //�Ű�����-Exception�� ���� ������ ����
				//e.printStackTrace(); //���� ���� ���� ��. �̰� �� ���� ��� ���ư�����
				//a(); //�ٸ� �޼ҵ� ȣ�� ����. �ٸ� �������� �Ѿ ex)mainview
				return; //�� �̻� �������� ���� jvm���� ���ư� ����.
			} finally {//return�ص� ������ ����
				System.out.println("���α׷� ����"); //���� ���� �ȳ��� ������ ����Ǿ� �ϴ� ������ ���
			}
				System.out.println("��� ���!"); 
		}
		fileTry();
	}
	
	public static void fileTry() {
		
		File f = new File("test.txt");
		FileInputStream fis = null;//->�ۿ��ٰ� ���������� ����
		try { //�� ���� try���� �ȿ� ���� Exception�� �� �� �ִ�
			
			//FileInputStream fis = new FileInputStream(f);//��� �ݵ�� �ݾ���� ��. �����;��������� ����
			fis = new FileInputStream(f);
			//fis.close(); //��Ʈ�� �ݱ�. ���⿡ ���� �ǳʶپ������ �� ����!
			fis.read(); //������ �ҷ���. IOException;���� ó���ؾ� ��
			
		} catch(FileNotFoundException e) {
			
		} catch(IOException e) {
			//���ܸ��� 1���� catch�� ��� ��. catch���� ������ �߿�!
			//���⼭ catch�� ��ġ �ٲٸ� FileNotFoundException ��������� 
			//������ ���� �ͺ��� ū ������� �ۼ��ؾ� ��!
			//-> �� ��Ȳ���� ó���� �� ����
			//Exception �ϳ��� �� ó���� �� ����
			//-> �׷��� � Exception �߻��ߴ��� �˱� �����. �� �ʿ������ �̷��� �ص� ��
			
		}catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
//			if() {
//				
//			}

		} finally {//�� �ȿ����� ���� ó�� ����
			try {
			fis.close(); //try{}�ȿ� ������ ���� {}����� �� �� ����
			//�� ������ finally�� ��� �ݾ������ -> �׷��� ���°� trywithresourceTest()
			} catch(IOException e) {
				e.printStackTrace(); //� �������� Ȯ���ؾ��ϴϱ�
			}
		}
	}
	
	
	public static void trywithresourceTest() {
		//try with resource : ��ü�� ��ȯ(�����)����� �ϴ� ������ �ڵ����� �����ؼ� ó��
		//try{   }catch(����Ŭ���� e){   }finally{try..   } - �̷��� ����
		//try(��ȯ ��ü�� ����/����){   }catch(����Ŭ���� e){   } - ������ �˾Ƽ� ����
		
		File f = new File("test.txt");
		try(FileInputStream fis = new FileInputStream(f);
				BufferedInputStream bis = new BufferedInputStream(fis);) {
			
			bis.read();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
