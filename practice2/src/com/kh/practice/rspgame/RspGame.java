package com.kh.practice.rspgame;

import java.util.Scanner;

public class RspGame {

	public static void main(String[] args) {
		//���������� ���� �����
		//�ָ� ���� ���� �Է¹޾Ƽ� ���� �� �� �� ����
		//�� ���� �̱�� �����ϱ�
		//���� ��� ����ϱ� ---while true break
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== ����, ����, �� ����! ===");
		
		while(true) {
			
			System.out.println("1.���� 2.����  3.�� (��ȣ�� �Է��ϼ���)");
			int user = sc.nextInt();
			
			int com = (int)(Math.random()*3)+1;
	
			//��� �� ���ڰ� �ƴ� "����/����/��"�� �ϰ� �; �߰��� 
			String userstr=intToStr(user);
			String comstr=intToStr(com);
			
			
//			if(com==1) {
//				comstr="����";
//			} else if(com==2) {
//				comstr="����";
//			} else {
//				comstr="��";
//			}
//			
//			if(user==1) {
//				userstr="����";
//			} else if(user==2) {
//				userstr="����";
//			} else {
//				userstr="��";
//			}
			
			System.out.println("��ǻ�� : "+comstr);
			System.out.println("����� : "+userstr);
			
			
			int game = user-com;
			
				if(game==-2||game==1) {
					System.out.println("����ڰ� �̰���ϴ�.");
					break;
				} else if(game==2||game==-1) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
					break;
				} else {
					System.out.println("�����ϴ�. �ٽ� �� ��,\n");
				}
			
			} 		
	}
	
	public static String intToStr(int num) {
		//�ζ� ��ȣ �ڵ� ������ (�ߺ��� ���� ������������ ����)���α׷� �ۼ��ϱ�
		String str = "";
		
		switch (num) {
			case 1:
				str = "����";
				break;
			case 2:
				str = "����";
				break;
			case 3:
				str = "��";
		}
		return str;
	}

}