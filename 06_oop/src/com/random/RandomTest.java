package com.random;

import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {
		//���� �� ����ϴ� ���� ����ϱ�
		//MathŬ������ random() �޼ҵ尡 ����
		System.out.println((int)(Math.random()*10)+1); //�� �� ������ ������ �Ǽ� ������ ��(0.0~1.0����) ����
		System.out.println((int)(Math.random()*10)+1); //�׳� int�� �ٲٸ� 0�� ����..()�ļ� ���� ��� �ؾ���. ����ȯ�� �켱��������
		System.out.println((int)(Math.random()*10)+1); //1~10������ *10+1, �����ִ� �� n-1 ����, +1�� ���ϸ� 1~n������ ��  
		System.out.println((int)(Math.random()*10)+1); //11������ 0~10����
		
	}

}