package kh.java.operator;

import java.util.Scanner;

public class TestOperator {
	
	Scanner sc=new Scanner(System.in);
	
	public void test1 () {
		//3�ڸ� �̻��� ���ڸ� �Է� �޾� ���� �ڸ� ���ϸ� ������ �ڵ� �ۼ��ϱ�
		
		System.out.print("���� �Է� : ");
		int su1=sc.nextInt();
		System.out.println((su1/100)*100);
	}
	
	public void test2 () {
		//�� ������ ����, �� ���� �ٱ��Ͽ� ���� ������ ������ �Է¹޾�
		//������ ��� �������� �� ���� �ٱ��ϰ� �ʿ�������
		//������ �ٱ��Ͽ� ���� ������ �� Ȯ���ϴ� �ڵ� �ۼ��ϱ�
		
		System.out.print("���� ���� :");
		int su3=sc.nextInt();
		System.out.print("�ٱ��� ���� �� :");
		int su4=sc.nextInt();
		int result1=su3/su4+(su3%su4>0?1:0);
		System.out.printf("%d�� ������ �������� %d���� �ʿ��մϴ�.",su3,result1);
		System.out.println("������ �ٱ��Ͽ� ���� ������ �� :"+su3%su4);
		
	}
	
	public void test3 () {
		//���� �ϳ��� ���ڸ� �Է��Ͽ� �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� �����ϱ�
		
		System.out.print("���� �Է� : ");
		char str1=sc.nextLine().charAt(0);
		System.out.println('A'<=str1&&str1<='Z'?(char)(str1+32):('a'<=str1&&str1<='z'?(char)(str1-32):str1));
		
	}
	
}
